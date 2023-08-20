 class employee{
    int salary; 
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}

public class oops{
    public static void main(String[] args){
        
        // problem : 1 create employee class with property name, salary,get salary ,get name
        employee sanket = new employee();
        sanket.salary = 21000;
        sanket.setName("sanket vekariya");
        sanket.getSalary();
        System.out.println(sanket.getName());
    }
}