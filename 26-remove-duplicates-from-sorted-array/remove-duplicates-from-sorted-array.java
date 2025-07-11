class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        list.add(nums[0]);

        for(int i=1; i<n; i++) {
            if(nums[i] != list.get(list.size()-1)) {
                list.add(nums[i]);
            }
        }

        for(int i=0; i<list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }
}