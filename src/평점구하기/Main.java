package 평점구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double total = 0D;
        double sum = 0D;
        Map<String, Double> scores = new HashMap<>();
        scores.put("A+" , 4.5);
        scores.put("A0" , 4.0);
        scores.put("B+" , 3.5);
        scores.put("B0" , 3.0);
        scores.put("C+" , 2.5);
        scores.put("C0" , 2.0);
        scores.put("D+" , 1.5);
        scores.put("D0" , 1.0);
        scores.put("F" , 0.0);
        scores.put("P" , 0.0);
        for (int i = 1; i <= 20; i++){
            String[] strings = bufferedReader.readLine().split(" ");
            double mark = Double.parseDouble(strings[1]);
            String grade = strings[2];
            double sumDouble = mark * (scores.get(grade));
            if (!grade.equals("P")) total += mark;
            sum += sumDouble;
        }
        double average = sum / total;
        System.out.printf("%.6f\n", average);
    }
}
