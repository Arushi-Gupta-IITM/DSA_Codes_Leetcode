class Solution {
    public static char isAlphaNumeric(char ch) {
        if(ch >= 'a' && ch <= 'z') return ch;
        if(ch >= 'A' && ch <= 'Z') return (char)(ch+32);
        if(ch >= '0' && ch <= '9') return ch;
        return '@';
    }
    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder("");

        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);
            char ch2 = isAlphaNumeric(ch);
            if(ch2 != '@') ans.append(ch2);
        }

        String str = ans.toString();

        int si = 0;
        int ei = str.length()-1;       

        while(si <= ei) {
            if(str.charAt(si) != str.charAt(ei)) return false;
            si++;
            ei--;
        }

        return true;
    }
}