public class Main1 {
    public static void main(String[] args) {
        Printable[] printableItems = new Printable[3];
        printableItems[0] = new Book("Думай та богатій");
        printableItems[1] = new Magazine("Times");
        printableItems[2] = new Book("Чистий код");

        for (Printable printable : printableItems) {
            printable.print();
        }

        Magazine.printMagazines(printableItems);

        Book.printBooks(printableItems);
    }
}
