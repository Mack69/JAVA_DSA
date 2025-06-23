
import java.util.Scanner;
public class Sum_N_Natural_Nos 
{
    public static void main(String args[])
    {
        Scanner mg = new Scanner(System.in);
        System.out.println("Enter the Nth Natural No");
        int n=mg.nextInt();
        System.out.println("Sum of N natural nos :");
        Sum(n,0);
        mg.close();
    }

    public static int Sum(int n, int sum)   // RECURSION FUNCTION TO FIND SUM
    {
        if(n>0)
        {
            sum+=n;                         // Initialize sum = n 
            Sum(n-1, sum);                  // Then reducing the value of n to (n-1)  -> N to 1
        }
        else
        {
            System.out.println(sum);       // when N=0 else block execute with the current sum value 
        }
        return 0;
    }
}

/*
OUTPUT

Enter the Nth Natural No
5
Sum of N natural nos :
15

 */