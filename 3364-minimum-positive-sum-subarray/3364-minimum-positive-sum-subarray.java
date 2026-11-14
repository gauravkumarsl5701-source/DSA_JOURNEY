class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        Integer[] arr = nums.toArray(new Integer[0]);
        int n=arr.length;
        int min=Integer.MAX_VALUE; 
       for(int i=0;i<n;i++){
        int sum=0;
        for(int j=i;j<Math.min(n,i+r);j++){
            sum+=arr[j];
            int len=j-i+1;
            if(len>=l&&len<=r&&sum>0) {
                    min = Math.min(min,sum);
        }
       }
       }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
       return min;
    }
}