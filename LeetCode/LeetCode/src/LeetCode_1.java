import java.util.Arrays;

public class LeetCode_1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        LeetCode_1 lc = new LeetCode_1();
        int[] result = lc.twoSum(new int[]{1,2,3,4,5,6}, 10);
        System.out.println(Arrays.toString(result));
    }
}