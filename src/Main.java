import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Client> Clienti = new ArrayList<>();
        List<Comanda> Comenzi = new ArrayList<>();

        List<Mancare> Mancaruri = new ArrayList<>();
        Mancare m1 = new Mancare(20,"Pizza");
        Mancare m2 = new Mancare(19,"Paste");
        Mancare m3 = new Mancare(12,"Salata");
        Mancaruri.add(m1); Mancaruri.add(m2); Mancaruri.add(m3);
        Comanda cz1 = new Comanda(Mancaruri);
        Comenzi.add(cz1); Comenzi.add(cz1); Comenzi.add(cz1);

        Client c1 = new Client(1,"0721200011",Comenzi.get(0));
        Client c2 = new Client(2,"0721200012",Comenzi.get(1));
        Client c3 = new Client(3,"0756123456",Comenzi.get(2));
        Clienti.add(c1); Clienti.add(c2); Clienti.add(c3);




        for(Client c: Clienti){
            System.out.println(c);
        }

    }
}
