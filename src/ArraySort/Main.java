package ArraySort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        myForm[] arr = new myForm[n];
        for (int i = 0; i < n; i++) arr[i] = new myForm(i , scanner.nextInt());
        System.out.println(Arrays.toString(arr) + " 정렬전");
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) System.out.println( "값 : " + arr[i].value  +  " 이전 인덱스:" + arr[i].index);
    }

    public static class myForm implements Comparable<myForm> {
        int value, index;

        public myForm(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(myForm o) {
            return this.value - o.value;
        }
    }

}
