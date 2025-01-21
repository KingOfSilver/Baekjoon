package 크로아티아알파벳;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] strings = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        for (String s : strings) a = a.replaceAll(s, "1");

        System.out.println(a.length());
    }
}
