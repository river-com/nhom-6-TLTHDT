import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i; // cộng dồn
        }

        System.out.println("Tong cac so tu 1 den " + n + " la: " + tong);

        sc.close();
    }
}
