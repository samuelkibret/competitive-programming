class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<Integer>();
        //sorting array
        for(int i =0 ; i < nums.length ; i++)
        {
            for(int j = 0 ;j < nums.length - 1 ; j++)
            {
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
            }
            }
        }
        //look for terget index
    for(int i = 0; i < nums.length ; i++)
    {
        if(nums[i] == target)
        {
            ans.add(i);
        }
    }
     return ans;

    }
}
