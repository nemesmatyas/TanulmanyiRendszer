public class NemzetkoziHallgato extends Hallgato {
    private String allampolgarsag;

    public NemzetkoziHallgato(String neptunkod, String nev, String email, String telszam, String allampolgarsag) {
        super(neptunkod, nev, email, telszam);
        this.allampolgarsag = allampolgarsag;
    }

    // GETTEREK, SETTEREK
    public String getAllampolgarsag() {
        return allampolgarsag;
    }

    public void setAllampolgarsag(String allampolgarsag) {
        this.allampolgarsag = allampolgarsag;
    }

    @Override
    public String toString() {
        return "neptunkód: " + neptunkod + '\t' +
                "hallgató neve: " + nev + '\t' +
                "email cím: " + email + '\t' +
                "telefonszám: " + telszam + '\t' +
                "állampolgárság: " + allampolgarsag + '\n';
    }
}
