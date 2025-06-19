
import java.util.*;
public class Pascals_Triangle_118 {

     public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int k=0;
        for (int i = 0; i < numRows; i++) 
        {
            List<Integer> num = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                    num.add(j,1);
                else
                {
                    k=(list.get(i-1).get(j-1)) + (list.get(i-1).get(j));
                    num.add(k);
                }
            }
            list.add(num);           
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner mg=new Scanner(System.in);
        Pascals_Triangle_118 ob = new Pascals_Triangle_118();
        System.out.println("Enter the Number of Rows :");
        int n= mg.nextInt();
        List<List<Integer>> list = ob.generate(n);
        System.out.println(list);
        mg.close();
    }
}


//OUTPUT

// Enter the Number of Rows :
// 5
// [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
