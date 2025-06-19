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