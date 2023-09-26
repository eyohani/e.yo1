public class SSD {
    public static void main(String[] args) {
        int max = 1000;
        boolean[] a = new boolean[max + 1]; // 각 숫자가 소수인지 여부를 저장하는 배열
        for (int i = 2; i <= max; i++) {
            a[i] = true;
        }
        for (int p = 2; p * p <= max; p++) {
            if (a[p]) {
                for (int i = p * p; i <= max; i += p) {
                    a[i] = false;
                }
            }
        }
        int sum = 0;
        System.out.println("1부터 1000 사이의 소수는:");
        for (int i = 2; i <= max; i++) {
            if (a[i]) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println("\n1부터 1000 사이의 소수의 합은: " + sum);
    }
}