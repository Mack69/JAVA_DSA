import java.util.*;
class RemoveDuplicatesSolution {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i]) == false) {
                list.add(nums[i]);
            }
        }
        int k = list.size();
        for (int i = 0; i < list.size(); i++) {
            nums[i]=list.get(i);
        }
        return k;
    }
}

// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4]