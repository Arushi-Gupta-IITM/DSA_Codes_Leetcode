class Solution {
    public int searchInsert(int[] nums, int target) {
        //Search for target
        int si = 0;
        int ei = nums.length - 1;
        int mid;

        while(si <= ei) {
            mid = si + (ei-si)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) ei = mid-1;
            else si = mid+1;
        }

        return si;
    }
}