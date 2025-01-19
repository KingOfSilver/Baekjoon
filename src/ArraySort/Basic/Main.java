package ArraySort.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            list.add(Integer.parseInt(stringTokenizer.nextToken()));
        }
        Collections.sort(list);
        StringBuilder stringBuilder = new StringBuilder();
        for (int num : list) stringBuilder.append(num).append('\n');
        System.out.println(stringBuilder);
    }

//    public static void swap (int[] arr, int i , int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
}
