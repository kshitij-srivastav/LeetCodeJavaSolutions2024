class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans =0;
        for(int i =0;i<s.length();i++){
        char ch =s.charAt(i);
            ans+=Math.abs(i-t.indexOf(ch));
        }
        return ans;
    }
}