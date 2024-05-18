public class Problem0006 {

    public static void main(String[] args) {
        long sumOfSquares = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfSquares += (long) Math.pow(i, 2);
        }

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        long squareOfSum = (long) Math.pow(sum, 2);

        System.out.println(squareOfSum - sumOfSquares);
    }

}
