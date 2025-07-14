class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        int n = strs.length;

        for(int i=1; i<n; i++) {
            String word = strs[i];
            int min = Math.min(ans.length(), word.length());
            int j;

            for(j=0; j<min; j++) {
                if(ans.charAt(j) != word.charAt(j)) break;
            }

            ans = ans.substring(0, j);
        }

        return ans;

    }
}