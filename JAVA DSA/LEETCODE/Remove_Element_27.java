
import java.util.*;
public class Remove_Element_27 {
    public int removeElement(int[] nums, int val) {
        
        List<Integer> list = new ArrayList<>();
        for(int i: nums)
        {
            if(i!=val)
                list.add(i);
        }
        for(int i =0;i<list.size();i++)
        {
            nums[i]=list.get(i);
        }
        int k= list.size();
        return k;

    }
}

// Input
// nums = [3,2,2,3]
// val = 3

// Output
// [2,2]
