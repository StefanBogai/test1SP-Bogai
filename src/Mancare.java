public class Mancare {
    int pret;
    String nume;

    public Mancare(int pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Mancare{" +
                "pret=" + pret +
                ", nume='" + nume + '\'' +
                '}';
    }
}
