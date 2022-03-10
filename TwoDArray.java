import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the rows and columns");
        int row= in.nextInt();
        int column = in.nextInt();
        int[][] array1= new int[row][column];
        System.out.println("Enter the elements of Array1 ");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                array1[i][j]= in.nextInt();
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
