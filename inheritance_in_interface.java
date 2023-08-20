interface sample{
    void math1();
    void math2();
}
interface childsample extends sample{
    void math2();
    void math3();
}
class Mysampleclass implements childsample{
    public void math1(){
        System.out.println("math1 ");
    } public void math2(){
        System.out.println("math2 ");
    } public void math3(){
        System.out.println("math3 ");
    } public void math4(){
        System.out.println("math4 ");
    }
}
public class inheritance_in_interface {
    public static void main(String[] args) {
        // we can extend one interface to another interface
        Mysampleclass ms = new Mysampleclass();
        ms.math1();
        ms.math2();
        ms.math3();
        ms.math4();

    }
}
