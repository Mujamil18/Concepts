import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        //To print numbers from 1 to 10
        for(int i=1; i<=10; i++)
        {
            System.out.print(i + " " );
        }
        System.out.println();

        //To print array elements
        int[][] a= new int[3][3];
        System.out.print("Enter the elements in one line ");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                a[i][j]= sc.nextInt();
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int i=1;
        for(; i<=10; i++)
        {
            System.out.print(i + " ");
        }
    }
}
