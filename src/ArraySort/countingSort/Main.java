package ArraySort.countingSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int[] countArray = new int[10001];
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(bufferedReader.readLine());
            countArray[temp]++;
        }

        for (int i = 0; i < countArray.length; i++) {
            while (countArray[i] > 0) {
                stringBuilder.append(i).append('\n');
                countArray[i]--;
            }
        }
        System.out.println(stringBuilder);
    }
}
