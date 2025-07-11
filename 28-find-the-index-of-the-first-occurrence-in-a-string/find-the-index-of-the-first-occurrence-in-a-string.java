class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int m = haystack.length();
        if(haystack.equals(needle)) return 0;
        String str;

        for(int i=0; i<m-n+1; i++) {
            str = haystack.substring(i, i+n);
            if(str.equals(needle)) return i;
        }

        return -1;
    }
}