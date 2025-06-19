import java.util.*;
class Pascals_Triangle_II_119 {
    public List<Integer> getRow(int rowIndex) 
    {
        List<Integer> curRow = new ArrayList<>();
        List<List<Integer>> row = new ArrayList<>();
        int i, k = 0;

        for (i = 0; i <= rowIndex; i++) 
        {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(j, 1);
                }
                 
                else {
                    k = (row.get(i - 1).get(j - 1) + row.get(i - 1).get(j));
                    list.add(k);
                }
            }
            row.add(list);
        }

        for (int j = 0; j <= rowIndex; j++) {
            curRow.add(row.get(rowIndex).get(j));
        }
        return curRow;
    }

    public static void main(String[] args) {
        Scanner mg=new Scanner(System.in);
        Pascals_Triangle_II_119 ob = new Pascals_Triangle_II_119();
        System.out.println("Enter the Number of Rows :");
        int n= mg.nextInt();
        List<Integer> list = ob.getRow(n);
        System.out.println(list);
        mg.close();
    }
}

// Example 1:
// Input: rowIndex = 3
// Output: [1,3,3,1]

// Example 2:
// Input: rowIndex = 0
// Output: [1]

// Example 3:
// Input: rowIndex = 1
// Output: [1,1]