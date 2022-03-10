public class UnaryOperators {
    public static void main(String[] args)
    {
        //Unary plus
        int num= +2;
        System.out.println(num);

        //Unary Minus
        int sum = 4 + -2;
        System.out.println(sum);

        int m= 10, n=20;
        int x= m++ + ++n; //m is 10 and n is 21 (10+21=31)
        System.out.println(x);
        System.out.println(m + " " + n); // m is incremented here

        int a= 10, b=20;
        int y= a-- + --b; //a is 10 and b is 19
        System.out.println(y);
        System.out.println(a + " " + b); // a is decremented here

        //Logical Complement
        int p=10, q=12;
        System.out.println((a!=b));
    }
}
