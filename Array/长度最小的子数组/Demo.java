package 长度最小的子数组;

public class Demo {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        Solution solution = new Solution();

        int length = solution.minSubArrayLen(target, nums);
        System.out.println("length = " + length);
    }
}
