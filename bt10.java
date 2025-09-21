package bt.btvn;

import java.util.ArrayList;
import java.util.Scanner;

public class bt10 {
     public void themPhanTu(ArrayList<Integer> list, int index, int value) {
        if (index < 0 || index > list.size()) {
            System.out.println("Vị trí không hợp lệ!");
            return;
        }
        list.add(index, value);
        System.out.println("Đã thêm " + value + " vào vị trí " + index);
    }

    public void xoaPhanTu(ArrayList<Integer> list, int index) {
        if (index < 0 || index >= list.size()) {
            System.out.println("Vị trí không hợp lệ!");
            return;
        }
        int removed = list.remove(index);
        System.out.println("Đã xóa phần tử " + removed + " tại vị trí " + index);
    }

    public void inDanhSach(ArrayList<Integer> list) {
        System.out.println("Danh sách hiện tại: " + list);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bt10 manageList = new bt10();  // Sửa đây: tạo đối tượng của lớp bt10
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        manageList.inDanhSach(list);
        System.out.print("Nhập giá trị cần thêm: ");
        int valueToAdd = scanner.nextInt();
        System.out.print("Nhập vị trí muốn thêm (0 đến " + list.size() + "): ");
        int addIndex = scanner.nextInt();
        manageList.themPhanTu(list, addIndex, valueToAdd);
        manageList.inDanhSach(list);
        System.out.print("Nhập vị trí cần xóa (0 đến " + (list.size() - 1) + "): ");
        int removeIndex = scanner.nextInt();
        manageList.xoaPhanTu(list, removeIndex);
        manageList.inDanhSach(list);
        scanner.close();
    }
}
