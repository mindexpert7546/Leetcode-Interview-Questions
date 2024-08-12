class Solution {
    public void rotate(int[] nums, int k) {
        /**
      L   [1,2,3,4,5,6,7], k =3; R = 7-3-1
         
           1,2,3,4  5,6,7 - 1 case - low =0, heigh = len - k -1
         4,3,2,1,7,6,5  - 2 case - low = 0 heigh = len - k
         5,6,7,1,2,3,4
         
         3, k = 4;
         
         1,2,3
         
         3,1,2
         
         3,1,2
         2,3,1
         1,2,3
         3,1,2 //op
         4%3 = 1
         
         
         
         
        **/
        
        k=k%nums.length;
        
        reverseArr(nums, 0, nums.length-k-1);
        reverseArr(nums, nums.length-k, nums.length-1);
        reverseArr(nums,0, nums.length-1);
        
    }
    
    
    //to reverse the array
    public static void reverseArr(int arr[], int low, int heigh){
        
        while(low<heigh){
            int temp = arr[low];
            arr[low]=arr[heigh];
            arr[heigh]=temp;
            low++;
            heigh--;
        }
    }
}
