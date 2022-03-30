import java.util.Arrays;

public class AnonymousArray {
    static int arraySum(int[] arr)
    {
        int sum=0;
        for (int i:arr)
        {
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int sum=arraySum(new int[]{1,2,3});
        System.out.println(sum);

        System.out.println(Arrays.toString(new String[]{"hi","hello"}));
    }
}
