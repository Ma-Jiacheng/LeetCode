package 有序数组的平方;

//双指针
class Solution {
    //因为原数组为有序数组，所以平方后的最大值，一定出现在左侧（负数）或右侧，不会在中间，所以左右指针从两端向中间遍历
    public int[] sortedSquares(int[] nums) {
        //创建头尾指针，指向原数组头尾元素
        int begin = 0;
        int end = nums.length - 1;
        //创建结果集，存储平方后的结果
        int[] result = new int[nums.length];
        //创建结果集数组指针，指向结果集末尾，存储最大值
        int index = result.length - 1;

        //设置循环条件
        while (begin <= end){
            //如果头元素的平方值小于尾元素平方值，则尾元素平方后为最大值
            if (nums[begin] * nums[begin] < nums[end] * nums[end]){
                //将原数组尾元素平方后存入结果集末尾
                result[index] = nums[end] * nums[end];
                //结果集指针前移一位，原数组尾指针前移一位
                index--;
                end--;
            } else {
                //原数组头元素（负数）平方后大于尾元素，则将头元素平方存入结果集
                result[index] = nums[begin] * nums[begin];
                //结果集指针前移一位，原数组尾指针前移一位
                index--;
                //原数组头元素指针后移一位
                begin++;
            }
        }
        //返回结果集
        return result;
    }
}