/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 *
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 */


public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int start[] = new int[n];
        int end[] = new int[n];
        int prefix = 1;
        int suffix = 1;
        for(int i=0; i<n; i++){
            if(i == 0){
                start[i] = 1;
                end[n-1-i] = 1;
                prefix *= nums[i];
                suffix *= nums[n-1-i];
            }else{
                start[i] = prefix;
                end[n-1-i] = suffix;
                prefix *= nums[i];
                suffix *= nums[n-1-i];
            }
        }
        for(int i=0; i<n; i++){
            nums[i] = start[i]*end[i];
        }
        return nums;
    }
}
