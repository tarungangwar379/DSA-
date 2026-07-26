class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLen = 0;
        while (right < s.length()){
            char ch = s.charAt(right);

    //Duplicatehai
    if(set.contains(ch)){
        set.remove(s.charAt(left));
       left ++;

    } 
     //Duplicate nahi hai
     else{
        set.add(ch);
        maxLen = Math.max(maxLen , right-left+1);
        right++;

     }

        }
        return maxLen;
    }
}