
public class Ways_to_Invite_People 
{
    public static void main(String args[])
    {
        int n_People=4;
        int totalWays= countWays(n_People);
        System.out.println("Total ways = "+ totalWays);
    }
    
    public static int countWays(int n)
    {
        // Base case
        if(n<=1)
            return 1;

        // if person comes single  
        int single = countWays(n-1);  // then reduce the no. of remaining guest by 1
     
        // if person comes couple 
        int couple = (n-1)*countWays(n-2);  // then reduce the no. of remaining guest by 2

        return single+couple;
    }
}

// OUTPUT

// Total ways = 10