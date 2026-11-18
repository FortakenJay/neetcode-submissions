class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; nums.length > i; i++){
            for(int j = i+1; nums.length > j; j++){
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result; 
    }
}
