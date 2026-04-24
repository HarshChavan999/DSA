public class leetcode {
    public static void main(String[] args) {
        System.out.println(myPow(2.0, 10)); // 1024.0
    }

    public static double myPow(double x, int n) {
        long power = n;  // handle overflow case
        if (power < 0) {
        x = 1 / x;
        power = -power;
    }

    double result = 1;

    while (power > 0) {
        if (power % 2 == 1) {  // odd
            result *= x;
        }
        x *= x;       // square
        power /= 2;   // reduce
    }

 
    
}

}
