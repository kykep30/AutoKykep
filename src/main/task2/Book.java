class Book implements Printable {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(title);

    }
    public static void printBooks(Printable[] printables) {
        System.out.println("\nСписок книг:");
        for (Printable printable : printables) {
            if (printable instanceof Book) {
                printable.print();
            }
        }
    }
}
