package bt.btvn;
import java.util.Arrays;
import java.util.Scanner;
public class bt7 {
public void in_array(int[] arr,Scanner scanner){
    for (int i=0;i<arr.length;i++){
        arr[i]= scanner.nextInt();
    }
}
public int sum_array(int[] arr){
    int sum = 0;
     for (int i=0;i<arr.length;i++){
      sum = sum + arr[i];
    }
    return sum;
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    bt7 obj = new bt7();
    System.out.println("Nhap gia tri phan tu cho mang:");
    int [] arr = new int[5];
    obj.in_array(arr,scanner);
    int val = obj.sum_array(arr);
    System.out.println("tong cua mang:"+ val);
    scanner.close();

}
}
