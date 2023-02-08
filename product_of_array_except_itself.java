class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
         Arrays.fill(answer , 1); // initializing 
        int leftMult = 1;
        int rightMult = 1;
        //multiply all elements to the left of each element
        for(int i = 0 ; i < answer.length ; i++)
        {    
           
           answer[i]*=  leftMult;
            leftMult = leftMult*nums[i]; 
        }
        //multiply all elements to the right of each element
        for(int i = nums.length-1 ; i >= 0 ; i--)
        {
          
            
              answer[i]*=  rightMult ;
            rightMult = rightMult*nums[i];   
       
           
        }
        
        return answer;
    }
}
