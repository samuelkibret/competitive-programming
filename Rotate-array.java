class Solution {
    public void rotate(int[] nums, int k) {
        int[] ans = new int[nums.length];
        int j = 0;
        int rot = k % nums.length;
        for(int i = nums.length - rot  ; i < nums.length ; i++)
        {
            ans[j]  = nums[i];
            j++ ;
        }
         for(int i = 0 ; i < nums.length - rot ; i++)
        {
          ans[j] = nums[i]; 
               j++;
        }
        for(int i = 0 ; i < nums.length ; i ++)
        {
            nums[i] = ans[i]; 
        }
 
    }
}
