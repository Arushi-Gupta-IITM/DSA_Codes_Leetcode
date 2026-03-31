class Solution {
public:
    bool isAnagram(string s, string t) {
        int n1 = s.length();
        int n2 = t.length();

        if(n1 != n2) return false;
        vector<int> map(26, 0);

        for(int i=0; i<n1; i++) {
            char ch = s[i];
            map[ch-'a'] += 1;
        }

        for(int i=0; i<n2; i++) {
            char ch = t[i];
            map[ch-'a'] -= 1;
            if(map[ch-'a'] < 0) return false;
        }

        for(int i=0; i<26; i++) {
            if(map[i] != 0) return false;
        }
        return true;
    }
};