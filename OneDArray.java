import java.util.Arrays;
import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);

        int[] arr1=  {2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(arr1));
        System.out.println("Enter the size of array");
        int size = in.nextInt();
        int[] arr2= new int[size];

        //To get array element as input
        System.out.println("Enter the elements ");
        for(int i=0; i<size; i++)
        {
            arr2[i]= in.nextInt();
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
