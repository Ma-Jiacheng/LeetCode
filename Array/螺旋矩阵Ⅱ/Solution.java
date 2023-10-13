package 螺旋矩阵Ⅱ;

class Solution {
    public int[][] generateMatrix(int n) {
        //设置循环圈数、结果集、开始位置、数值记数
        int loop = 0;
        int[][] result = new int[n][n];
        int start = 0;
        int count = 1;
        int wide;
        int high;

        //loop记录循环次数，螺旋打印，所以loop为二分之一n
        while (loop++ < n / 2) {
            //打印第一行，loop++变为1，从start=0，wide=0位置开始，直到n-1处
            for (wide = start; wide < n - loop; wide++) {
                result[start][wide] = count++;
            }
            //打印结束，此时wide位于第一行末尾元素处，该元素交由右侧一列来处理

            //打印右边列，行数（high）为0，列数为最右侧（wide处）
            for (high = start; high < n - loop; high++) {
                result[high][wide] = count++;
            }

            //打印最下方一行，从右至左，此时wide与high均为数组最大索引n-1，向左打印，行数（high）不变，列数（wide）减小
            for (; wide >= loop; wide--) {
                result[high][wide] = count++;
            }

            //打印最左侧一列，从下至上，此时wide为0，high为n-1，向上打印，行数（high）减小，列数（wide）不变
            for (; high >= loop; high--) {
                result[high][wide] = count++;
            }
            //打印完一圈，start++，下一圈起点变为[1,1]
            start++;
        }

        //n为奇数，单独处理中心位置，打印最后一位count
        if (n % 2 == 1) {
            result[start][start] = count;
        }
        //返回结果集
        return result;
    }
}