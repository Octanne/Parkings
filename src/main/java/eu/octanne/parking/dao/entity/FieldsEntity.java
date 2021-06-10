package eu.octanne.parking.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldsEntity {
    
    /**
     *  "grp_complet": 10,
        "grp_identifiant": "003",
        "grp_horodatage": "2021-06-10T13:59:45+00:00",
        "grp_disponible": 235,
        "idobj": "299",
        "location": [
          47.217842888,
          -1.558250017
        ],
        "grp_statut": 5,
        "grp_exploitation": 643,
        "grp_nom": "Tour Bretagne"
     */

    @JsonProperty(value = "idobj")
    private String idObj;
    @JsonProperty(value = "grp_nom")
    private String nom;
    @JsonProperty(value = "grp_exploitation")
    private int nbPlace;
    @JsonProperty(value = "grp_disponible")
    private int nbPlaceDispo;
    @JsonProperty(value = "grp_statut")
    private String statut;
    @JsonProperty(value = "grp_horodatage")
    private String horodatage;
    @JsonProperty(value = "location")
    private double loc[];

    public String getIdObj() {
        return idObj;
    }
    public double[] getLoc() {
        return loc;
    }
    public void setLoc(double loc[]) {
        this.loc = loc;
    }
    public void setId(String idObj) {
        this.idObj = idObj;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getNbPlace() {
        return nbPlace;
    }
    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }
    public int getNbPlaceDispo() {
        return nbPlaceDispo;
    }
    public void setNbPlaceDispo(int nbPlaceDispo) {
        this.nbPlaceDispo = nbPlaceDispo;
    }
    public String getStatut() {
        return statut;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }
    public String getHorodatage() {
        return horodatage;
    }
    public void setHorodatage(String horodatage) {
        this.horodatage = horodatage;
    }

}
