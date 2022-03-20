package domain.model;

public class Persoon {
private String naam;
private String voorNaam;
private int leeftijd;
private double gewicht;
private double lengte;

    public Persoon(String naam, String voorNaam, int leeftijd, double gewicht, double lengte) {
        setNaam(naam);
        setVoorNaam(voorNaam);
        setLeeftijd(leeftijd);
        setGewicht(gewicht);
        setLengte(lengte);

    }

    public Persoon(){

    }

    public String getNaam() {
        return naam;
    }

    public String getVoorNaam() {
        return voorNaam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public double getGewicht() {
        return gewicht;
    }

    public double getLengte() {
        return lengte;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setVoorNaam(String voorNaam) {
        this.voorNaam = voorNaam;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }
}

