class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0; // left pointer
        int total = 0; // total sum
        int min = Integer.MAX_VALUE; // initializing it to highest value
        for(int i =0 ; i < nums.length ; i++)
        {
            total+=nums[i]; // adding sum 
            while(total >= target) // condition if it is greater than target
            {
                min = Math.min(min, i + 1 - left); // comput min of  the length of elements greater than target
                total -= nums[left];  // decreasing value from total sum
                left++;//moving left pointer to the right
            }
        }
        if(min == Integer.MAX_VALUE)
          return 0;
        else
            return min;
    }
}
