package thirtyDaysOfCode.day14;

import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String title = scan.nextLine();
        String author = scan.nextLine();
        int price = scan.nextInt();
        //scan.nextLine();
        Book book = new MyBook(title,author, price);
        book.display();
        scan.close();
    }
}
