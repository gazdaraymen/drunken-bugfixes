package resto.entities;

/**
 *
 * @author khouloud
 */
public class restaurateur {
    private String nom;
    private String prenom;
    private String Email;
    private int Tel;
    private String Login;
    private String pwd;
  //  private int id_restaurant;
    private boolean etat;
    private int id_restaurateur;
 /*   private Restaurant restaurant;

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
*/
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int Tel) {
        this.Tel = Tel;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

     public int getId_restaurateur() {
        return id_restaurateur;
    }

    public void setId_restaurateur(int id_restaurateur) {
        this.id_restaurateur = id_restaurateur;
    }

   /* public int getId_restaurent() {
        return id_restaurant;
    }

    public void setId_restaurent(int id_restaurent) {
        this.id_restaurent = id_restaurent;
    }*/

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}



