class Solution {  
    public int search(int[] nums, int target) {
        int n = nums.length;
        int si=0 , li= n-1;
        while(si<=li){
           int mid = (si+li)/2;
            if(nums[mid]==target) return mid;
            else if (nums[mid] > target )
                li = mid-1;

            
            else 
                si = mid+1;
            

        }
        return -1;        
    }
}