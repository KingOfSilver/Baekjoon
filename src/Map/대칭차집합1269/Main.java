package Map.대칭차집합1269;

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
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        Map<String,String> aMap = new HashMap<>();
        Map<String,String> bMap = new HashMap<>();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < n; i++) aMap.put(stringTokenizer.nextToken(), " ");
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < m; i++) {
            String temp = stringTokenizer.nextToken();
            if (aMap.containsKey(temp)) aMap.remove(temp);
            else bMap.put(temp, " ");
        }
        System.out.println(aMap.size() + bMap.size());
    }
}
