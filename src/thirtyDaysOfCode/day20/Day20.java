package thirtyDaysOfCode.day20;

import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        int result = cal.divisorSum(n);
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(result);
        scan.close();
    }
}





