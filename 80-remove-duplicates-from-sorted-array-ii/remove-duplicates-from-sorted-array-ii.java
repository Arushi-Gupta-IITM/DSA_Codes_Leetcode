class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=1, j=1;
        int curr = nums[0];
        int count = 1;

        while(j < n) {
            if(nums[j] == curr) {
                if(count < 2) {
                    count++;
                    nums[i] = nums[j];
                    i++;
                    j++;
                } else {
                    j++;
                }
            } else {
                count = 0;
                nums[i] = nums[j];
                curr = nums[j];
                i++;
                j++;
                count++;
            }
        }

        return i;
    }
}