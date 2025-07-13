class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       //HashMap with character and its frequency in magazine
       int n = magazine.length();
       HashMap<Character, Integer> map = new HashMap<>();

       for(int i=0; i<n; i++) {
        char ch = magazine.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
       } 

       n = ransomNote.length();
       for(int i=0; i<n; i++) {
        char ch = ransomNote.charAt(i);
        if(map.containsKey(ch) == false) return false;
        else {
            if(map.get(ch) == 1) map.remove(ch);
            else map.put(ch, map.get(ch)-1);
        }
       }

       return true;
    }
}