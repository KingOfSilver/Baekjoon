package 달팽이는올라가고싶다;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long day = scanner.nextLong();
        long night = scanner.nextLong();
        long target = scanner.nextLong();
        long gap = day - night;
        long howLongDay = (long) Math.ceil((double)(target - day) / gap);
        System.out.println(howLongDay + 1);
    }
}

//    public static long realCheck(long day, long night, long target) {
//        long howLongDay = 1L;
//        long cur = 0L;
//        while (true) {
//            cur += day;
//            if (cur >= target) break;
//            cur -= night;
//            howLongDay++;
//        }
//        return howLongDay;
//    }

