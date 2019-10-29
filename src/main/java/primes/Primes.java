package primes;

import java.util.ArrayList;
import java.util.List;

public class Primes {

    private List<Integer> primes;

    public Primes(int n) {
        primes = getPrimesUpToN(n);
    }

    public List<Integer> getPrimes() {
        return primes;
    }

    public static boolean isPrime(int num) {
        for (int i=2; i<=Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static List<Integer> getPrimesUpToN(int n) {
        List<Integer> primesUpToN = new ArrayList<Integer>();
        for (int i=2; i<=n; i++) {
            if (isPrime(i))
                primesUpToN.add(i);
        }
        return primesUpToN;
    }
}
