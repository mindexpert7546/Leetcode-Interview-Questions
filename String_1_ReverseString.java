class Solution {
    public void reverseString(char[] s) {
        /**
                             e
        Input: s = ["o","l","l","e","h"]
                             s
        **/
        
        int st = 0;
        int ed = s.length-1;
        
        while(st<=ed){
            char temp = s[st];
            s[st] = s[ed];
            s[ed]=temp;
            st++;
            ed--;
        }
    }
}
