class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();

        for(int i=0; i<n; i++) {
            int tar = 0 - nums[i];
            for(int j=i+1; j<n; j++) {
                int target = tar - nums[j];
                int si = j+1;
                int ei = n-1;

                while(si <= ei) {
                    int mid = si + (ei - si)/2;
                    if(nums[mid] == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[mid]);
                        set.add(list);
                        break;
                    }
                    else if(nums[mid] > target) ei = mid-1;
                    else si = mid+1;
                }
            }
        }

        for(List<Integer> list : set) {
            ans.add(list);
        }
        return ans;
    }
}