
import java.util.Arrays;
class Search_Insert_Position_35
{
    public int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        if (index >= 0) {
            return index; 
        } else {
            return -index - 1; 
        }
    }
}

// Input
// nums = [1,3,5,6]
// target = 5

// Output
// 2
