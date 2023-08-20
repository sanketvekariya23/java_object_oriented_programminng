 
import java.util.Scanner;
public class string_mathods {
    public static void main(String[] args) {
        
   Scanner sc = new Scanner(System.in);
   System.out.println("string -->");     
   String name = sc.nextLine();

   System.out.println("The Lenght Of String");
   int value = name.length();
   System.out.println(value);

   System.out.println("Lowercase Of String");
   String Lcase = name.toLowerCase();
   System.out.println(Lcase);

   System.out.println("UpperCase Of String");
   String Upcase = name.toUpperCase();
   System.out.println(Upcase);

   System.out.println("Trimmed String");
   String nonTrimmedStrig = name.trim();
   System.out.println(nonTrimmedStrig);

   System.out.println("SubString");
   System.out.println(name.substring(4));
   System.out.println(name.substring(4,10));    // sanket vekariya

        System.out.println("replace");
        System.out.println(name.replace("sanket","sanket vekariya"));
        System.out.println(name.replace('s', 'S'));

        System.out.println("startWith");
        System.out.println(name.startsWith("sanket"));

        System.out.println("charAt");
        System.out.println(name.charAt(5));

        System.out.println("indexOf");
        System.out.println(name.indexOf('t'));
        System.out.println(name.indexOf("vekariya"));
        System.out.println(name.indexOf('t','a'));

        System.out.println("lastIndex");
        System.out.println(name.lastIndexOf('t'));
        System.out.println(name.lastIndexOf("vekariya"));

        System.out.println("equals");
        System.out.println(name.equals("sanket"));

        System.out.println("equals in ignore case");
        System.out.println(name.equalsIgnoreCase("sanket"));

    }
}
