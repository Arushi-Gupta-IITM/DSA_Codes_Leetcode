class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int lastDig = digits[n-1];
        int carry = 0;

        if(lastDig != 9) {
            digits[n-1] = digits[n-1]+1;
            return digits;
        } else {
             carry = 1;
            for(int i=n-1; i>=0; i--) {
                digits[i] = digits[i] + carry;
                if(digits[i] < 10) {
                    carry = 0;
                    break;
                }
                else {
                    digits[i] = 0;
                    carry = 1;
                }
            }
        }

        if(carry == 1) {
            int[] ans = new int[n+1];
            ans[0] = 1;
            for(int i=1; i<n+1; i++) {
                ans[i] = digits[i-1];
            }
            return ans;
        }

        return digits;
    }
}