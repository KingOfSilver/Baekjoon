package 백준반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 데이터를 전송 받는 규칙이 있기 때문에
// StringToken 을 사용 하지 않고 반복적으로 가공하여 속도를 줄임
// StringToken 사용할 경우 객체를 계속 만들기 때문에 속도 저하
public class Main {
    public static void main(String[] args) throws IOException {
        // 스캐너를 사용하게 되면 파싱을 하면서 데이터를 받기 때문에 속도 저하
        BufferedReader bufferedReader = new BufferedReader(new  InputStreamReader(System.in));

        StringBuilder stringBuilder = new StringBuilder();
        String string;
        while ((string = bufferedReader.readLine()) != null){
                int a = string.charAt(0) - 48;
                int b = string.charAt(2) - 48;
                stringBuilder.append(a + b).append("\n");
        }
        System.out.println(stringBuilder);
        bufferedReader.close();
    }
}