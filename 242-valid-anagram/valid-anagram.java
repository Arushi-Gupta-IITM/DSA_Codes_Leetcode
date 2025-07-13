class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) map.put(ch, map.get(ch)+1);
            else map.put(ch, 1);
        }

        for(int i=0; i<n; i++) {
            char ch = t.charAt(i);
            if(map.containsKey(ch) == false) return false;
            else {
               if(map.get(ch) == 1) map.remove(ch);
               else map.put(ch, map.get(ch)-1); 
            }
        }

        return map.isEmpty();
    }
}