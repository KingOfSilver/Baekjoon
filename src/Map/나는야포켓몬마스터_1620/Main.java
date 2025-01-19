package Map.나는야포켓몬마스터_1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        String name;
        String number;
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        Map<String, String> map = new HashMap<>();
        for (int i = 1; i <= n + m; i++) {
            name = bufferedReader.readLine();
            if (i <= n) {
                number = Integer.toString(i);
                map.put(name, number);
                map.put(number, name);
            } else {
                stringBuilder.append(map.get(name)).append('\n');
            }
        }
        System.out.println(stringBuilder);
    }
}
