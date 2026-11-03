class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        for(int i=0;i<n;i++){  
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=max-nums[i];
            }
    return ans;
    }
}