package StackAndQueue.스택2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        Stack<String> strings = new Stack<>();
        int n = Integer.parseInt(stringTokenizer.nextToken());
        StringBuilder stringBuilder = new StringBuilder();
        String s,b;
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            s = stringTokenizer.nextToken();
            if (s.equals("1")) {
                b = stringTokenizer.nextToken();
                strings.add(b);
            }
            else if (s.equals("2")) {
                if (!strings.isEmpty()) {
                    stringBuilder.append(strings.pop()).append('\n');
                }
                else stringBuilder.append("-1").append('\n');
            }
            else if (s.equals("3")) stringBuilder.append(strings.size()).append('\n');
            else if (s.equals("4")) {
                if (strings.isEmpty()) stringBuilder.append("1").append('\n');
                else stringBuilder.append("0").append('\n');
            }
            else {
                if (!strings.isEmpty()) stringBuilder.append(strings.peek()).append('\n');
                else stringBuilder.append("-1").append('\n');
            }
        }
        System.out.println(stringBuilder);
    }
}
