public class Problem0006 {

    public static void main(String[] args) {
        long sumOfSquares = (100 * 101 * 201) / 6; // Mathematical fact that sum of squares = (n)(n+1)(2n+1)/6
        long squareOfSum = (long) Math.pow((100.0 * 101.0) / 2.0, 2); // Mathematical fact that square of sums = n(n+1)/2
        System.out.println(squareOfSum - sumOfSquares);
    }

}
