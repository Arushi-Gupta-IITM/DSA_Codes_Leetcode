class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int si, ei;
        for(int i=0; i<n; i++) {
            int tar = target-numbers[i];
            si = i+1;
            ei = n-1;

            while(si <= ei) {
                int mid = si + (ei-si)/2;
                if(numbers[mid] == tar) {
                    int[] ans = new int[2];
                    ans[0] = i+1;
                    ans[1] = mid+1;
                    return ans;
                } else if(numbers[mid] > tar) ei = mid-1;
                else si = mid+1;
            }
        }

        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        return ans;
    }
}