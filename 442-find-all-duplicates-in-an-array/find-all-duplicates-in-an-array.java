class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();

        int n = nums.length;
        int i = 0;

        while (i < n) {

            int rightIdx = nums[i] - 1;

            if (nums[i] == i + 1) {
                i++;
            }
            else if (nums[i] == nums[rightIdx]) {
                i++;
            }
            else {
                swap(nums, i, rightIdx);
            }
        }

        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1)
                ans.add(nums[i]);
        }

        return ans;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}