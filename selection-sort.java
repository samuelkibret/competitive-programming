class Solution
{
  //selection sort picks the min value from given array
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int min = i;
        for(int j =i  ; j < arr.length ; j++)
        {
          if(arr[j] < arr[min] )
        {
            min = j;
        }  
        }
        
        return min;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
    //puts the min value at the right index
	    for(int i = 0 ;i < n ; i++)
	    {
	        int index = select(arr , i);
	        //swap
	        int temp = arr[index];
	        arr[index] = arr[i];
	        arr[i] = temp;
	        
	    }
