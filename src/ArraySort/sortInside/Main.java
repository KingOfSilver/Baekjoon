package ArraySort.sortInside;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = bufferedReader.readLine().split("");
        Arrays.sort(array);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) stringBuilder.append(array[i]);
        System.out.println(stringBuilder);
    }
}
