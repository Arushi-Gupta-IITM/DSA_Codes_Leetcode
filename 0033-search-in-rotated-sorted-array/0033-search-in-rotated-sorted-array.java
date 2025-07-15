class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        int si = 0;
        int ei = n-1;

        while(si <= ei) {
            int mid = si + (ei-si)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] >= nums[ei]) { //mid lies on line1
                if(target >= nums[si] && target < nums[mid]) ei = mid-1;
                else si = mid+1;
            } else { //mid lies on line2
                if(target > nums[mid] && target <= nums[ei]) si = mid+1;
                else ei = mid-1;
            }
        }

        return -1;
    }
}