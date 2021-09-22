package p1;

public class Phone {
    private String phoneNumber;
    private String model;
    private double price;

    private Network network;

    public Phone(String phoneNumber, String model, double price) {
        this.phoneNumber = phoneNumber;
        this.model = model;
        this.price = price;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public void call(String phoneNumber) {
        for (String currentNumber : this.network.getNumbers()) {
            if (currentNumber.equals(phoneNumber)) {
                System.out.println("Calling " + phoneNumber);
                return;
            }
        }
        System.out.println("Incorrect number...");
    }
}
