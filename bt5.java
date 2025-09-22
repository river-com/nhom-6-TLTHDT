package bt.btvn;
import java.util.Scanner;
public class bt5 {
public static int check_so(int val) {
    for(int i=2;i<val;i++){
        if (val % i == 0){
            return i;

        }
    }
    return val;
}
public static void answer(int val) {
    if (val==check_so(val)){
        System.out.println("It is number original");
    }else{
        System.out.println("It isn't number original");
    }
}   
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap so nguyen to: ");
    int val = scanner.nextInt();
    answer(val);
    scanner.close();
}
}
