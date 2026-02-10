package thirtyDaysOfCode.day7;

import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        for (int j = 0; j < t; j++) {
            String line = scan.nextLine();
            String[] words = line.split(" ");
            StringBuilder result = new StringBuilder();

            for (String word : words) {
                String even = "";
                String odd = "";
                for (int i = 0; i < word.length(); i++) {
                    if (i % 2 == 0) {
                        even += word.charAt(i);
                    } else {
                        odd += word.charAt(i);
                    }
                }
                result.append(even).append(" ").append(odd).append(" ");
            }

            System.out.println(result.toString().trim());
        }

        scan.close();

    }
}
