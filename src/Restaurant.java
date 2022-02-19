public class Restaurant {

    Mancare mancare;
    String nume;

    public Restaurant(Mancare mancare, String nume) {
        this.mancare = mancare;
        this.nume = nume;
    }

    public Mancare getMancare() {
        return mancare;
    }

    public void setMancare(Mancare mancare) {
        this.mancare = mancare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
