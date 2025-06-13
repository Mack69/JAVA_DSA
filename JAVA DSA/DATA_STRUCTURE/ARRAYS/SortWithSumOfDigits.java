import java.util.*;
public class SortWithSumOfDigits
{
    public static int getSum(int num)
    {
        int sum=0;
        while(num>0)
        {
            int d=num%10;
            sum+=d;
            num/=10;
        }
        return  sum;
    }

    public static void main(String[] args) {
        Integer arr[]= new Integer[5];
        arr[0]=6;
        arr[1]=3;
        arr[2]=12;
        arr[3]=67;
        arr[4]=22;

        System.out.println("Normal Array : " + Arrays.toString(arr));

        //Lambda Function ()
        Arrays.sort(arr,(a,b)->(getSum(a)-getSum(b)));
        
        System.out.println("Sorted Array : " + Arrays.toString(arr));

    }
}