public class Problem0004 {

    public static void main(String[] args) {
        int largestPalindrome = -1;
        for (int x = 999; x >= 100; x--) {
            for (int y = 999; y >= 100; y--) {
                if (isPalindrome(String.valueOf(x * y)) && x * y > largestPalindrome) {
                    largestPalindrome = x * y;
                }
            }
        }

        System.out.println(largestPalindrome);
    }

    private static boolean isPalindrome(String candidate) {
        StringBuilder reverse = new StringBuilder(candidate).reverse();

        return candidate.contentEquals(reverse);
    }

}
