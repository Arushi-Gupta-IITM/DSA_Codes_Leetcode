class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;

        for(int i=0; i<n; i++) {
            if(nums[i] != val) {
                list.add(nums[i]);
            }
        }

        int ans = list.size();

        for(int i=0; i<ans; i++) {
            nums[i] = list.get(i);
        }

        return ans;
    }
}