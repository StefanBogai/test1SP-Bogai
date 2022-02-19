import java.io.*;
import java.lang.*;

public class Pizza extends Mancare{
    String blat;
    int timp;

    public Pizza(int pret, String nume, String blat, int timp) {
        super(pret, nume);
        this.blat = blat;
        this.timp = timp;
    }

    public String getBlat() {
        return blat;
    }

    public void setBlat(String blat) {
        this.blat = blat;
    }

    public int getTimp() {
        return timp;
    }

    public void setTimp(int timp) {
        this.timp = timp;
    }
}
