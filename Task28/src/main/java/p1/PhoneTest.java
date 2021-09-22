package p1;

import java.util.ArrayList;
import java.util.List;

public class PhoneTest {
    public static void main(String[] args) {
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("+38011111111");
        phoneNumbers.add("+38022222222");
        phoneNumbers.add("+38033333333");

        Network network = new Network("Kyivstar", phoneNumbers);
        Phone phone = new Phone("+38033333333", "S10", 10000.00);
        phone.setNetwork(network);

        phone.call("+38022222222");
    }
}
