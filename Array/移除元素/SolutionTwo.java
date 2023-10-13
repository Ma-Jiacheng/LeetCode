package 移除元素;

//相向双指针
class SolutionTwo {
    public int removeElement(int[] nums, int val) {
        //定义左右指针，指向数组头尾
        int left = 0;
        int right = nums.length - 1;

        //右指针向左遍历，找到第一个不等于val的元素
        while (right >= 0 && nums[right] == val) {
            right--;
        }

        //设置循环条件，左指针小于等于右指针
        while (left <= right) {
            //左指针遍历，找到第一个等于val的元素位置，使用右指针元素将其覆盖
            if (nums[left] == val) {
                nums[left] = nums[right];
                //右指针向左移动
                right--;
            }
            //左指针向右移动
            left++;
            //完成覆盖后
            while (right >= 0 && nums[right] == val) {
                right--;
            }
        }

        return left;
    }
}
