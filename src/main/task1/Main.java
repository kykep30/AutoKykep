public class Main {
    public static void main(String[] args) {
        Model myPhone = new Model("Samsung", "Galaxy S21");


        myPhone.makeCall("1234567890");
        myPhone.sendMessage("9876543210", "Hello, how are you?");

        System.out.println("Brand: " + myPhone.getBrand());
        System.out.println("Model: " + myPhone.getModel());


        myPhone.additionalFeatures();

    }
}
