/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.entities;

import javax.jws.Oneway;

/**
 *
 * @author Aymen
 */
public class Adresse {

    private int id_adresse;
    private String gouvernorat;
    private String delegation;
    private int id_restaurant;

    public Adresse(String string, String string0) {

    }



    public String getDelegation() {
        return delegation;
    }

    public void setDelegation(String delegation) {
        this.delegation = delegation;
    }

    public String getGouvernorat() {
        return gouvernorat;
    }

    public void setGouvernorat(String gouvernorat) {
        this.gouvernorat = gouvernorat;
    }

    public int getId_adresse() {
        return id_adresse;
    }

    public void setId_adresse(int id_adresse) {
        this.id_adresse = id_adresse;
    }

    public int getId_restaurant() {
        return id_restaurant;
    }

    public void setId_restaurant(int id_restaurant) {
        this.id_restaurant = id_restaurant;
    }


}
