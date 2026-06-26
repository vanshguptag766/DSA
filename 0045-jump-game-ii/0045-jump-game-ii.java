class Solution {
    public int jump(int[] nums) {
        int ans = 0;    //end
        int end = 0;    //till we can jump
        int far = 0;    //till we can jump at max
        for(int i = 0; i< nums.length-1; i++){
            far = Math.max(far,  i + nums[i]);
            if(far >= nums.length-1){
                ans += 1;
                break;
            }
            if(i == end){
                ans += 1;
                end = far;
            }
        }
        return ans;
    }
}