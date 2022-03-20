package domain.db;

import domain.model.Persoon;

import java.util.ArrayList;

public class PersoonDB {

    private ArrayList<Persoon> personen = new ArrayList<>();

    public PersoonDB() {
    }

    public void add(Persoon newpersoon){
        if (newpersoon == null) throw new IllegalArgumentException();
        personen.add(newpersoon);

    }

    public ArrayList<Persoon> getPersonen() {
        return personen;
    }

    public String deZwaarstePersoon(){
        Persoon pers1 = new Persoon();

        for (Persoon p : personen){
            if (p == null) throw new IllegalArgumentException("");
            if (p.getGewicht() > pers1.getGewicht()){
                pers1 = p;
            }
        }
            return pers1.getVoorNaam();
    }




}
