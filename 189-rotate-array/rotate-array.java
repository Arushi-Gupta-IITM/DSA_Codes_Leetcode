class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        if(k == n) return;

        if(k > n) {
            k = k%n;
        }
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=n-k; i<n; i++) {
            list.add(nums[i]);
        }

        int last = n-k-1;

        for(int i=n-1; i>=k; i--) {
            nums[i] = nums[last];
            last--;
        }

        for(int i=0; i<list.size(); i++) {
            nums[i] = list.get(i);
        }
    }
}