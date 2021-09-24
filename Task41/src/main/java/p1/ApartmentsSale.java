package p1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ApartmentsSale {

    private static Apartments4Sale apartments4Sale;

    private static List<Apartment> apartmentList = new ArrayList<>();

    public static void main(String[] args) {

        fillApartmentList();

        apartments4Sale = new Apartments4Sale(
                new File("C:\\Users\\Professional\\IdeaProjects\\Core_Tasks\\Task41\\src\\main\\resources\\apartments-info-file.xml"));


        System.out.println(apartments4Sale.getApartmentsForSale());

        Apartment apartmentForTest = new Apartment("apartment5", 2, "Telihi 8", 10, 7000.00);

        //apartments4Sale.addApartment(apartmentForTest);
        apartments4Sale.deleteApartment(apartmentForTest);
    }

    private static void fillApartmentList() {
        apartmentList.add(new Apartment("apartment1", 3, "Simirenka", 8, 1000.00));
        apartmentList.add(new Apartment("apartment2", 2, "Zholudeva", 3, 4500.00));
        apartmentList.add(new Apartment("apartment3", 3, "Khreshatyk", 6, 15000.00));
        apartmentList.add(new Apartment("apartment4", 1, "Herzena", 15, 8000.00));
    }
}
