package Map.듣보잡_1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        Map<String, String> hearMap = new HashMap<>();
        Map<String, String> sawMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            hearMap.put(stringTokenizer.nextToken(), " ");
        }
        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String temp = stringTokenizer.nextToken();
            if (hearMap.containsKey(temp)) sawMap.put(temp, " ");
        }
        List<String> list = new ArrayList<>(sawMap.keySet());
        Collections.sort(list);
        stringBuilder.append(list.size()).append('\n');
        for (String s : list) stringBuilder.append(s).append('\n');
        System.out.println(stringBuilder);
    }
}
