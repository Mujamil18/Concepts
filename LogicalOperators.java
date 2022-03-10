public class LogicalOperators {
    public static void main(String[] args)
    {
//        float cgpa= 7.4f;
//        if(cgpa > 8.5)
//            System.out.println("First Class with Distinction");
//        else if((cgpa >= 6.5) && (cgpa < 8.5))
//            System.out.println("First Class");
//        else
//            System.out.println("Second Class");
        // To perform Logical AND
        System.out.println((10 > 5) && (15 > 10));
        System.out.println((10 > 5) && (15 < 10));

        //To perform Logical OR
        System.out.println((15 > 10) || (10 > 5));
        System.out.println((15 > 10 ) || (10 < 5));
        System.out.println((15 < 10 ) || (10 < 5));

        //To perform Logical NOT
        System.out.println(10 != 15);
        System.out.println(10 != 10);
    }
}
