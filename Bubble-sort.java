class Result {

    /*
     * Complete the 'countSwaps' function below.
     *
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static void countSwaps(List<Integer> a) {
    // Write your code here
    int i = 0;
    int j = 0;
    int count = 0;
       for(i = 0 ;i < a.size(); i++)
       {
           for(j = 0 ; j < a.size() - i - 1 ; j++)
           {
               if(a.get(j) > a.get(j + 1)){
                     count++;
                   Integer temp = a.get(j);
                   a.set(j + 1 , a.get(j));
                   a.set(j , temp);
                   
               }
           }
       }
       System.out.println("Array is sorted in " + count + " swaps.");
       System.out.println("First Element: " + a.get(0));
       System.out.println("Last Element: " + a.get(a.size() - 1));
       return;
    }

}
