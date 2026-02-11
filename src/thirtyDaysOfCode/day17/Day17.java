package thirtyDaysOfCode.day17;

import java.io.IOException;
import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        try{
            int n = Integer.parseInt(s);
            System.out.println(n);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
        scanner.close();
    }
}
