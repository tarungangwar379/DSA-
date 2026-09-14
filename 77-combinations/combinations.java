class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1,n,k,new ArrayList<>(), result);
        return result;
        
    }

    public void backtrack(int start, int n, int k, List<Integer> ans, List<List<Integer>> result){
        // base case
        if(ans.size() == k){
            result.add(new ArrayList<> (ans));
            return;

        }

        for(int i = start; i<=n; i++){
            ans.add(i);
            backtrack(i+1,n,k,ans,result);
            ans.remove(ans.size()-1);
        }
    }
}