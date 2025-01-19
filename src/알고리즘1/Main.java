package 알고리즘1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if ((a * d) + b <= c * d && c >= a) System.out.println(1);
        else System.out.println(0);
    }
}
