class Solution {
    public boolean wordPattern(String pattern, String s) {
        s = s.trim();
        s = s+" ";
        int n = s.length();
        ArrayList<String> list = new ArrayList<>();

        String word = "";

        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);

            if(ch != ' ') {
                word = word + ch;                
            } else {
                list.add(word);
                word = "";
            }
        }

        if(pattern.length() != list.size()) return false;
        n = pattern.length();

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for(int i=0; i<n; i++) {
            char ch = pattern.charAt(i);
            word = list.get(i);

            if(map1.containsKey(ch) && map1.get(ch).equals(word) && map2.containsKey(word) && map2.get(word) == ch) continue;
            if(map1.containsKey(ch) == false && map2.containsKey(word) == false) {
                map1.put(ch, word);
                map2.put(word, ch);
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}