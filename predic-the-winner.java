class Solution {
    public boolean PredictTheWinner(int[] nums ) {
       return compare( nums ,0 , nums.length - 1 , 0 , true ) >= 0; 
    }
    public int compare(int []nums , int start , int end ,  int p1 , boolean p1turn )
    {
        if(start == end)
        return p1;
        if(p1turn)
        {
            int bottom = compare(nums ,start + 1 , end , p1 + nums[start] , false);
            int top = compare(nums ,start , end - 1 , p1 + nums[end] , false);
            if(bottom > top)
             {
                 return bottom;
             }
             return top;
        }
        else{
            int bottom =  compare(nums ,start + 1 , end , p1 - nums[start] , true);
            int top = compare(nums ,start , end - 1 , p1 - nums[end] , true);
        if(p1 - nums[start] < p1 - nums[end]) 
        {
           return bottom;
        }
        else
        {
          return top;  
        } 
        }
    }
}
