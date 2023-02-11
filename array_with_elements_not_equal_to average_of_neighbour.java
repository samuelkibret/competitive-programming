class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[] = new int[nums.length];
        int start=0, end = nums.length-1;
        Arrays.sort(nums);
        int i=0;
        while(start<end)
        {
            ans[i] = nums[start];
            ans[++i] = nums[end];
            start++;
            end--;
            i+=1;
        }
        if(nums.length%2!=0)
            ans[i] = nums[start];
        return ans;
    }
}
