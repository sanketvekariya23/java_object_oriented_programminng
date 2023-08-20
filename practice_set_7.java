 abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen{
    void write(){
        System.out.println("writting...");
    }
    void refill(){
        System.out.println("rifill...");
    }
    void changenib(){
        System.out.println("changing nib..");
    }
} 

class monkey{
    void jump(){
        System.out.println("jumping");
    }
    void bite(){
        System.out.println("bitting");
    }
}
interface Basicanimal{
    void eat();
    void sleep();
}
class human extends monkey implements Basicanimal{
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}

abstract class telephone{
   abstract void ring();
   abstract void lift();
   abstract void disconnect();
}
class smartphone extends telephone{
    void ring(){
        System.out.println("ringing");
    }
    void lift(){
        System.out.println("lifting");
    }
    void disconnect(){
        System.out.println("disconnecting");
    }
    void greet(){
        System.out.println("good morning");
    }
}

class practice_set_7{
    public static void main(String[] args) {
        // problem : 1 & 2
       fountainpen p = new fountainpen();
       p.changenib(); 
       // problem : 3
       human h = new human();
       h.jump();
       h.bite();
       h.sleep();
       h.eat();

       // problem : 5
       monkey m = new human();
       m.jump();        // polymorphism
       //   m.eat();  // it is throw an error

       // problem : 4
        telephone r = new smartphone();
        r.ring();
        r.disconnect();
        r.lift();
        // r.greet();  //  we cant 

    }
}