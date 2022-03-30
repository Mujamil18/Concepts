public class ControlStatements {
    public static void main(String[] args)
    {
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
