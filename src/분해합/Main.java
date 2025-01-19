package 분해합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int target = Integer.parseInt(s);
        System.out.println(calculate(target, s.length()));
    }


    public static int calculate(int target, int length) {
        int result = 0;
    // i 는 가능한 최솟값인 N - 9 * N의 각 자릿수부터 시작
        for (int i = (target - (length * 9)); i < target; i++) {
            int number = i;
            int sum = 0;    // 각 자릿수 합 변수
            while (number != 0) {
                sum += number % 10;    // 각 자릿수 더하기
                number /= 10;
            }
            // i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우)
            if (sum + i == target) {
                result = i;
                break;
            }
        }
        return result;
    }
}
