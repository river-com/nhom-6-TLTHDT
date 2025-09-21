import java.util.HashMap;
import java.util.Map;

public class Bai8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 5, 1, 1};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int mostFrequent = arr[0];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Phần tử xuất hiện nhiều nhất: " + mostFrequent);
        System.out.println("Số lần xuất hiện: " + maxCount);
    }
}
