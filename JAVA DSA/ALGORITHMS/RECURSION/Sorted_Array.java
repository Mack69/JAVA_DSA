
import java.util.Arrays;
public class Sorted_Array 
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        System.out.println("Original Array : "+ Arrays.toString(arr));
        boolean ans=isArraySorted(arr,0);
        if(ans==true)
            System.out.println("Array is Sorted");
        else
            System.out.println("Array is not Sorted");
    }

    public static boolean isArraySorted(int []arr, int i)
    {
        if(i==arr.length-1)                   // Base Case 
        {
            return true;
        }
        if(arr[i]<arr[i+1])                    // Means checking array is sorted or not
            return isArraySorted(arr, i+1);
        else
            return false;                     // when (i+1) < i means array is not sorted

    }

}

/*
OUTPUT

Original Array : [1, 2, 3, 4, 5]

Array is Sorted
 */