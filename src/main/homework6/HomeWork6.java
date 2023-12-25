import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {

//        TASK 1
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите число: ");
//
//        int number = scanner.nextInt();
//
//        String message = (number %2 != 0) ? "Odd number" : "Even number";
//
//        System.out.println(message);
//
//        System.out.println("BYE");
//
//        scanner.close();

//        TASK 2.1
//        String jan = "JAN";
//        String feb = "FEB";
//        String march = "MARCH";
//        String apr = "APR";
//        String may = "MAY";
//        String june = "JUNE";
//        String july = "JULY";
//        String aug = "AUG";
//        String sep = "SEP";
//        String oct = "OCT";
//        String nov = "NOV";
//        String dec = "DEC";
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите число: ");
//
//        int number = scanner.nextInt();
//
//        if (number == 1) {
//            System.out.println(jan);
//        } else if (number == 2) {
//            System.out.println(feb);
//        } else if (number == 3) {
//            System.out.println(march);
//        } else if (number == 4) {
//            System.out.println(apr);
//        } else if (number == 5) {
//            System.out.println(may);
//        } else if (number == 6) {
//            System.out.println(june);
//        } else if (number == 7) {
//            System.out.println(july);
//        } else if (number == 8) {
//            System.out.println(aug);
//        } else if (number == 9) {
//            System.out.println(sep);
//        } else if (number == 10) {
//            System.out.println(oct);
//        } else if (number == 11) {
//            System.out.println(nov);
//        } else if (number == 12) {
//            System.out.println(dec);
//        } else {
//            System.out.println("Not a valid month");
//        }
//
//        scanner.close();

//        TASK 2.2

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");

        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("JAN");
                break;
            case 2:
                System.out.println("FEB");
                break;
            case 3:
                System.out.println("MARCH");
                break;
            case 4:
                System.out.println("APR");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUNE");
                break;
            case 7:
                System.out.println("JULY");
                break;
            case 8:
                System.out.println("AUG");
                break;
            case 9:
                System.out.println("SEP");
                break;
            case 10:
                System.out.println("OCT");
                break;
            case 11:
                System.out.println("NOV");
                break;
            case 12:
                System.out.println("DEC");
                break;
        }






    }
}
