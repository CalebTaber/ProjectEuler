public class Problem0002 {

    public static void main(String[] args) {
        // Get fibonacci numbers <= 4,000,000
        // Sum even valued terms (every third term)
        // 1 1 2 3 5 8 13 ...
        // odd + odd = even
        // odd + even = odd
        // even + odd = odd
        // odd + odd = even

        int sum = 0;
        int previous = 1;
        int next = 1;
        while (next < 4000000) {
            previous = next - previous;
            next = next + previous;

            previous = next - previous;
            next = next + previous;

            sum += next;

            previous = next - previous;
            next = next + previous;
        }

        // Should be 4613732
        System.out.println(sum);
    }

}
