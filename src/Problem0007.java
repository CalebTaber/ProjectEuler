import java.util.ArrayList;
import java.util.List;

public class Problem0007 {

    public static void main(String[] args) {
        System.out.println(sieveOfEratosthenes(104750).get(10000));
    }

    /**
     * Use the Sieve of Eratosthenes to generate primes on the interval [1, generationLimit]
     */
    private static List<Integer> sieveOfEratosthenes(int generationLimit) {
        List<Integer> primes = new ArrayList<>();

        // Array representing integers 1...generationLimit
        // true == composite, false == unmarked
        boolean[] sieve = new boolean[generationLimit];
        sieve[0] = true;

        int p = 1; // Index of the next prime number, starting at 1 (num = 2)
        do {
            primes.add(p + 1);

            // Mark off multiples of p+1 (the value represented by the index p)
            for (int i = p; i < sieve.length; i += p + 1) {
                sieve[i] = true;
            }

            // Find smallest unmarked index
            for (int i = p + 1; i < sieve.length; i++) {
                if (!sieve[i]) {
                    p = i;
                    break;
                }
            }
        } while (!sieve[p]);

        return primes;
    }

}
