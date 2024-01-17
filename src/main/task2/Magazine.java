class Magazine implements Printable {
    private final String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(title);

    }
    public static void printMagazines(Printable[] printables) {
        System.out.println("\nСписок журналів: ");
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                printable.print();
            }
        }
    }

}
