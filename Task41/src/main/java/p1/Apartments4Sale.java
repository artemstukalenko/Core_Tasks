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

        apartmentsForSale.stream().forEach(encoder::writeObject);
        encoder.close();
    }

    public void writeSingleApartmentToXml(Apartment apartment) {

        try {
            this.encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(apartmentsInfoFile)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        encoder.writeObject(apartment);
        encoder.close();
    }

    public void rewriteApartmentInXml(Apartment apartment) {

        try {
            this.encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(apartmentsInfoFile)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        encoder.remove(apartment);
        encoder.writeObject(apartment);
        encoder.close();
    }

    public void deleteApartmentFromXml(Apartment apartment) {

        try {
            this.encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(apartmentsInfoFile)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        encoder.remove(apartment);
        encoder.close();
    }

    public Apartment getApartmentFromXml() {

        try {
            this.decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(apartmentsInfoFile)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return (Apartment) decoder.readObject();
    }

}
