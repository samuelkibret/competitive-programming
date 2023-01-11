class Solution {
    public int[][] merge(int[][] intervals) {
//         int[][] temp = new int[1][];
//         int[][] ans = new int[intervals.length][];
//         for(int i = 0 ; i < intervals.length ; i++)
//         {
//         for(int j =0 ; j < intervals.length - 1 ; j++)
//         {
//             if(intervals[j][0] > intervals[j + 1][0])
//             {
//                 temp[0][0] = intervals[j][0];
//                 temp[0][1] = intervals[j][1];
//                 intervals[j][0] = intervals[j + 1][0];
//                 intervals[j][1] = intervals[j + 1][1];
//                 intervals[j + 1][0] = temp[0][0];
//                 intervals[j + 1][1] = temp[0][1];
//             }
//         }
//         }
//         //solve conflict.
//      for(int k = 0 ; k < intervals.length ; k++)
//      {
//          if(intervals[k][0] < intervals[k + 1])
//      }
        
        //this is a solution i have found on leetcode solution.
        // I will put mine soon hopefully :)
            //solve conflict.
     
 Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> res=new ArrayList<>();
        int low=intervals[0][0];
        int high=intervals[0][1];

        for(int i=1;i<intervals.length;i++)
        {
           if(intervals[i][0]<=high){
               if(high<intervals[i][1])
               high=intervals[i][1];
           }
           else{
               res.add(new int[]{low,high});
               low=intervals[i][0];
               high=intervals[i][1];
           }
        }
        res.add(new int[]{low,high});  
       return res.toArray(new int[0][]); 
    }
}
