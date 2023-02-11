class Solution {
  //this was asolution I find on leet code
    public int[] topKFrequent(int[] nums, int k) {
    int[] rsl = new int[k];
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int n : nums) {
        map.put(n, map.getOrDefault(n, 0)+1);
    }  
    while (k > 0) {
        Integer key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey(); // find key associated with the max value in the map 
        map.put(key, 0);
        rsl[k-1] = key;
        k--;
    }
    return rsl;
    }
    }
