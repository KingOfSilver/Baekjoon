package Map.숫자카드2_10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        int n = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int temp, value;
        for (int i = 0; i < n; i++) {
            temp = Integer.parseInt(stringTokenizer.nextToken());
            value = map.getOrDefault(temp, 0);
            map.put(temp, value + 1);
        }
        int m = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < m; i++) {
            temp = Integer.parseInt(stringTokenizer.nextToken());
            if (map.containsKey(temp)) stringBuilder.append(map.get(temp)).append(' ');
            else stringBuilder.append(0).append(' ');
        }
        System.out.println(stringBuilder);
    }
}
