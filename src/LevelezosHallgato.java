public class LevelezosHallgato extends Hallgato {
    private int tavolsag;

    public LevelezosHallgato(String neptunkod, String nev, String email, String telszam, int tavolsag) {
        super(neptunkod, nev, email, telszam);
        this.tavolsag = tavolsag;
    }

    // GETTEREK, SETTEREK
    public int getTavolsag() {
        return tavolsag;
    }

    public void setTavolsag(int tavolsag) {
        this.tavolsag = tavolsag;
    }

    @Override
    public String toString() {
        return "neptunkód: " + neptunkod + '\t' +
                "hallgató neve: " + nev + '\t' +
                "email cím: " + email + '\t' +
                "telefonszám: " + telszam + '\t' +
                "lakóhely távolsága (km): " + tavolsag + '\n';
    }
}
