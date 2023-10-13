package 螺旋矩阵Ⅱ;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] generateMatrix = solution.generateMatrix(5);


        for (int[] matrix : generateMatrix) {
            System.out.println(Arrays.toString(matrix));
        }
    }
}