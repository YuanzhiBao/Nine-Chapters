public class Powxn {
    /**
     * @param x the base number
     * @param n the power number
     * @return the result
     */
    public double myPow(double x, int n) {
        if (n < 0) {
            return 1.0 / myPowHelper(x, -n);
        } else {
            return myPowHelper(x, n);
        }
    }
    public double myPowHelper(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        double v = myPowHelper(x, n / 2);
        if (n % 2 == 0) {
            return v * v;
        } else {
            return v * v * x;
        }
    }
}