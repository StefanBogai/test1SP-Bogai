public class Client {

    int id;
    String nrTelefon;
    Comanda comanda;

    public Client(int id, String nrTelefon, Comanda comanda) {
        this.id = id;
        this.nrTelefon = nrTelefon;
        this.comanda = comanda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", comanda=" + comanda +
                '}';
    }
}
