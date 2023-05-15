import java.time.LocalDate;

public class Vizsga {
    private Hallgato hallgato;
    private Tantargy tantargy;
    private LocalDate datum;
    private int eredmeny;

    public Vizsga(Hallgato hallgato, Tantargy tantargy, LocalDate datum, int eredmeny) {
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

    public int getEredmeny() {
        return eredmeny;
    }

    public void setEredmeny(int eredmeny) {
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
