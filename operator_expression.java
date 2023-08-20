 public class operator_expression {
    public static void main(String[] args)
    {
        // president  is highest ! - _ ++ -- address of and indirection         right to left assiciativity
        // then * /  %        left to right assiciativity
        // then + -           left to right assiciativity
        int a = 7;
        int b = 8;
        int k = ++a +b;     // 8 + 8 ==> 16     associativity is hight (++ then +)
        System.out.println(k);
    }
}
