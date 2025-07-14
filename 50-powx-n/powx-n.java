class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1.0;
        if(n == 1) return x;

        if(n == Integer.MIN_VALUE) {
            if(x == 1.0 || x == -1.0) return 1.0;
            else return 0.0;
        }

        if(n < 0) {
            int rev = -1 * n;
            double halfPower = myPow(x, rev/2);
            double ans = 0.0;

            if(rev%2 == 0) ans = halfPower * halfPower;
            else ans = x * halfPower * halfPower;
            return 1/ans;
        }

        double halfPower = myPow(x, n/2);

        if(n%2 == 0) return halfPower * halfPower;
        else return x * halfPower * halfPower;
    }
}