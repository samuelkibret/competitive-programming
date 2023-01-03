class Result {

    /*
     * Complete the 'countSwaps' function below.
     *
     * The function accepts INTEGER_ARRAY a as parameter.
     */
public static void countSwaps(List<Integer> a) {
    // Write your code here
     int temp = 0;
        int size = a.size();
        int count = 0;
        
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (a.get(j) > a.get(j+1)) {
                    count++;
                    temp = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, temp);
                }
            }
        }
         System.out.println("Array is sorted in " + count + " swaps.");
       System.out.println("First Element: " + a.get(0));
       System.out.println("Last Element: " + a.get(a.size() - 1));

    }

}

   
