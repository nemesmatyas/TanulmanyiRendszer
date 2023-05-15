import java.time.LocalDate;
import java.util.ArrayList;

public class TanulmanyiRendszer {
    private String intezmenyNev;
    private String intezmenyCim;
    private String telSzam;
    private ArrayList<Tantargy> tantargyak;
    private ArrayList<Hallgato> hallgatok;
    private ArrayList<Vizsga> eredmenyek;

    public TanulmanyiRendszer(String intezmenyNev, String intezmenyCim, String telSzam) {
        this.intezmenyNev = intezmenyNev;
        this.intezmenyCim = intezmenyCim;
        this.telSzam = telSzam;
        this.tantargyak = new ArrayList<>();
        this.hallgatok = new ArrayList<>();
        this.eredmenyek = new ArrayList<>();
    }

    // METÓDUSOK
    public void tantargyFelvesz(Tantargy ujTargy) {
        this.tantargyak.add(ujTargy);
        System.out.println(ujTargy.getNev() + " (" + ujTargy.getTargykod() + ") sikeresen felvéve az oktatott tantárgyak közé!");
    }

    public void hallgatoBeirat(Hallgato ujHallgato) {
        hallgatok.add(ujHallgato);
        System.out.println(ujHallgato.getNev() + "(" + ujHallgato.getNeptunkod() + ") sikeresen felvéve a hallgatók közé!");
    }

    public void hallgatoPasszival(Hallgato passzivHallgato) {
        if (hallgatok.contains(passzivHallgato)) {
            hallgatok.remove(passzivHallgato);
            System.out.println(passzivHallgato.getNev() + "(" + passzivHallgato.getNeptunkod() +") passziváltatva!");
        } else {
            System.out.println("A megadott hallgató nincs beiratkozva az intézménybe!");
        }

    }

    public void vizsgaEredmenyRogzit(Hallgato hallgato, Tantargy tantargy, LocalDate datum, int eredmeny) {
        if (hallgatok.contains(hallgato) && tantargyak.contains(tantargy)) {
            Vizsga vizsga = new Vizsga(hallgato, tantargy, datum, eredmeny);
            eredmenyek.add(vizsga);
            System.out.println("Vizsgaeredmény rögzítve a(z) " + tantargy.getNev() + " (" + tantargy.getTargykod() + ") tantárgyhoz " + datum + "időpontban. " +
                    " Eredmény: " + eredmeny);
        } else {
            throw new IllegalArgumentException("Hiba! Csak beiratkozott hallgató vizsgázhat, és csak olyan tantárgyból, amit oktat az intézmény!");
        }
    }

    public String osszesTaroltVizsgaEredmeny() {
        System.out.println("VIZSGAEREDMÉNYEK");
        StringBuilder eredmeny = new StringBuilder();
        for (var v : eredmenyek) {
            eredmeny.append(v.getHallgato().getNev()).append('\t').append(v.getTantargy().getNev()).append('\t').append(v.getEredmeny()).append('\n');
        }
        return eredmeny.toString();
    }

    public double vizsgaAtlag() {
        if (eredmenyek.size() == 0)
            return 0.0;

        double osszeg = 0.0;
        for (var v : eredmenyek) {
            osszeg += v.getEredmeny();
        }
        return osszeg / eredmenyek.size();
    }

    public Tantargy tantargyatKeres(String targynev) {
        for (var t : tantargyak) {
            if (t.getNev().equals(targynev)) {
                return t;
            }
        }
        return null;
    }

    // GETTEREK, SETTEREK
    public String getIntezmenyNev() {
        return intezmenyNev;
    }

    public void setIntezmenyNev(String intezmenyNev) {
        this.intezmenyNev = intezmenyNev;
    }

    public String getIntezmenyCim() {
        return intezmenyCim;
    }

    public void setIntezmenyCim(String intezmenyCim) {
        this.intezmenyCim = intezmenyCim;
    }

    public String getTelSzam() {
        return telSzam;
    }

    public void setTelSzam(String telSzam) {
        this.telSzam = telSzam;
    }

    public ArrayList<Tantargy> getTantargyak() {
        return tantargyak;
    }

    public void setTantargyak(ArrayList<Tantargy> tantargyak) {
        this.tantargyak = tantargyak;
    }

    public ArrayList<Hallgato> getHallgatok() {
        return hallgatok;
    }

    public void setHallgatok(ArrayList<Hallgato> hallgatok) {
        this.hallgatok = hallgatok;
    }

    public ArrayList<Vizsga> getEredmenyek() {
        return eredmenyek;
    }

    public void setEredmenyek(ArrayList<Vizsga> eredmenyek) {
        this.eredmenyek = eredmenyek;
    }

    @Override
    public String toString() {
        StringBuilder sbTantargy = new StringBuilder();
        StringBuilder sbHallgatok = new StringBuilder();
        StringBuilder sbEredmenyek = new StringBuilder();

        for (var t : tantargyak) {
            sbTantargy.append(t);
        }
        for (var h : hallgatok) {
            sbHallgatok.append(h);
        }
        for(var e : eredmenyek) {
            sbEredmenyek.append(e.getDatum()).append('\t');
            sbEredmenyek.append(e.getHallgato().getNev()).append('\t');
            sbEredmenyek.append(e.getHallgato().getNeptunkod()).append('\t');
            sbEredmenyek.append(e.getTantargy().getNev()).append('\t');
            sbEredmenyek.append(e.getTantargy().getTargykod()).append('\t');
            sbEredmenyek.append(e.getEredmeny()).append('\n');
        }
        return "TANULMÁNYI RENDSZER\n" +
                "intézmény neve: " + intezmenyNev + '\n' +
                "intézmény címe: " + intezmenyCim + '\n' +
                "telefonszáma: " + telSzam + '\n' +
                "oktatott tantárgyak: \n" + sbTantargy +
                "hallgatók: \n" + sbHallgatok + '\n' +
                "vizsgaeredmények: \n" + sbEredmenyek;
    }
}
