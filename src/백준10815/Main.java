package 백준10815;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer,Integer> list = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n; i++) list.put(scanner.nextInt(),0);
        int m = scanner.nextInt();
        for (int j = 1; j <= m; j++) {
            if (list.containsKey(scanner.nextInt())) stringBuilder.append("1").append(" ");
            else stringBuilder.append("0").append(" ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() -1);
        System.out.println(stringBuilder);
    }
}
