class Solution {
    public int[] plusOne(int[] digits) {
        /**
        Case#1 -> if none of element 9 -> simple add 1 at last then return 
        {
          [4,5,6,3,5,6]  = 456356 + 1= 456357
          
          4,5,6,3,5,7 = o/p
          
        }
        
        Case#2 -> if the array container 9, track the array form the end and fill the every element by 0 when ll       get not 9 then add 1 in that 
        
        [3,4,5,9,9,9]
        3,46,0,0,0 = o/p
        
        case#3 ->  if all element is 9 then create a new array with length+1 size of the original array fill 
        all element as 0 and first element as 1
        
        {
          [9,9,9,9] 
          
          => [1,0,0,0,0] = o/p
        }
        
        {
         [3,4,6,0,0,0]
              c
        }
        
        {
         [9,0,0,0] 
          c=0
        }
        **/
        
        int currentEnd = digits.length-1;
        
        while(digits[currentEnd]==9){
            if(currentEnd == 0){
                int[] newArr = new int[digits.length+1];
                newArr[0]++;
                return newArr;
            }
            digits[currentEnd]=0;
            currentEnd--;
        }
        
        digits[currentEnd]++;
        
        return digits;
        
        
    }
}
