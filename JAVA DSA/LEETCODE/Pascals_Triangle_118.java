package LEETCODE;
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
        int n= mg.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        list=ob.generate(n);
        System.err.println(list);
        mg.close();
    }
}
