class Solution {
public:
    void sortColors(vector<int>& nums) {
        int n = nums.size();

        int in = 0;
        for(int i=0; i<n; i++) {
            if(nums[i] == 0) {
                swap(nums[i], nums[in]);
                in++;
            }
        }

        for(int i=in; i<n; i++) {
            if(nums[i] == 1) {
                swap(nums[i], nums[in]);
                in++;
            }
        }
    }
};