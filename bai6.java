import java.util.Scanner;

public class Bai6_GcdLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        long a = readLong(sc);
        System.out.print("Nhập số nguyên b: ");
        long b = readLong(sc);

        long gcd = gcd(Math.abs(a), Math.abs(b));
        long lcm = 0;
        if (a == 0 || b == 0) {
            lcm = 0; // theo convention: lcm với 0 đặt là 0
        } else {
            lcm = Math.abs((a / gcd) * b); // tránh overflow hơn bằng cách chia trước
        }

        System.out.printf("UCLN (%d, %d) = %d\n", a, b, gcd);
        System.out.printf("BCNN (%d, %d) = %d\n", a, b, lcm);

        sc.close();
    }

    private static long gcd(long x, long y) {
        while (y != 0) {
            long t = x % y;
            x = y;
            y = t;
        }
        return x;
    }

    private static long readLong(Scanner sc) {
        while (!sc.hasNextLong()) {
            System.out.print("Giá trị không hợp lệ. Nhập lại: ");
            sc.next();
        }
        return sc.nextLong();
    }
}
