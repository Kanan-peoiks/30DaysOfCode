package thirtyDaysOfCode.day14;

class MyBook extends Book {
    int price;

    public MyBook(String title, String author, int price) {
        super(title, author); // parent constructor
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
