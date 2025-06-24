import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public int[] twosum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[] {numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }
        
        // As per problem statement, there's exactly one solution,
        // so this line should theoretically never be reached
        throw new IllegalArgumentException("No two sum solution");
    }
}