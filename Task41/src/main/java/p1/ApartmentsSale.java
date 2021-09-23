package p1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ApartmentsSale {

    private static Apartments4Sale apartments4Sale;

    private static List<Apartment> apartmentList = new ArrayList<>();

    public static void main(String[] args) {
        fillApartmentList();

        apartments4Sale = new Apartments4Sale(apartmentList,
                new File("C:\\Users\\Professional\\IdeaProjects\\Core_Tasks\\Task41\\src\\main\\resources\\apartments-info-file.xml"));

        apartments4Sale.writeAllApartmentsToXml();


        System.out.println(apartments4Sale.getApartmentFromXml());

        //apartments4Sale.writeSingleApartmentToXml(new Apartment("apartment5", 4, "Telihi 12", 10, 20000.00));
    }

    private static void fillApartmentList() {
        apartmentList.add(new Apartment("apartment1", 2, "Chokilivskii 1", 5, 4500.00));
        apartmentList.add(new Apartment("apartment2", 3, "Simirenka 14", 1, 10000.00));
        apartmentList.add(new Apartment("apartment3", 2, "Melnikova 5", 4, 6000.00));
        apartmentList.add(new Apartment("apartment4", 1, "Dorogozhizkaya 8", 7, 5500.00));
    }
}
