 class employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
    class phone {
        
        public void ringing(){
            System.out.println("ringing.....");
        }
        public void vibreting(){
            System.out.println("vibreting....,,");
        }
        public void calling(){
            System.out.println("calling a rajjjjj...");
        }
    }

    class circle{
        public float circle(int x){
            return 3.14f*x*x;
        }
    }

    class triangle{
        public float triangle(float hight , float base){
            return 0.5f*hight*base;
        }
    }


    public class practice_set3 {
    
    public static void main(String[] args) {
        // problem : 1
        // employee sanket = new employee();
        // sanket.salary = 1000000;
        // sanket.setName("SanketVekariya");
        // System.out.println(sanket.getName());
        // System.out.println(sanket.getSalary());

        // problem : 2 create class for ringing vibreting calling  
         phone ph= new phone();
         ph.ringing();
         ph.calling();
         ph.vibreting();

        //  problem : 4 find the AREA of circle using oop
        circle cr = new circle();
        System.out.println("the area of circle is :  ");
        System.out.println(cr.circle(10));

        // problem : 5 find AREA of triangle using oop
        triangle tr = new triangle();
        System.out.println("the area of triangle is: ");
        System.out.println(tr.triangle(45, 45));
     }
    }

