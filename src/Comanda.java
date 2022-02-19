import java.util.List;

public class Comanda {

    private List<Mancare> listaMancare;

    public Comanda(List<Mancare> listaMancare) {
        this.listaMancare = listaMancare;
    }

    public List<Mancare> getListaMancare() {
        return listaMancare;
    }

    public void setListaMancare(List<Mancare> listaMancare) {
        this.listaMancare = listaMancare;
    }

    @Override
    public String toString() {
        return "Comanda{" +
                "listaMancare=" + listaMancare +
                '}';
    }
}
