import java.util.*;
public class Factorial_of_N 
{
    public static void main(String args[])
    {
        Scanner mg = new Scanner(System.in);
        System.out.println("Enter the Nth Natural No");
        int n=mg.nextInt();
        System.out.println("Factorial of Given No. :");
        int fact=Factorial(n);
        System.out.println(fact);
        mg.close();
    }

    public static int Factorial(int n)
    {
        if(n==0)
            return 1;
        int fact = n * Factorial(n-1);
        return fact;
    }

}
