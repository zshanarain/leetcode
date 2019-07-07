package com.codingbat.recursion;

public class GroupSum {

    private static boolean isGroupSumEqualToTarget(int[] nums, int target, int index, int sum) {
        System.out.println(index + "    :   " + sum);
        if (sum == target)
            return true;
        for (int i = index; i < nums.length; i++) {
            sum += nums[i];
            boolean isEqual = isGroupSumEqualToTarget(nums, target, i + 1, sum);
            if (isEqual) return isEqual;
            sum -= nums[i];
            isEqual = isGroupSumEqualToTarget(nums, target, i + 1, sum);
            if (isEqual) return isEqual;
        }

        return false;
    }

    public static boolean groupSum(int start, int[] nums, int target) {
        if (nums != null && start < nums.length) {
            return  isGroupSumEqualToTarget(nums, target, start, 0);
        }

        return  false;
    }

    public static void main(String[] args) {
    int[] nums = {2, 4, 8};
//    System.out.println(groupSum(0, nums, 10));
//    System.out.println(groupSum(0, nums, 14));
    System.out.println(groupSum(0, nums, 9));
    }
}
