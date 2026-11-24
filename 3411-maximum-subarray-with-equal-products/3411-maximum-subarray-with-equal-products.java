class Solution {
    public int maxLength(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            long product = 1;
            long l = nums[i];
            long g = nums[i];
            for (int j = i; j < nums.length; j++) {
                product *= nums[j];
                g = gcd((int)g, nums[j]);
                l = (l / gcd((int)l, nums[j])) * nums[j];

                if (l * g == product) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}