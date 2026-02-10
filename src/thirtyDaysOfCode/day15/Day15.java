package thirtyDaysOfCode.day15;

import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            Difference d = new Difference(a, 0);
            d.computeDifference();
            System.out.println(d.maximumDifference);
            sc.close();
    }
}


