abstract class MobilePhone implements Mobile {
    private String brand;
    private String model;

    // Constructor
    public MobilePhone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Getters and setters for brand and model
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public abstract void additionalFeatures();
}

