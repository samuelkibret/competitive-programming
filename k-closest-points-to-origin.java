class Solution {
    public int[][] kClosest(int[][] points, int k) {
        double[] ans = new double [points.length]; 
        int[][]rans = new int[k ][2];
      // how far each point is from the origin and save it in the array ans
        for(int i = 0 ; i < points.length ; i++ )
        {
            for(int j = 0 ; j < 2 ; j++)
            {
                ans[i] = Math.sqrt(points[i][0]*points[i][0] + points[i][1]*points[i][1]);
            }

        }
        
        int count = 0;
        int min = 0;
      //save the smalles t values into the rans array
        while(count < k){
            for(int i = 0 ; i < points.length ; i++)
            {
                if(ans[min] > ans[i] )
                 {
                     min = i;
                 }
            }
            rans[count][0] = points[min][0];
            rans[count][1] = points[min][1];
            ans[min] = Double.MAX_VALUE;
            count++;
        }
        return rans;
    }
