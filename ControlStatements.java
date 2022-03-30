public class ControlStatements {
    public static void main(String[] args)
    {
        System.out.println("Loops:");
        for (int i=0;i<3;i++)
        {
            System.out.println(i+1+" --> Executing For Loop..");
        }
        System.out.println();
        int j=0;
        while(j<3)
        {
            System.out.println(j+1+" --> Executing while loop");
            j++;
        }
        System.out.println();
        int i=3;
        do
        {
            System.out.println(i-- +" --> Executing do-while loop");
        }while(i!=0);
        System.out.println();
        System.out.println("Conditional Statements:");
        int a=5,b=10,c=15;
        Boolean bool=true;
        if(bool)
        {
            System.out.println("Executing Simple-IF ");
        }
        System.out.println();

        if(bool)
        {
            System.out.println("Truth Statement IF-ELSE");
        }
        else
        {
            System.out.println("False Statement IF-ELSE");
        }
        System.out.println();

        if(bool)
        {
            System.out.println("if statement 1");
        }
        else if(true)
        {
            System.out.println("else if statement");
        }
        else
        {
            System.out.println("else statement");
        }
    }
}
