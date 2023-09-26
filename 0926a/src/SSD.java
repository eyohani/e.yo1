public class SSD {
    public static void main(String[] args) {
        int sum = 0;

        for (int x = 2; x <= 1000; x++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += x;
            }
        }
        System.out.println("1부터 1000 사이의 소수의 합은: " + sum);
    }
}