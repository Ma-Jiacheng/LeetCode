package 长度最小的子数组;

//滑动窗口法
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //定义窗口左侧初始位置，窗体内元素的和，设置默认结果为最大
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;

        //移动窗口右侧，不断向窗体添加元素，直到窗体内元素大于等于target
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            //当窗体元素大于等于target时，记录此时的窗体长度，与之前的最小值做比较
            while(sum >= target){
                //将较小的值更新为结果
                result = Math.min(result, right - left + 1);
                //之后将窗口左侧向右移动，并在sum删除对应元素的值，直到窗体内元素和小于target
                sum -= nums[left];
                left++;
                //之后继续移动窗口右侧，直到找到下一个满足条件的窗体
            }
        }
        //判断result是否被更新过，如果没有，则无符合条件的子数组，返回0
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
