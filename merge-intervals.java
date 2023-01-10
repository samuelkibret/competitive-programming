class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] temp = new int[1][];
        int[][] ans = new int[intervals.length][];
        for(int i = 0 ; i < intervals.length ; i++)
        {
        for(int j =0 ; j < intervals.length - 1 ; j++)
        {
            if(intervals[j][0] > intervals[j + 1][0])
            {
                temp[0][0] = intervals[j][0];
                temp[0][1] = intervals[j][1];
                intervals[j][0] = intervals[j + 1][0];
                intervals[j][1] = intervals[j + 1][1];
                intervals[j + 1][0] = temp[0][0];
                intervals[j + 1][1] = temp[0][1];
            }
        }
        }
        //solve conflict.
     for(int k = 0 ; k < intervals.length ; k++)
     {
         if(intervals[k][0] < intervals[k + 1])
     }
 
    }
}
