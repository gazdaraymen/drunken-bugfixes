/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resto.entities;

/**
 *
 * @author dell
 */
public class Commentaire {

    private int id_commentaire;
    private String text;
    private String date;
    private Restaurant restaurant;
    private client Client;

    public client getClient() {
        return Client;
    }

    public void setClient(client Client) {
        this.Client = Client;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId_commentaire() {
        return id_commentaire;
    }

    public void setId_commentaire(int id_commentaire) {
        this.id_commentaire = id_commentaire;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    } 
    
    

}
