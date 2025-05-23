import java.util.*;
class BINARY_SEARCH
{
    public static void main()
    {
        Scanner mg=new Scanner(System.in);
        System.out.println("BINARY SEARCH ");
        System.out.println();
        int n,search,i,lb,ub,mid;
        System.out.println("ENTER THE NUMBER OF ELEMENTS:");
        n=mg.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER THE ELEMENTS : ");
        for(i=0;i<n;i++)
            a[i]=mg.nextInt();
        System.out.println("ENTER THE ELEMENT TO BE SEARCHED: ");
        search=mg.nextInt();
        System.out.println("ORIGINAL ELEMENTS IN THE LIST ");
        for(i=0;i<n;i++)
            System.out.println(a[i]);
        lb=0;
        ub=n-1;
        mid=(lb+ub)/2;
        while(lb<=ub)
        {
            if(a[mid]==search)
            {
                System.out.println(search +" IS FOUND AT POSITION " + (mid+1));
                break;
            }
            else if(a[mid]<search)
            {
                lb=mid+1;           
            }
            else if(a[mid]>search)
            {
                ub=mid-1;
            }
            mid=(lb+ub)/2;
        }
        if(lb>ub)
            System.out.println(search+" IS NOT FOUND");
    }
}