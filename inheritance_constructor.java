 class base1{
    int x;
    base1(){
        System.out.println("i am base class constructor!");
    }
    base1(int x){
        System.out.println(" i am overloaded base class constructor");
    }
}
class derived1 extends base1{
    int y;
    derived1(){
        System.out.println(" i am derived  class constructor");
    }
    derived1(int x, int y){
        super(x);
        System.out.println(" i am overloaded derived class constructor");
    }
}
class childOfdireved extends derived1{
    int z;
    childOfdireved(){
        System.out.println(" i am childOfdireved class constructor");
    }
    childOfdireved(int x, int y, int z){
        super(x,y);
        System.out.println("i am overloaded childOfderived class constructor");
    }
}
public class inheritance_constructor {
    public static void main(String[] args) {
        // inheritance in constructor
        // base1 b = new base1();
        // base1 b1 = new base1(10);
        // derived1 d = new derived1();
        // derived1 d1 = new derived1(10,20);
        childOfdireved cd = new childOfdireved();
        childOfdireved cd1 = new childOfdireved(10,20,30);

    }
}
