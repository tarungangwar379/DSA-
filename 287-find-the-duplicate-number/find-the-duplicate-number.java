class Solution {
    public int findDuplicate(int[] nums) {
        int si = 1;
        int ei = nums.length-1;
        
        while(si < ei){
            int mid = (si + ei)/2;
            int count = 0;
            for(int i = 0; i< nums.length; i++){
                if(nums[i] <= mid){
                    count++;
                }
            }
                if(count > mid){
                    ei = mid;
                }else
                    si = mid+1;
                
            }
        
        return si;
        
    }
}