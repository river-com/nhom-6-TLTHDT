import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai9_Ds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn muốn nhập bao nhiêu phần tử (n): ");
        int n = readInt(sc);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử %d: ", i + 1);
            list.add(readInt(sc));
        }

        System.out.println("Danh sách các phần tử:");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("Phần tử %d = %d\n", i + 1, list.get(i));
        }

        // Thêm ví dụ: in phần tử lớn nhất, nhỏ nhất (nếu cần)
        if (!list.isEmpty()) {
            int max = list.get(0), min = list.get(0);
            for (int v : list) {
                if (v > max) max = v;
                if (v < min) min = v;
            }
            System.out.println("Phần tử lớn nhất: " + max);
            System.out.println("Phần tử nhỏ nhất: " + min);
        }

        sc.close();
    }

    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Giá trị không hợp lệ. Nhập lại: ");
            sc.next();
        }
        return sc.nextInt();
    }
}
