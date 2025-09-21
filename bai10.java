import java.util.ArrayList;
import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử ban đầu
        System.out.print("nhap phan tu ban dau : ");
        int n = sc.nextInt();

        ArrayList<Integer> ds = new ArrayList<>();

        // Nhập các phần tử
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            ds.add(sc.nextInt());
        }

        System.out.println("Danh sách ban đầu: " + ds);

        // ===== Thêm phần tử =====
        System.out.print("Nhập giá trị cần thêm: ");
        int x = sc.nextInt();
        System.out.print("Nhập vị trí muốn thêm (1 -> " + (ds.size() + 1) + "): ");
        int posAdd = sc.nextInt();

        if (posAdd >= 1 && posAdd <= ds.size() + 1) {
            ds.add(posAdd - 1, x);
            System.out.println("Danh sách sau khi thêm: " + ds);
        } else {
            System.out.println("Vị trí thêm không hợp lệ!");
        }

        // ===== Xóa phần tử =====
        System.out.print("Nhập vị trí muốn xóa (1 -> " + ds.size() + "): ");
        int posDel = sc.nextInt();

        if (posDel >= 1 && posDel <= ds.size()) {
            ds.remove(posDel - 1);
            System.out.println("Danh sách sau khi xóa: " + ds);
        } else {
            System.out.println("Vị trí xóa không hợp lệ!");
        }

        sc.close();
    }
}
