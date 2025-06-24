import java.util.*;
class BUBBLE_SORT
{
    public static void main()
    {
        Scanner mg=new Scanner(System.in);
        System.out.println("BUBBLE SORT ");
        System.out.println();
        int n,i,j,temp=0;
        System.out.println("ENTER THE NUMBER OF ELEMENTS:");
        n=mg.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER THE ELEMENTS : ");
        for(i=0;i<n;i++)
            a[i]=mg.nextInt();
        System.out.println("ORIGINAL LIST ");
        for(i=0;i<n;i++)
            System.out.print(a[i]+"  ");
        System.out.println();
        System.out.println("SORTED LIST");
        
        // Main Algorithm
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
                }
            }
        }
        //SORTED LIST
        for(i=0;i<n;i++)
            System.out.print(a[i]+"  ");
    }
}