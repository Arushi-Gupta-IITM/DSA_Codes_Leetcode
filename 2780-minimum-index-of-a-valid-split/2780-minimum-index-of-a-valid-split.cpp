class Solution {
public:
    int minimumIndex(vector<int>& nums) {
        int n = nums.size();
        
        // finding majority element
        int freq = 0, ans = 0;
        for(int i=0; i<n; i++) {
            if(freq == 0) {
                ans = nums[i];
            }

            if(ans == nums[i]) {
                freq++;
            } else {
                freq--;
            }
        }

        freq = 0;
        for(int i=0; i<n; i++) {
            if(nums[i] == ans) {
                freq++;
            }
        }

        if(freq <= n/2) return -1;

        int leftCount = 0;
        for(int sp=0; sp<=n-2; sp++) {
            
            if(nums[sp] == ans) leftCount++;

            int leftSize = sp+1;
            int rightSize = n - leftSize;
            int rightCount = freq - leftCount;

            if((leftCount > leftSize/2) && (rightCount > rightSize/2)) {
                return sp;
            }
        }

        return -1;
    }
};