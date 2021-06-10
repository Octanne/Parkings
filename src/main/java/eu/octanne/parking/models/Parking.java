package eu.octanne.parking.models;

public class Parking {

    /* Attributs */
    private String nom;
    private int nbPlacesDispo;
    private int nbPlacesTotal;
    private String statut;
    private String heureMaj;
    private double loc[];
    
    public String getHeureMaj() {
        return heureMaj;
    }
    public double[] getLoc() {
        return loc;
    }
    public void setLoc(double loc[]) {
        this.loc = loc;
    }
    public void setHeureMaj(String heureMaj) {
        this.heureMaj = heureMaj;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getNbPlacesDispo() {
        return nbPlacesDispo;
    }
    public void setNbPlacesDispo(int nbPlacesDispo) {
        this.nbPlacesDispo = nbPlacesDispo;
    }
    public int getNbPlacesTotal() {
        return nbPlacesTotal;
    }
    public void setNbPlacesTotal(int nbPlacesTotal) {
        this.nbPlacesTotal = nbPlacesTotal;
    }
    public String getStatut() {
        return statut;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }



}
