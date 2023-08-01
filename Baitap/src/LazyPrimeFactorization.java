public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int number = 2;

        while (true) {
            if (isPrime(number)) {
                System.out.println("LazyPrimeFactorization: " + number);
            }

            number++;
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
