import java.util.*;
public class Fibonacci_of_N 
{
    public static void main(String args[])
    {
        Scanner mg = new Scanner(System.in);
        System.out.println("Enter the Nth Term of Series");
        int n=mg.nextInt();
        System.out.println("Fibonacci Series till N :");
        System.out.print(0 + " ");
        System.out.print(1 + " ");
        Fibonacci(n-2,0,1);           // n-2 cuz 1st and 2nd term already printed
        mg.close();
    }

    public static void Fibonacci(int n, int a, int b)
    {
        if(n==0)
            return;
        
        int c=a+b;                          // Add the value of a nd b for the next term
        System.out.print(c +" ");                
        a=b; b=c;                           // swap the value a->b and b=>c
        Fibonacci(n-1,a,b);                 // call function to send (n-1) to iterate this till n=1 and passes the modified a and b
    }

}

/*

OUTPUT

Enter the Nth Term of Series
8

Fibonacci Series till N :
0 1 1 2 3 5 8 13

 */