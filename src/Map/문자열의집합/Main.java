package Map.문자열의집합;

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
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        Map<String,Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < n; i++) map.put(bufferedReader.readLine(),0);
        for (int i = 0; i < m; i++) if (map.containsKey(bufferedReader.readLine())) result++;
        System.out.println(result);
    }
}
