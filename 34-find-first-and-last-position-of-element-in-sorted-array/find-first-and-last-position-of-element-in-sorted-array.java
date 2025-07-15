class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int n = nums.length;

        if(n == 1 && nums[0] == target) {
            ans[0] = 0;
            ans[1] = 0;

            return ans;
        }

        if(n == 2) {
            if(nums[0] == target && nums[1] == target){
                ans[0] = 0;
                ans[1] = 1;
                return ans;
            }
            else if(nums[0] == target) {
                ans[0] = 0;
                ans[1] = 0;
                return ans;
            } 
            else if(nums[1] == target) {
                ans[0] = 1;
                ans[1] = 1;
                return ans;
            } else {
                return ans;
            }
        }

        int si = 0;
        int ei = n-1;
        int mid;

        while(si <= ei) {
            mid = si + (ei-si)/2;

            if(nums[mid] == target) {
                //look for start and end
                int start = 0, end = n-1;
                for(int i=mid; i>=0; i--) {
                    if(nums[i] != target) {
                        start = i+1;
                        break;
                    }
                }

                for(int i=mid; i<n; i++) {
                    if(nums[i] != target) {
                        end = i-1;
                        break;
                    }
                }

                ans[0] = start;
                ans[1] = end;
                return ans;
            } else if(nums[mid] > target) ei = mid-1;
            else si = mid+1;
        }
        return ans;
    }
}