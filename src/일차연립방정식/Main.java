package 일차연립방정식;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        int x, y;
        if (d * b - a * e != 0)  x = (f * b - e * c) / (d * b - a * e);
        else x = (c * e - b * f) / (a * e - b * d);
        if (b != 0) y =  (c - a * x)/ b;
        else y = (f - d * x ) / e;
        System.out.println(x + " " + y);
    }
}
