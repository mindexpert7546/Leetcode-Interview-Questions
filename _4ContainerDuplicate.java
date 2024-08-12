class Solution {
    public boolean containsDuplicate(int[] nums) {
        /**
        
        arr = [1,2,3,1] =4
        set = (1,2,3,) = 3
        
        if len not equal = true;
        if len equal = false;
        
        **/
        
        Set<Integer> set = new HashSet<>();
        
        for(int e:nums){
            set.add(e);
        }
        
        return nums.length!=set.size();
    }
}
