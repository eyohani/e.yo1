public class SSD {
    public static void main(String[] args) {
        int sum = 0;

        for (int x = 2; x <= 1000; x++) {
            boolean isPrime = true;

            // 2부터 해당 숫자의 제곱근까지 나누어 소수를 판별합니다.
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // 소수인 경우 합산합니다.
            if (isPrime) {
                sum += x;
            }
        }

        System.out.println("1부터 1000 사이의 소수의 합은: " + sum);
    }
}