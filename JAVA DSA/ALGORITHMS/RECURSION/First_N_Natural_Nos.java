import java.util.Scanner;
public class First_N_Natural_Nos {
    
    public static void main(String args[])
    {
        Scanner mg = new Scanner(System.in);
        System.out.println("Enter the Nth Natural No");
        int n=mg.nextInt();
        System.out.println("OUTPUT in Decending Order :");
        Descending(n);
        System.out.println("OUTPUT in Ascending Order :");
        Ascending(n);
        mg.close();
    }

    public static int Descending(int n)   // Here the Nos print fron N to 1 
    {
        if(n>0)
        {
            System.out.println(n);                 // Cuz here the No. is print 1st then function calls (n-1) till n=0
            Descending(n-1);
        }
        return 0;                                  // rerturn null when n becomes 0 and didn't go to the if block
    }


    public static int Ascending(int n)       // Here the Nos print fron 1 to N
    {
        if(n>0)
        {
            Ascending(n-1);                    // Cuz here the function calls (n-1) 1st and goes deep to n>0 i.e till 1 then starts backtrack and prints f(1) to f(n) 
            System.out.println(n);  
        }
        return 0;                            // rerturn null when n becomes 0 and didn't go to the if block
    }
}

/* 
OUTPUT 

Enter the Nth Natural No
5
OUTPUT in Decending Order :
5
4
3
2
1
OUTPUT in Ascending Order :
1
2
3
4
5       
*/
