class Model extends MobilePhone{
    public Model(String brand, String model) {
        super(brand, model);
    }


    @Override
    public void additionalFeatures() {
        System.out.println("Additional features of the " + getModel() + ": Facial recognition, dual camera");
    }

    @Override
    public void makeCall(String phoneNumber) {

    }

    @Override
    public void sendMessage(String phoneNumber, String message) {

    }
}
