public class ArithmeticOperators {
    public static void main(String[] args)
    {
       int a=9, b=12, c=3;
       //To perform Addition
        System.out.println(a + b + c);
        //To perform Subtraction
        System.out.println(a - b -c);
        //To perform Multiplication
        System.out.println(a * b * c);
        //To perform Division- gives quotient
        System.out.println(b/c);
        //To perform Modulo Division - gives remainder
        int modulus1= b % c;
        int modulus2= c % b;
        int modulus3 = b % a;
        System.out.println(modulus1 + " " + modulus2 + " " + modulus3);

        /* DOCUMENTATION

        Arithmetic expression evaluated left to right using the rules of precedence of operators

        High Priority  * / %
        Low Priority + -

        Evaluation procedure includes two left-to-right passes
          1st pass - high priority operators are applied
          2nd pass - low priority operators are applied

        If the evaluation contains parentheses , there will be three passes
          -expression within parentheses assumes the highest priority

         */
        int x = a - b / 3 + c * 2 - 1;
        System.out.println(x);
        int y= a - b / (c + 3) * (3-1);
        System.out.println(y);
    }
}
