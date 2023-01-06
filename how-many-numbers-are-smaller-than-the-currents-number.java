class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] n = new int[nums.length]; // declare array and initialize it to 0
         for(int i=0;i<nums.length;i++)
    {
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]<nums[i]&&i!=j)
            {
                n[i]++; 
            }
        }
    }
    return n;

    }
}
