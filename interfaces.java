 interface cycle{
    void applyBreak();
    void applySpeed();
}
interface blowHorn{
    void BlowHorn11();
    void BlowHorn22();
}
class avoncycle implements cycle,blowHorn{
    public void applyBreak(){
        System.out.println("appling breaks...");
    }
    public void applySpeed(){
        System.out.println("applying speed...");
    }
    public  void BlowHorn11(){
        System.out.println("appling horn");
    }
    public void BlowHorn22(){
        System.out.println("appling horn");
    }
}

public class interfaces {
    public static void main(String[] args) {
        // interface is group of empty body.we can  create multiple interface
        // and we can not make object of interface, we can impelement multiple
        // interface. for ex class avoncycle impelement cycle,blowHorn;
        avoncycle ac = new avoncycle();
        ac.BlowHorn11();
        ac.BlowHorn22();
        ac.applyBreak();
        ac.applySpeed();
    }
}
