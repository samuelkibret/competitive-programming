class Solution {
    public String sortSentence(String s) {
        int n = s.split(" ").length;
        String[] ans = s.split(" ");
        int min = 1;
        String [] answer = new String[n];
        
        //order the words in the correct index
        for(int i = 0 ; i < n ; i++){
            for(int l = 0 ; l < n - 1 ; l++)
            {
               String temp = ans[l];
            String temp2 = ans[l + 1];
            if(temp.charAt(temp.length()-1) > temp2.charAt(temp2.length()-1) )
            {
                String temp3 = ans[l];
                ans[l] = ans[l + 1];
                ans[l + 1] = temp;
            } 
            }
            
        }
        // remove last element
        for(int j = 0 ; j < n ; j++)
        {
            int lengths = ans[j].length();
            answer[j] = ans[j].substring(0 , lengths - 1);
        }

        //concatenate all the elements

        String fanswer ="" ;
        for(int k = 0 ; k < n ; k++){
            if(k < n - 1)
            fanswer +=answer[k] + " ";
            else{
               fanswer +=answer[k];
            }

        }
        return fanswer;

    }
}
