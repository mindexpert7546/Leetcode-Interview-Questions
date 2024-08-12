class Solution {
    public int singleNumber(int[] nums) {
        /**
        res = 0
        [4,1,2,1,2]
        
        3^3 = 0
        0^3 = 3
        
        res = 0
        0^4 = 4
        1^1 = 0
        2^2=0
        0^4 = 4
        
        in case of xor if same number then output will be 0
        
        **/
        
        int res = 0;
        
        for(int e:nums){
            res = res^e;
        }
        
        return res;
    }
}
