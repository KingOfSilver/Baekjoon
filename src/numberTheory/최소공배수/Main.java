package numberTheory.최소공배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        long result = ((long) m * n) / makeGCD(m , n);
        System.out.println(result);
    }

    public static int makeGCD(int a, int b) {
        int aCnt = Math.max(a, b);
        int bCnt = Math.min(a, b);
        int temp;
        while(bCnt != 0) {
            if (bCnt > 0) {
                temp = aCnt % bCnt;
                aCnt = bCnt;
                bCnt = temp;
            }
        }
        return aCnt;
    }
}
