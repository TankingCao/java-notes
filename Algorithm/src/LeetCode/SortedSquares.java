package Algorithm.src.LeetCode;

import java.util.Arrays;

public class SortedSquares {
    /*给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序*/
    public static void main(String[] args) {
        int[] arr = {-1, 2, 0, -3, 5};
        System.out.println(Arrays.toString(sortedSquares(arr)));

    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
