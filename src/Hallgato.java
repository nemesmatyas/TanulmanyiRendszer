public abstract class Hallgato {
    protected String neptunkod;
    protected String nev;
    protected String email;
    protected String telszam;

    Hallgato(String neptunkod, String nev, String email, String telszam) {
        this.neptunkod = neptunkod;
        this.nev = nev;
        this.email = email;
        this.telszam = telszam;
    }

    // GETTEREK, SETTEREK
    public String getNeptunkod() {
        return neptunkod;
    }

    public void setNeptunkod(String neptunkod) {
        this.neptunkod = neptunkod;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelszam() {
        return telszam;
    }

    public void setTelszam(String telszam) {
        this.telszam = telszam;
    }


    @Override
    public String toString() {
        return "neptunkód: " + neptunkod + '\t' +
                "hallgató neve: " + nev + '\t' +
                "email cím: " + email + '\t' +
                "telefonszám: " + telszam + '\n';
    }
}
