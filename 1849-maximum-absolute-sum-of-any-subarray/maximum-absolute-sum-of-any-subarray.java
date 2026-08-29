class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum = 0; int maxi = Integer.MIN_VALUE; int mini = Integer.MAX_VALUE ;int minisum = 0;
        for(int i = 0; i <nums.length;i++){
            sum+=nums[i];
            if(sum>maxi){
                maxi = sum;
            }
            
            if(sum<0){
                sum = 0;
            }
            minisum+=nums[i];
            if(minisum<mini){
                mini = minisum;
            }
            if(minisum>0){
                minisum = 0;

            }
        }
         return Math.max(maxi, Math.abs(mini));
    }
}