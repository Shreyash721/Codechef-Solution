class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) continue;
            if((nums[i] - nums[i-1])==1){
                c++;
            }
            else{
               max=Math.max(c,max);
               c=1;
            }
        }
        
        max=Math.max(max,c);
        return max;
        
        
    }
}

