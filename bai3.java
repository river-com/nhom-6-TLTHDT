import java.util.Scanner;

public class Bai3_ptcb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== Máy tính đơn giản ==");
        System.out.print("Nhập số thứ nhất: ");
        double a = readDouble(sc);
        System.out.print("Nhập số thứ hai: ");
        double b = readDouble(sc);

        System.out.println("Chọn phép toán:");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Nhân");
        System.out.println("4. Chia");
        System.out.print("Lựa chọn (1-4): ");
        int choice = readInt(sc);

        switch (choice) {
            case 1:
                System.out.printf("Kết quả: %.6f\n", a + b);
                break;
            case 2:
                System.out.printf("Kết quả: %.6f\n", a - b);
                break;
            case 3:
                System.out.printf("Kết quả: %.6f\n", a * b);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Lỗi: Chia cho 0 không được phép.");
                } else {
                    System.out.printf("Kết quả: %.6f\n", a / b);
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }

        sc.close();
    }

    private static double readDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.print("Giá trị không hợp lệ. Nhập lại: ");
            sc.next();
        }
        return sc.nextDouble();
    }

    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Giá trị không hợp lệ. Nhập lại: ");
            sc.next();
        }
        return sc.nextInt();
    }
}
