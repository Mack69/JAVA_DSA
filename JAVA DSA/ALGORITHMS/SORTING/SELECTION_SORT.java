import java.util.*;
public class SELECTION_SORT
{
    public static void main(String[] args) {
        
        Scanner mg=new Scanner(System.in);
        System.out.println("SELECTION SORT ");
        System.out.println();
        int n,i,j,temp=0,min;
        System.out.println("ENTER THE NUMBER OF ELEMENTS:");
        n=mg.nextInt();
        int arr[]=new int[n];
        System.out.println("ENTER THE ELEMENTS : ");
        for(i=0;i<n;i++)
            arr[i]=mg.nextInt();
        System.out.println("ORIGINAL LIST ");
        for(i=0;i<n;i++)
            System.out.print(arr[i]+"  ");
        System.out.println();
        System.out.println("SORTED LIST");
        
        // Main Algorithm
        for(i=0;i<n-1;i++)
        {
            min=i;
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                    min=j;
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]= temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

