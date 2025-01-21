package BrutalForce.체스판다시칠하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int MIN = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        String[][] array = new String[n][m];
        for (int i = 0; i < n; i++) {
            String[] temp = bufferedReader.readLine().split("");
            System.arraycopy(temp, 0, array[i], 0, m);
        }
        for (int high = 0; high < n - 7; high++) {
            for (int wide = 0; wide < m - 7; wide++) {
                countError(array, wide, high);
            }
        }
        System.out.println(MIN);
    }

    public static void countError(String[][] array, int wide, int high) {
        int countW = 0;
        int countB = 0;
        String temp;
        String currentKey = "W";
        String currentKey2 = "B";
        for (int i = high; i < Math.min(high + 8, array.length); i++) {
            for (int j = wide; j < Math.min(wide + 8, array[0].length); j++){
                if (!array[i][j].equals(currentKey)) countW++;
                if (!array[i][j].equals(currentKey2)) countB++;
                if (j != wide + 7){
                    temp = currentKey;
                    currentKey = currentKey2;
                    currentKey2 = temp;
                }
            }
        }
        MIN = Math.min(MIN, Math.min(countW, countB));
    }
}
