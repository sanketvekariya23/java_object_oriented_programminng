 
class circle1{
    private float r ;
    public float getReduce(){
        return 3.14f*r*r;
    }
    public void setReduce(int x){
        r=x;
    }
}

public class circle_gettere_setter {
    public static void main(String[] args) {
        // problem find the area of     CIRCLE  using   GATTER AND SATTER
    circle1 cr= new circle1();
        cr.setReduce(12);
        System.out.println(cr.getReduce());
    }

}
