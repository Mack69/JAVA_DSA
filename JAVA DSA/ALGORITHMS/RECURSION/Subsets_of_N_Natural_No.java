import java.util.*;
public class Subsets_of_N_Natural_No
{
    public static void main(String[] args) {
        
        int n=3;
        List<Integer> list = new ArrayList<>();
        allSubset(n,list);
        System.out.println(" ");
        findSubset(1,n,list);
    }   

    // Backward approach ( N -> 1)

    public static void allSubset(int n, List<Integer> subset)
    {
        //Base Case
        if(n==0)
        {
            System.out.println(subset);
            return;
        }

        // If add in subset
        subset.add(n);
        allSubset(n-1, subset);

        // If not want to add in subset
        subset.remove(subset.size()-1);
        allSubset(n-1, subset);
    }

    // Forward Approach (1 -> N)

    public static void findSubset(int current, int n, List<Integer> subset)
    {
        if (current > n) {
            System.out.println(subset);
            return;
        }

        // Include current
        subset.add(current);
        findSubset(current + 1, n, subset);

        // Exclude current
        subset.remove(subset.size() - 1);
        findSubset(current + 1, n, subset);
    }

}


/* 
OUTPUT 

BACKWARD APPROACH (N TO 1)
[3, 2, 1]
[3, 2]
[3, 1]
[3]
[2, 1]
[2]
[1]
[]

FORWARD APPROACH (1 TO N)
[1, 2, 3]
[1, 2]
[1, 3]
[1]
[2, 3]
[2]
[3]
[]


Step-by-Step Execution for n = 3
We start with allSubset(3, []) (empty list).

Phase 1: Include All Numbers

Step	 n	Subset Before	Action	  Subset After	   Output
1	     3	   []	        Include 3	[3]	             -
2	     2	   [3]	        Include 2	[3, 2]     	     -
3	     1	  [3, 2]	    Include 1	[3, 2, 1]	     -
4	     0	  [3, 2, 1]	    Base case:  Print[3, 2, 1]	[3, 2, 1]

Phase 2: Backtrack and Exclude

Step	n	    Subset Before	    Action	                    Subset After	    Output
5	    1	    [3, 2, 1]	    Exclude 1 (backtrack)            [3, 2]	                -
6	    0	    [3, 2]	        Base case: Print	             [3, 2]	            [3, 2]
7	    2	    [3, 2]	        Exclude 2 (backtrack)	         [3]	                -
8	    1	    [3]	            Include 1	                     [3, 1]	                -
9	    0	    [3, 1]	        Base case: Print	             [3, 1]	            [3, 1]
10	    1	    [3, 1]	        Exclude 1 (backtrack)	          [3]	                -
11	    0	    [3]         	Base case: Print	              [3]	                [3]
12	    3	    [3]	            Exclude 3 (backtrack)	          []	                -
13	    2	    []	            Include 2	                      [2]	                -


Recursion Tree Visualization

allSubset(3, [])
├─ Include 3: allSubset(2, [3])
│  ├─ Include 2: allSubset(1, [3, 2])
│  │  ├─ Include 1: allSubset(0, [3, 2, 1]) → Print [3, 2, 1]
│  │  └─ Exclude 1: allSubset(0, [3, 2]) → Print [3, 2]
│  └─ Exclude 2: allSubset(1, [3])
│     ├─ Include 1: allSubset(0, [3, 1]) → Print [3, 1]
│     └─ Exclude 1: allSubset(0, [3]) → Print [3]
└─ Exclude 3: allSubset(2, [])
   ├─ Include 2: allSubset(1, [2])
   │  ├─ Include 1: allSubset(0, [2, 1]) → Print [2, 1]
   │  └─ Exclude 1: allSubset(0, [2]) → Print [2]
   └─ Exclude 2: allSubset(1, [])
      ├─ Include 1: allSubset(0, [1]) → Print [1]
      └─ Exclude 1: allSubset(0, []) → Print []

*/  
