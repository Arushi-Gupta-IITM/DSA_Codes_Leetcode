class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = new int[m+n];
        int idx = 0;
        int i =0;
        int j = 0;

        while(i < m && j < n) {
            if(nums1[i] <= nums2[j]) {
                temp[idx] = nums1[i];
                idx++;
                i++;
            } else {
                temp[idx] = nums2[j];
                idx++;
                j++;
            }
        }

        while(i < m) {
            temp[idx] = nums1[i];
            idx++;
            i++;
        }

        while(j < n) {
           temp[idx] = nums2[j];
            idx++;
            j++; 
        }

        for(idx=0; idx<m+n; idx++) {
            nums1[idx] = temp[idx];
        }
    }
}