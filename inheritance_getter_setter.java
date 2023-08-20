 class base{
    int x;
    int getX(){
        return x;
    }
     void setX(int x){
        System.out.println(" i am base class getter & setter");
        this.x=x;
     }
}
class derived extends base{
    int y;
    int getY(){
        return y;
    }
    void setY(int y){
        System.out.println(" i am derived class getter and setter");
        this.y=y;
    }
 }

 class inheritance_getter_setter{
    public static void main(String[] args) {
        // inheritance a concept or property acuires one class to 
        // onther extend class
        // inheritance for getter and setter 
        base b = new base();
        b.setX(10);
        b.getX();
        derived d= new derived();
        d.setY(9);
        d.getY();
    }
}