//import java.util.ArrayList;
//import java.util.List;
//
//public class Problem0003 {
//
//    public static void main(String[] args) {
//       long num = 600851475143L;
//       System.out.println(pollardsRho(3));
//    }
//
//    private static List<Integer> findPrimeFactors(long intToFactor) {
//        List<Integer> primeFactors = new ArrayList<>();
//
//
//
//        return primeFactors;
//    }
//
//    private static boolean isPrime(long x)
//
//    private static long pollardsRho(long intToFactor) {
//        long x = 2;
//        long y = x;
//        long d = 1;
//
//        while (d == 1) {
//            x = pollardsRho_g(intToFactor, x);
//            y = pollardsRho_g(intToFactor, pollardsRho_g(intToFactor, y));
//            d = gcd(Math.abs(x - y), intToFactor);
//        }
//
//        if (d == intToFactor) {
//            return -1;
//        }
//        else return d;
//    }
//
//    private static long pollardsRho_g(long intToFactor, long x) {
//        return (long) (Math.pow(x, 2) - 1) % intToFactor;
//    }
//
//    private static long gcd(long x, long y) {
//        long a = x;
//        long b = y;
//
//        while (b != 0) {
//            long t = b;
//            b = a % b;
//            a = t;
//        }
//
//        return a;
//    }
//
//}
