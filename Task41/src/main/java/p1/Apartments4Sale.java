package p1;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.List;

public class Apartments4Sale {

    private List<Apartment> apartmentsForSale;
    private File apartmentsInfoFile;
    private XMLEncoder encoder;
    private XMLDecoder decoder;

    public Apartments4Sale(File apartmentsInfoFile) {
        this.apartmentsInfoFile = apartmentsInfoFile;
        this.apartmentsForSale = getApartmentsFromXml();
    }

    public Apartments4Sale(List<Apartment> apartmentsForSale, File apartmentsInfoFile) {
        this.apartmentsForSale = apartmentsForSale;
        this.apartmentsInfoFile = apartmentsInfoFile;
    }

    public List<Apartment> getApartmentsForSale() {
        return apartmentsForSale;
    }

    public void setApartmentsForSale(List<Apartment> apartmentsForSale) {
        this.apartmentsForSale = apartmentsForSale;
    }

    public File getApartmentsInfoFile() {
        return apartmentsInfoFile;
    }

    public void setApartmentsInfoFile(File apartmentsInfoFile) {
        this.apartmentsInfoFile = apartmentsInfoFile;
    }

    public void writeAllApartmentsToXml() {

        try {
            this.encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(apartmentsInfoFile)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        encoder.writeObject(apartmentsForSale);
        encoder.close();
    }

    public void addApartment(Apartment apartment) {
        apartmentsForSale.add(apartment);
        writeAllApartmentsToXml();
    }

    public void changeApartment(String identifier, Apartment apartment) {

        for (int i = 0; i < apartmentsForSale.size(); i++) {
            if (apartmentsForSale.get(i).getIdentifier().equals(identifier)) {
                apartmentsForSale.remove(i);
                apartmentsForSale.add(i, apartment);
                writeAllApartmentsToXml();
                return;
            }
        }

    }

    public void deleteApartment(Apartment apartment) {
        apartmentsForSale.remove(apartment);
        writeAllApartmentsToXml();
    }

    private List<Apartment> getApartmentsFromXml() {

        try {
            this.decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(apartmentsInfoFile)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return (List<Apartment>) decoder.readObject();
    }

}
