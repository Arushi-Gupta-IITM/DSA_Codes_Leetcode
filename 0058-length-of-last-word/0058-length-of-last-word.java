class Solution {
    public int lengthOfLastWord(String s) {
        s = s+" ";
        String[] words = s.split(" ");
        return words[words.length-1].length();
    }
}