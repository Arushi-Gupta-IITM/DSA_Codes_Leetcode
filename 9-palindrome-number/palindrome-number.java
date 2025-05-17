class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int temp = 0;

        while(n > 0) {
            temp = temp*10 + n%10;
            n = n/10;
        }

        return temp == x;
    }
}