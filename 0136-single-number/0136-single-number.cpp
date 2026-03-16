class Solution {
public:
    int singleNumber(vector<int>& nums) { // pass by reference
        int ans = 0;
        for(int val : nums) {
            ans = ans ^ val;
        }
        return ans;
    }
};