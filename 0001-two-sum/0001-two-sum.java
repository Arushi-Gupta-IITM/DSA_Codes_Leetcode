class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);

        for(int i=1; i<n; i++) {
            int curr = nums[i];
            int req = target - nums[i];
            if(map.containsKey(req)) {
                ans[0] = map.get(req);
                ans[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }

        return ans;
    }
}