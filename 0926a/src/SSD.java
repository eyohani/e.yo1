public class SSD {
    public static void main(String[] args) {
        int sum = 0;

        for (int num = 2; num <= 1000; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum += num;
            }
        }

        System.out.println("1부터 1000 사이의 소수의 합은: " + sum);
    }
}