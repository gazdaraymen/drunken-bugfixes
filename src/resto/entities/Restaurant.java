/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resto.entities;

/**
 *
 * @author Aymen
 */
public class Restaurant {

    private String budget_moy;
    private String region;
    private int id_restaurant;
    private String nom_restaurant;
    private int nbre_table;
    private String ambiance;
    private String alcool;
    private String specialite;
    private int id_restaurateur;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getId_restaurateur() {
        return id_restaurateur;
    }

    public void setId_restaurateur(int id_restaurateur) {
        this.id_restaurateur = id_restaurateur;
    }
    private restaurateur Restaurateur;

    public restaurateur getRestaurateur() {
        return Restaurateur;
    }

    public void setRestaurateur(restaurateur Restaurateur) {
        this.Restaurateur = Restaurateur;
    }

    //  private Adresse adresse;

    /*   public Restaurant(String budget_moy, String nom_restaurant, int nbre_table, String ambiance, String alcool, String specialite, Adresse adresse) {
    this.budget_moy = budget_moy;
    this.nom_restaurant = nom_restaurant;
    this.nbre_table = nbre_table;
    this.ambiance = ambiance;
    this.alcool = alcool;
    this.specialite = specialite;
    this.adresse = adresse;
    }

    public Restaurant(int i, Adresse ad, int i0, String string, String string0, String string1, String string2) {

    }*/
    public Restaurant() {
    }

    public String getAlcool() {
        return alcool;
    }

    public void setAlcool(String alcool) {
        this.alcool = alcool;
    }

    public String getAmbiance() {
        return ambiance;
    }

    public void setAmbiance(String ambiance) {
        this.ambiance = ambiance;
    }

    public String getBudget_moy() {
        return budget_moy;
    }

    public void setBudget_moy(String budget_moy) {
        this.budget_moy = budget_moy;
    }

    public int getId_restaurant() {
        return id_restaurant;
    }

    public void setId_restaurant(int id_restaurant) {
        this.id_restaurant = id_restaurant;
    }

    public int getNbre_table() {
        return nbre_table;
    }

    public void setNbre_table(int nbre_table) {
        this.nbre_table = nbre_table;
    }

    public String getNom_restaurant() {
        return nom_restaurant;
    }

    public void setNom_restaurant(String nom_restaurant) {
        this.nom_restaurant = nom_restaurant;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    /**
     * @return the adresse
     */
    /* public Adresse getAdresse() {
    return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    /*  public void setAdresse(Adresse adresse) {
    this.adresse = adresse;
    } */
}
