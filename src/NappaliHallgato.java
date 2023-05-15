public class NappaliHallgato extends Hallgato {
    private boolean isOsztondijas;

    public NappaliHallgato(String neptunkod, String nev, String email, String telszam, boolean isOsztondijas) {
        super(neptunkod, nev, email, telszam);
        this.isOsztondijas = isOsztondijas;
    }

    // GETTEREK, SETTEREK
    public boolean isOsztondijas() {
        return isOsztondijas;
    }

    public void setOsztondijas(boolean osztondijas) {
        isOsztondijas = osztondijas;
    }


    @Override
    public String toString() {
        return "neptunkód: " + neptunkod + '\t' +
                "hallgató neve: " + nev + '\t' +
                "email cím: " + email + '\t' +
                "telefonszám: " + telszam + '\t' +
                "ösztöndíjas: " + isOsztondijas + '\n';
    }
}
