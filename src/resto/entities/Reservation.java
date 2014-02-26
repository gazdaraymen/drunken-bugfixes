/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resto.entities;

import java.sql.Date;

/**
 *
 * @author dell
 */
public class Reservation {
    
    private int id_reservation;
    private int nbre_personnes;
    private Date date;
private client Client;
private Restaurant restaurant;

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public client getClient() {
        return Client;
    }

    public void setClient(client Client) {
        this.Client = Client;
    }
    public int getId_reservation() {
        return id_reservation;
    }

    public void setId_reservation(int id_reservation) {
        this.id_reservation = id_reservation;
    }

    public int getNbre_personnes() {
        return nbre_personnes;
    }

    public void setNbre_personnes(int nbre_personnes) {
        this.nbre_personnes = nbre_personnes;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
  
   
    
}
