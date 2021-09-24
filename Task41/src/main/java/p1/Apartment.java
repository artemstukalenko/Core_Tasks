package p1;

import java.io.Serializable;
import java.util.Objects;

public class Apartment implements Serializable {

    private String identifier;
    private int roomCount;
    private String address;
    private int floor;
    private double price;

    public Apartment(String identifier, int roomCount, String address, int floor, double price) {
        this.identifier = identifier;
        this.roomCount = roomCount;
        this.address = address;
        this.floor = floor;
        this.price = price;
    }

    public Apartment() {}

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "identifier='" + identifier + '\'' +
                ", roomCount=" + roomCount +
                ", address='" + address + '\'' +
                ", floor=" + floor +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return roomCount == apartment.roomCount && floor == apartment.floor && Double.compare(apartment.price, price) == 0 && Objects.equals(identifier, apartment.identifier) && Objects.equals(address, apartment.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, roomCount, address, floor, price);
    }
}
