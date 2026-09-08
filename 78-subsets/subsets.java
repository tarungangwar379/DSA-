class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        findSubsets(nums, ans, 0, result);
        return result;
    }

    public void findSubsets(int[] nums, ArrayList<Integer> ans, int i, List<List<Integer>> result) {
        if (i == nums.length) {
            result.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        findSubsets(nums, ans, i + 1, result);
        ans.remove(ans.size() - 1);
        findSubsets(nums, ans, i + 1, result);

    }

}