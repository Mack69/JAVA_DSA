
import java.util.*;
public class ArrayMethods {

    static Scanner mg=new Scanner(System.in);

    public static void Fill()
    {
        int arr[]=new int[15];
        System.out.println("Enter Array Element to fill :");
        int n=mg.nextInt();
        Arrays.fill(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort()
    {
        int arr[]={35,20,60,80,40,55,10,75};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //Descending order
        Integer[] arrRev=Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arrRev,Collections.reverseOrder());
        System.out.println(Arrays.toString(arrRev));
    }

    public static void Compare()
    {
        String str1[]={"mayukh","ghosh"};
        String str2[]={"manash","ghosh"};
        System.out.println(Arrays.compare(str1, str2));
    }

    public static void CopyArray()
    {
        int arr[]={12,24,36,48,60};
        Arrays.copyOf(arr, 17);
        System.out.println(Arrays.toString(arr));

        int arrDup[]=Arrays.copyOfRange(arr,2,5);
        System.out.println(Arrays.toString(arrDup));
    }

    public static void Equal()
    {
        int arr1[]={12,24,36,48,60};
        int arr2[]={8,16,24,32,40};
        System.out.println(Arrays.equals(arr1, arr2));
    }

    public static void Search()
    {
        int arr[]={35,20,60,80,40,55,10,75};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Found at index : arr["+ Arrays.binarySearch(arr, 40)+ "]");
    }

    public static void ArrayList()
    {
        Integer arr[]={35,20,60,80,40,55,10,75};
        List<Integer> arrList=Arrays.asList(arr);
        System.out.println(arrList);
    }
    
    public static void main(String args[]){
        Fill();
        Sort();
        Compare();
        CopyArray();
        Equal();
        Search();
        ArrayList();
        mg.close();
    }
    
}
