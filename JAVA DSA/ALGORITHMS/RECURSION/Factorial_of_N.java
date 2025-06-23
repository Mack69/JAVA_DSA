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

/* 
 OUTPUT

Enter the Nth Natural No
5
Factorial of Given No. :
120
_____________________________________________________________________________________________________________________________________

Execution Trace for Factorial(3)

Phase 1: Recursive Calls (Stack Grows)
Call Stack	n	Action	Waiting For	Stack State
Factorial(3)	3	Computes 3 * Factorial(2) → Pauses	Result of Factorial(2)	[Factorial(3)]
Factorial(2)	2	Computes 2 * Factorial(1) → Pauses	Result of Factorial(1)	[Factorial(3), Factorial(2)]
Factorial(1)	1	Computes 1 * Factorial(0) → Pauses	Result of Factorial(0)	[Factorial(3), Factorial(2), Factorial(1)]
Factorial(0)	0	Base case → Returns 1	-	[Factorial(3), Factorial(2), Factorial(1)]
                                                                        
Phase 2: Unwinding (Stack Shrinks)
Call Stack	n	Action	Computation	Stack State
Factorial(0)	0	Returns 1 → Frame popped	-	[Factorial(3), Factorial(2), Factorial(1)] → [Factorial(3), Factorial(2)]
Factorial(1)	1	Resumes: fact = 1 * 1 = 1 → Returns 1	-	[Factorial(3), Factorial(2)] → [Factorial(3)]
Factorial(2)	2	Resumes: fact = 2 * 1 = 2 → Returns 2	-	[Factorial(3)] → []
Factorial(3)	3	Resumes: fact = 3 * 2 = 6 → Returns 6	-	[] (stack empty)
                                                                       
 */