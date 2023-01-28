class Solution {
    public int pivotIndex(int[] nums) {
        int tsum = 0;
        int lsum = 0;
        //find total sum
        for(int i =0; i < nums.length ; i++)
        {
            tsum += nums[i];
        }
        int rsum = tsum;
        //calculate rsum and check for equality
        for(int i = 0 ; i < nums.length ; i++ )
        {
            rsum = rsum - nums[i];
            if(lsum == rsum)
            {
                return i;
            }
            lsum = lsum + nums[i];
        }
        return -1;
    }
}
