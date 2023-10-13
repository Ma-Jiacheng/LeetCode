package 二分查找;

class Solution {
    public int search(int[] nums, int target) {
        //定义左右指针，指向数组的首尾
        int left = 0;
        int right = nums.length - 1;

        //设置循环查找条件，left <= right
        while (left <= right) {
            //定义数组中间位置，采用该写法避免溢出
            int mid = left + ((right - left) / 2);
            //数组是有序的，当中间值大于target，则target位于左侧，右指针移动，继续查询左半边
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {    //中间值小于target，则target位于右侧，左指针移动，继续查询右半边
                left = mid + 1;
            } else {
                return mid;     //当mid = target，将查询结果mid返回
            }
        }
        return -1;  //查询结束，没有找到target，返回 -1
    }
}