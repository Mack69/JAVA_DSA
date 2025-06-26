public class Find_Path_in_Maze 
{
    public static void main(String[] args) 
    {
        int n=3,m=3;;
        int totalPath=findPath(n,m,0,0);
        System.out.println("Total Nos of Paths Possible = "+ totalPath);
    }

    public static int findPath(int n, int m, int i, int j)
    {
        // BASE CASEs
        if(i==n || j==m)
            return 0;

        if(i==n-1 && j==m-1)
            return 1;

        // If move Downwards
        int downPaths = findPath(n, m, i+1, j);   // in downwrad row value increases i -> i+1

        //If move Rightwards
        int rightPaths = findPath(n, m, i, j+1);   // in rightwrad coloumn value increases j -> j+1

        return downPaths+rightPaths ;
    }
    
}
 
// OUTPUT

// Total Nos of Paths Possible = 6