package 移除元素;

//快慢指针
class SolutionOne {
    public int removeElement(int[] nums, int val) {
        //定义慢指针，初始位置为数组头元素
        int slow = 0;

        //定义快指针，遍历数组
        for (int fast = 0; fast < nums.length; fast++) {
            //当快指针遍历到不等于val的元素时，将该元素交给慢指针
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                //慢指针获得元素后前移一位
                slow++;
            }
        }
        //遍历整个数组后，所有等于val的元素已被覆盖，返回slow指针的位置，即为修改后的数组长度
        return slow;
    }
}
