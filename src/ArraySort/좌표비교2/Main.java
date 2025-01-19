package ArraySort.좌표비교2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[n];
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(stringTokenizer.nextToken());
            array[i] = temp;
            list.add(temp);
        }
        list.sort(Comparator.naturalOrder());
        int rank = 0;
        // 같은 조건일지라도 contain 검사를 map 이 list 보다 속도가 빠르다.
        for (int i = 0; i < list.size(); i++) {
            if (!map.containsKey(list.get(i))){
                map.put(list.get(i), rank);
                rank++;
            }
        }
        for (int j : array) stringBuilder.append(map.get(j)).append(" ");
        System.out.println(stringBuilder);
    }
}
