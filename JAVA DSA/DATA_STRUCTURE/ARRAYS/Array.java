import java.util.*;
class Array{
    public static void main(String[] args) {
        Scanner mg = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n=mg.nextInt();
        int arr[]=new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i]=mg.nextInt();
        }
        System.out.println("Output");
        System.out.println(Arrays.toString(arr));
    }
}