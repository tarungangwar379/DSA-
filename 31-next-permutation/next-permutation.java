class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        // find pivot
        int pivot = -1;
        for(int i = n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }
        
        // if pivot is found find greater element 
        if(pivot != -1){
            for(int i = n-1; i>pivot ;i-- ){
                if(nums[i] > nums[pivot]){
                    // swap
                    int temp = nums[i];
                    nums[i] = nums[pivot];
                    nums[pivot] = temp;

                    break;
                }
            }
        }
        // reverse suffix
        int left = pivot +1;
        int right = n-1;
        while(left < right ){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}