package 移除元素;

public class Demo {
    public static void main(String[] args) {
        //测试用例
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        SolutionOne solutionOne = new SolutionOne();
        int length = solutionOne.removeElement(nums, val);

        System.out.print("[");
        for (int i = 0; i < length - 1; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println(nums[length - 1] + "]");

        //测试用例
        SolutionTwo solutionTwo = new SolutionTwo();
        int count = solutionTwo.removeElement(nums, val);

        System.out.print("[");
        for (int i = 0; i < count - 1; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println(nums[count - 1] + "]");
    }
}
