package ArraySort.단어정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String temp = bufferedReader.readLine();
            if (!list.contains(temp)) list.add(temp);
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o2.length() == o1.length()){
                    return o1.compareTo(o2);
                }
                return o1.length()- o2.length();
            }
        });
        for (String s : list) stringBuilder.append(s).append('\n');
        System.out.println(stringBuilder);
    }
}
