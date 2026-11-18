class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0; nums.length>i;i++){
            for(int j = i+1; nums.length>j;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }   
        }
        return false;
    }
}
