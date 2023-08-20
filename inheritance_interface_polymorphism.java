 import java.util.*;
interface camara{
    void taking_snap();
    void rocord_video();
}
interface snapchat extends camara{
    void chat_with_freind();
}
interface wifi{
    void getnetwork();
    void avalibeble_network();
}
class smartphone implements snapchat,wifi{
    public  void taking_snap(){
        System.out.println("taking sanp");
     }
    public void rocord_video(){
        System.out.println("recording video...");
    }
    public void chat_with_freind(){
        System.out.println("chat + camara (taking snap )");
    }
    public void getnetwork(){
        System.out.println("connecting.....");
    }
    public void avalibeble_network(){
        System.out.println("5 networks are avalible");
    }
}
class inheritance_interface_polymorphism{
    public static void main(String[] args){
        smartphone s = new smartphone();
        // s.taking_snap();
        // s.rocord_video();
        // s.chat_with_freind();
        // s.getnetwork();
        // s.avalibeble_network();
        wifi w= new smartphone();
        w.getnetwork();
        w.avalibeble_network();
        // w.snapchat();  //thrwn an error
    }
}