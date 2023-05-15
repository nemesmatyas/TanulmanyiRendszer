import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var teszt = new Teszt();
        teszt.tr.tantargyFelvesz(teszt.t1);
        teszt.tr.tantargyFelvesz(teszt.t2);
        teszt.tr.tantargyFelvesz(teszt.t3);
        teszt.tr.tantargyFelvesz(teszt.t4);
        teszt.tr.hallgatoBeirat(teszt.h1);
        teszt.tr.hallgatoBeirat(teszt.h2);
        teszt.tr.hallgatoBeirat(teszt.h3);
        teszt.tr.hallgatoBeirat(teszt.h4);
        teszt.tr.hallgatoBeirat(teszt.h5);
        teszt.tr.hallgatoBeirat(teszt.h6);
        teszt.tr.hallgatoBeirat(teszt.h7);
        teszt.tr.hallgatoPasszival(teszt.h1);
        teszt.tr.hallgatoPasszival(teszt.h1);
        teszt.tr.vizsgaEredmenyRogzit(teszt.h2, teszt.t1, LocalDate.of(2023,5,20), Vizsga.Eredmenyek.JO);
        teszt.tr.vizsgaEredmenyRogzit(teszt.h3, teszt.t2, LocalDate.of(2023,6,7), Vizsga.Eredmenyek.KOZEPES);
        teszt.tr.vizsgaEredmenyRogzit(teszt.h5, teszt.t4, LocalDate.of(2023,6,15), Vizsga.Eredmenyek.ELEGTELEN);
        teszt.tr.vizsgaEredmenyRogzit(teszt.h6, teszt.t3, LocalDate.of(2023,7,1), Vizsga.Eredmenyek.NEM_JELENT_MEG);
        teszt.tr.vizsgaEredmenyRogzit(teszt.h7, teszt.t2, LocalDate.of(2023,6,28), Vizsga.Eredmenyek.JELES);
        teszt.tr.vizsgaEredmenyRogzit(teszt.h5, teszt.t2, LocalDate.of(2023,6,28), Vizsga.Eredmenyek.JOL_MEGFELELT);
        teszt.tr.vizsgaEredmenyRogzit(teszt.h6, teszt.t2, LocalDate.of(2023,6,28), Vizsga.Eredmenyek.IGAZOLT_TAVOLLET);

        teszt.tr.setTelSzam("0696503400");
        System.out.println("Összes vizsga eredményének átlaga: " + teszt.tr.vizsgaAtlag());
        System.out.println(teszt.tr.osszesTaroltVizsgaEredmeny());
        //System.out.println(teszt.tr.toString());
        var targyKeres = teszt.tr.tantargyatKeres("Java programozás");
        if (targyKeres != null)
            System.out.println(targyKeres);
        else
            System.out.println("A keresett tantárgy nem található!");

        final String fajlnev = "kimenet.txt";
        try {
            FileWriter fw = new FileWriter(fajlnev);
            fw.write(teszt.tr.toString());
            fw.close();
            System.out.println("Fájlba írás sikeres!");
        } catch (IOException e) {
            System.out.println("Hiba történt a fájlba írás közben!");
        }
    }
}