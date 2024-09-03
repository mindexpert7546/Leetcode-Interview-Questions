class Solution {
    public int reverse(int x) {
        /**
        
        Input: x = 123
        
        123 %10 = 3
        res = 0
        
        res *10 + mod
        
        **/
        
        int res = 0;
        
        while(x != 0){
            int mod = x%10;
            
            int temp = res*10+mod;
            
            if((temp - mod) /10 != res) return 0; // back by one step
            x = x/10;
            
            res = temp;
            
        }
        
        return res;
    }
}
