import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println(n + " là số dương.");
        } else if (n < 0) {
            System.out.println(n + " là số âm.");
        } else {
            System.out.println("Số bạn nhập bằng 0.");
        }

        scanner.close();
    }
}
