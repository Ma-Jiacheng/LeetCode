package 有序数组的平方;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        Solution solution = new Solution();

        int[] result = solution.sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
}
