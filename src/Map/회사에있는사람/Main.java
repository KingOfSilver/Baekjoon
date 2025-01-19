package Map.회사에있는사람;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        Map<String, String> map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        List<String> temp;
        for (int i = 0; i < n; i++) {
            String a = bufferedReader.readLine().split(" ")[0];
            if (!map.containsKey(a)) map.put(a, "");
            else map.remove(a);
        }
        temp = new ArrayList<>(map.keySet());
        temp.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        for (String s :temp) stringBuilder.append(s).append('\n');
        System.out.println(stringBuilder);
    }
}
