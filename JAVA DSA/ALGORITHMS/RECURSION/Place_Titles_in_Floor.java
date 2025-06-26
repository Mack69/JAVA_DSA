
// Place tiles of size 1xm in a floor of size nxm

public class Place_Titles_in_Floor 
{
    public static void main(String args[])
    {
        int n=4,m=2;
        int tilesNos= countTiles(n,m);
        System.out.println("No. of ways u put tiles = "+ tilesNos);
    }

    public static int countTiles(int n, int m)
    {
        // Base case

        if(n<m)
            return 1;                      // if n<m then tiles can only placed horizontaly so 1 way 
        if(n==m)
            return 2;                      // if n==m then tiles can only placed either all vertically or all horizontally so 2 ways

        //If u place Horizontally
        int horizontal=countTiles(n-1, m);   // the floor length decreased by 1 units

        //if u place vertical
        int vertical=countTiles(n-m, m);     // if u placed vertically the floor length decreased by m units

        return horizontal+vertical;
    }
}

// OUTPUT

// No. of ways u put tiles = 5