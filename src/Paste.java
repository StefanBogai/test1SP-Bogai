import java.io.*;
import java.lang.*;

public class Paste extends Mancare{
    String sos;
    int timp;

    public Paste(int pret, String nume, String sos, int timp) {
        super(pret, nume);
        this.sos = sos;
        this.timp = timp;
    }

    public String getSos() {
        return sos;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    public int getTimp() {
        return timp;
    }

    public void setTimp(int timp) {
        this.timp = timp;
    }
}