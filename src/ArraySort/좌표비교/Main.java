package ArraySort.좌표비교;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = read();
        XYCoordinate[] xyCoordinates = new XYCoordinate[n];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) xyCoordinates[i] = new XYCoordinate(read(), read());
        Arrays.sort(xyCoordinates);
        for (XYCoordinate xyCoordinate : xyCoordinates) stringBuilder.append(xyCoordinate.X).append(' ').append(xyCoordinate.Y).append('\n');
        System.out.println(stringBuilder);
    }

    private static int read() throws IOException {
        int n;
        int result = 0;
        int operation = 1;

        while (true) {
            n = System.in.read();
            if (n == '-') {
                operation = -1;
                continue;
            }

            if (n < '0' || n > '9') {
                return result * operation;
            }
            result *= 10;
            result += n - '0';
        }
    }

    static public class XYCoordinate implements Comparable<XYCoordinate>{
        int X,Y;

        XYCoordinate(int x, int y){
            this.X = x;
            this.Y = y;
        }
        @Override
        public int compareTo(XYCoordinate o) {
            if (this.Y == o.Y) return this.X - o.X;
            return this.Y - o.Y;
        }
    }
}
