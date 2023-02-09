class Solution {
     public int evalRPN(String[] tokens) {
        Stack <Integer> stack = new Stack<>();
        for(String s : tokens)
         {
             if("+-*/".contains(s))
             {
                 stack.push(calculate(stack.pop() , stack.pop() , s));
             }
             else
             {
                 stack.push(Integer.parseInt(s));
             }
            
         }
         return stack.pop();
     }
    
   private int calculate(int a , int b , String c) 
     {
           if("+".equals(c))
             return a+b;
             else if("-".equals(c))
             return a-b;
             else if("*".equals(c))
             return a*b;
             else
             return a/b;
     }
    )
