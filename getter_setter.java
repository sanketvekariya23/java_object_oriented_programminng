class myemployee{
    private float salary;
    private String name;

    public float getSalary(){
        return salary;
    }
    public void setSalary(int x){
        salary = x;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
       name = n;
    }
}

public class getter_setter {
    public static void main(String[] args) {
        // getter and setter
        myemployee me = new myemployee();
        me.setSalary(10000);
        me.setName("VekariyaSanketKalubhai");
        System.out.println(me.getSalary());
        System.out.println(me.getName());

    }
}
