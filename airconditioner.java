
public class airconditioner    //class declaration
{
    String  brandname;
    String modelnumber;
    String color;
    int price;
 // constructor declaration of class
 public  airconditioner(String brandname, String modelnumber, String color, int price )  
 {
  this.brandname = brandname;
  this.modelnumber = modelnumber;
  this.color = color;
  this.price = price;
 }
  // action 1
  public String getBrandname(){ return brandname; }
  // action 2 
  public String getModelnumber(){ return modelnumber;}
   // action 3
  public String  getColor(){return color; }
    // action 4
  public  int getPrice(){return price;}
  public String toString()
  {
    return("this airconditioner brandname is " + this.getBrandname()
    + " and modelnumber is "
    + this.getModelnumber()+"." +".\ncolor of this airconditioner is " + this.getColor()
    + " and price of this airconditioner is " + getPrice()+".");
}public static void main(String[] args) 
{
  airconditioner BlueStar  =new airconditioner("Blue Star", "M54321", "white", 59999);
  System.out.println(BlueStar.toString());
}

}