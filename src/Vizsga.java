import java.time.LocalDate;

public class Vizsga {
    public enum Eredmenyek {
        ELEGTELEN(1),
        ELEGSEGES(2),
        KOZEPES(3),
        JO(4),
        JELES(5),
        NEM_JELENT_MEG,
        IGAZOLT_TAVOLLET,
        MEGFELELT,
        JOL_MEGFELELT;

        private final int jegy;

        Eredmenyek() {
            this.jegy = ordinal() + 1;
        }

        Eredmenyek(int jegy) {
            this.jegy = jegy;
        }

        public int getJegy() {
            return jegy;
        }
    }

    private Hallgato hallgato;
    private Tantargy tantargy;
    private LocalDate datum;
    private Eredmenyek eredmeny;

    public Vizsga(Hallgato hallgato, Tantargy tantargy, LocalDate datum, Eredmenyek eredmeny) {
        this.hallgato = hallgato;
        this.tantargy = tantargy;
        this.datum = datum;
        this.eredmeny = eredmeny;
    }

    // GETTEREK, SETTEREK
    public Hallgato getHallgato() {
        return hallgato;
    }

    public void setHallgato(Hallgato hallgato) {
        this.hallgato = hallgato;
    }

    public Tantargy getTantargy() {
        return tantargy;
    }

    public void setTantargy(Tantargy tantargy) {
        this.tantargy = tantargy;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public Eredmenyek getEredmeny() {
        return eredmeny;
    }

    public void setEredmeny(Eredmenyek eredmeny) {
        this.eredmeny = eredmeny;
    }

    @Override
    public String toString() {
        return "vizsgázó hallgató: " + hallgato + '\n' +
                "tantárgy: " + tantargy + '\n' +
                "dátum: " + datum + '\n' +
                "eredmény: " + eredmeny + "\n\n";
    }
}
