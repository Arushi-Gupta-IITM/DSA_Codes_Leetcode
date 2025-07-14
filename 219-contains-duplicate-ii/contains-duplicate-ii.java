class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        map.put(nums[0], 0);

        for(int i=1; i<n; i++) {
            if(map.containsKey(nums[i])) {
                int dist = i - map.get(nums[i]);
                if(dist <= k) return true;
                else map.put(nums[i], i);
            } else {
                map.put(nums[i], i);
            }
        }

        return false;
    }
}