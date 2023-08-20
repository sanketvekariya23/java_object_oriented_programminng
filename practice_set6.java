 
// class Circle{

//     Circle(int q){
//         System.out.println("i am Cinstroctor of cirlce");
//         this.redius = q;
//     }

//     public float redius;
//     public double area_circle(){
//         return Math.PI*redius*redius;
//     }
// }
// class Cylinder extends Circle{
//     public float height;

//     Cylinder(int h){
//         super(q);
//         this.height = h;
//         System.out.println("i am constructor of cylinder class");
//     }

//     public double volume_cylinder(){
//         return Math.PI*redius*redius*height;
//     }
    
// }

class rectangle{
    private int height;
    private int base;
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public void setbase(int base){
        this.base = base;
    }
    public int getBase(){
        return base;
    }
    public float area_rectangle(int height,int base){
        return 0.5f*height*base ;
    }
}

public class practice_set6 {
    public static void main(String[] args) {
        // problem :1 
        // create class circle and use inhertitance to create another class cylinder form it.

        // Circle cr = new Circle(12);
        // Cylinder cl = new Cylinder(120);

        // problem:2
        // create class rectangle and create another class cuboid find aera and volume 
        // using getter and setter
         rectangle rac = new rectangle();
         rac.setHeight(0112);
         rac.setbase(15);
        System.out.println(rac.area_rectangle(12,15));
        }
    }
