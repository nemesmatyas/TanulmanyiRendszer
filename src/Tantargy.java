public class Tantargy {
    private String targykod;
    private String nev;
    private int kreditertek;
    private String oktato;
    private String leiras;

    public Tantargy(String targykod, String nev, int kreditertek, String oktato, String leiras) {
        this.targykod = targykod;
        this.nev = nev;
        this.oktato = oktato;
        this.leiras = leiras;
        if (kreditertek >= 1 && kreditertek <= 6)
            this.kreditertek = kreditertek;
        else
            throw new IllegalArgumentException("A tantárgy kreditértékének 1 és 6 között kell lennie!");
    }

    // GETTEREK, SETTEREK
    public String getTargykod() {
        return targykod;
    }

    public void setTargykod(String targykod) {
        this.targykod = targykod;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKreditertek() {
        return kreditertek;
    }

    public void setKreditertek(int kreditertek) {
        this.kreditertek = kreditertek;
    }

    public String getOktato() {
        return oktato;
    }

    public void setOktato(String oktato) {
        this.oktato = oktato;
    }

    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

    @Override
    public String toString() {
        return "tárgykód: " + targykod + '\t' +
                "tantárgy neve: " + nev + '\t' +
                "kreditérték: " + kreditertek + '\t' +
                "oktató: " + oktato + '\t' +
                "rövid leírás: " + leiras + '\n';
    }
}
