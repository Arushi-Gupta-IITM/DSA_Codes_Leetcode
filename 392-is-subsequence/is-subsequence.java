class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();

        int i = 0, j = 0;

        while(j < n2 && i < n1) {
            if(t.charAt(j) == s.charAt(i)) i++;
            j++;
        }

        return i==n1;
    }
}