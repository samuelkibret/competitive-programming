  public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
        
Integer[] ans = new Integer[100]; // creating an array of size 100
    Arrays.fill(ans , 0); // initializing it to 0
    for(int element : arr){
        ans[element]++; // incrementing the values
    }
    return Arrays.asList(ans);// returning the array as a list
  }
