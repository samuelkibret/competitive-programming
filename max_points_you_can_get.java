//this is a solution made by washnig 
//from his leetcode repo 
//https://github.com/wsahnig/leetcodeShuaTi/blob/master/1423.maximum-points-you-can-obtain-from-cards.java

class Solution {
    public int maxScore(int[] cardPoints, int k) {
            int n = cardPoints.length;
        //int sum = Arrays.stream(cardPoints).sum();
        int sum = 0;
        int curMin = 0;
        for(int i=0; i<n-k; i++)
        {
            curMin += cardPoints[i];
            sum += cardPoints[i];
        }
        int min = curMin;
        for(int i=n-k; i<n; i++)
        {
            curMin = curMin + cardPoints[i] - cardPoints[i-n+k];
            min = Math.min(curMin, min);
            sum += cardPoints[i];
        }
        return sum-min;
    }
}
 
