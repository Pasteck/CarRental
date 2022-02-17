package Model;

public class Vehicule{
    private String immatriculation;
    private String model;
    private String marque;
    private String couleur;
    private Int kilometrage;
    private Bool estDisponible;

    public Vehicule(String immatriculation, String model, String marque, String couleur, Int kilometrage) {
        this.immatriculation = immatriculation;
        this.model = model;
        this.marque = marque;
        this.couleur = couleur;
        this.kilometrage = kilometrage;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(Int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public Bool getEstDisponible() {
        return estDisponible;
    }

    public void setEstDisponible(Bool estDisponible) {
        this.estDisponible = estDisponible;
    }
}