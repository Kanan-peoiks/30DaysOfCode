package thirtyDaysOfCode.day6;

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
int result = 0;
        for (int i=1; i<=10; i++){
            result = n *i;
            System.out.println(n +" x " +i+" = " + result);
        }


    }
}
