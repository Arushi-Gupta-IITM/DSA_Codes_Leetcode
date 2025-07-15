class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s = s+" ";

        int n = s.length();
        ArrayList<String> words = new ArrayList<>();

        String word = "";

        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);
            if(ch != ' ') {
                word = word + ch;
            } else {
                if(word.length() > 0 && word.charAt(0) != ' ') words.add(word);                
                word = "";
            }
        }

        String ans = "";
        n = words.size();

        for(int i=n-1; i>=0; i--) {
            ans = ans + words.get(i) + " ";
        }

        ans = ans.trim();
        return ans;
    }
}