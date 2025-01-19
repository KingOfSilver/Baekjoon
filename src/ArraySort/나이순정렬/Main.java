package ArraySort.나이순정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;
        AgeAndName[] ageAndNames = new AgeAndName[n];
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int age = Integer.parseInt(stringTokenizer.nextToken());
            String name = stringTokenizer.nextToken();
            AgeAndName temp = new AgeAndName(age, i , name);
            ageAndNames[i] = temp;
        }
        Arrays.sort(ageAndNames);
        for (AgeAndName ageAndName : ageAndNames) stringBuilder.append(ageAndName.age).append(' ').append(ageAndName.name).append('\n');
        System.out.println(stringBuilder);
    }

    public static class AgeAndName implements Comparable<AgeAndName>{
        int  age,index;
        String name;

        AgeAndName(int age, int index, String name) {
            this.age = age;
            this.index = index;
            this.name = name;
        }

        @Override
        public int compareTo(AgeAndName o) {
            if (this.age == o.age) {
                return this.index - o.index;
            }
            return this.age - o.age;
        }
    }
}
