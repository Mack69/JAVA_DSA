import java.util.*;
class LINEAR_SEARCH
{
    public static void main()
    {
        Scanner mg=new Scanner(System.in);
        System.out.println("LINEAR SEARCH ");
        System.out.println();
        int n,search,i;
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
        //LOOP FOR SEARCHING
        for(i=0;i<n;i++)
        {
            if(a[i]==search)
            {
                System.out.println(search +" IS FOUND AT POSITION " + (i+1));
                break;
            }
        }
        if(i==n)
            System.out.println(search +" IS NOT FOUND IN THE LIST");
    }
}

