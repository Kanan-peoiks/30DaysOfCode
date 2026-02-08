package thirtyDaysOfCode.day3;
import java.util.*;

public class Day3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meal_cost = scanner.nextDouble();
        int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();

        double tip = meal_cost * tip_percent / 100.0;
        double tax = meal_cost * tax_percent / 100.0;

        double total_cost = meal_cost + tip + tax;

        System.out.println(Math.round(total_cost));

        scanner.close();
    }
}