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
