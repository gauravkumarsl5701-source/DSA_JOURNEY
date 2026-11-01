class Solution {
    public int minMergedInteger(int[] nums) {
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i+=2){
            int temp=nums[i];
            int x=digCount(nums[i+1]);
            temp*=Math.pow(10,x);
            temp+=nums[i+1];
            if(temp<min){
                min=temp;
            }
        }
        return min;

    }
    private int digCount(int num){
        int c=0;
        while(num!=0){
            num=num/10;
            c++;
        }
        return c;
    }
}