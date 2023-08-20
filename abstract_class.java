abstract class parent{
    parent(){
        System.out.println("i am constructor of parent class");
    }
    public void sayHello(){
        System.out.println("hi....!");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child extends parent{
   @Override
    public void greet(){
        System.out.println("good morning");
    }
    @Override
    public void greet2(){
        System.out.println("good afternoon");
    }
    public void negotiation(){
        System.out.println("deal is final !");
    }
}
 abstract class child2 extends parent{

    public void sanket(){
        System.out.println("i am sanket vekariya");
    }
}
class abstract_class{
    public static void main (String[] args){
        // abstract clss : we can not create object of abstract class .
        // but we can create object of child class which is extend from abstract
        // class .
        // if any abstract class is contain methods and child class is
        // extend from extend class then either must be create child class as 
        // abstract class or define all method which is contain abstract class.
         child ch = new child();
         ch.greet();
         ch.greet2();
         ch.negotiation();
        //  ch.sanket();
    }
}