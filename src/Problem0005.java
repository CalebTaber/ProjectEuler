import java.util.ArrayList;
import java.util.List;

public class Problem0005 {

    public static void main(String[] args) {
        // Multiply the factors of each number in this list by the factors of each other number
        // and stop adding numbers when 1-20 is present in the factors list


//        List<List<Integer>> factors = new ArrayList<>(20);
//        for (int i = 1; i <= 20; i++) {
//            factors.add(factor(i));
//            System.out.println(i + " | " + factors.get(i - 1));
//        }

        for (long x = 40L; x < 1000000000L; x++) {
            for (int i = 20; i >= 2; i--) {
                if (x % i != 0) break;

                if (i == 2) {
                    System.out.println(x);
                    return;
                }
            }
        }


    }

    private static List<Integer> factor(int numberToFactor) {
        List<Integer> factors = new ArrayList<>(2);
        factors.add(1);

        for (int i = 2; i <= Math.ceilDiv(numberToFactor, 2); i++) {
            if (numberToFactor % i == 0) factors.add(i);
        }

        if (numberToFactor != 1) factors.add(numberToFactor);

        return factors;
    }

}
