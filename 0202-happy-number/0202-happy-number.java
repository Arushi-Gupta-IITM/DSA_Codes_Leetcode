class Solution {
    public static int digitsSquare(int n) {
        int sum = 0;
        int temp = n;

        while(temp != 0) {
            int lastDigit = temp%10;
            sum += lastDigit * lastDigit;
            temp = temp/10;
        }

        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int temp = n;

        while(true) {
            int sum = digitsSquare(temp);
            if(sum == 1) return true;
            if(set.contains(sum)) return false;
            else {
                temp = sum;
                set.add(sum);
            }
        }
    }
}