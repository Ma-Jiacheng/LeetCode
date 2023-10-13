package 二分查找;

public class Demo {
    public static void main(String[] args) {
        //测试用例
        int target = 9;
        int[] nums = {-1, 0, 3, 5, 9, 12};
        Solution solution = new Solution();

        int position = solution.search(nums, target);
        System.out.println("position = " + position);

    }
}
