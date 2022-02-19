import java.io.*;
import java.lang.*;

public class Salata extends Mancare{
    int timp;
    String dressing;

    public Salata(int pret, String nume, int timp, String dressing) {
        super(pret, nume);
        this.timp = timp;
        this.dressing = dressing;
    }

    public int getTimp() {
        return timp;
    }

    public void setTimp(int timp) {
        this.timp = timp;
    }

    public String getDressing() {
        return dressing;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }
}