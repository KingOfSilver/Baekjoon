package 블랙잭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int[] tempArray = new int[a];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < a; i++) tempArray[i] = Integer.parseInt(stringTokenizer.nextToken());
        search(tempArray, b);

    }

    static int search(int[] tempArray, int b) {
        int gap = 0;
        for (int i = 0; i <= tempArray.length - 3; i++) {
            for (int j = i + 1; j <= tempArray.length - 2; j++) {
                for (int k = j + 1; k <= tempArray.length - 1; k++) {
                    int sum = tempArray[i] + tempArray[j] + tempArray[k];
                    if (sum <= b) {
                        if (sum == b) return sum;
                        if (sum > gap) gap = sum;
                    }
                }
            }
        }
        return gap;
    }
}
