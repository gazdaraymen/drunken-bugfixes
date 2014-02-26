/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resto.dao;

import resto.entities.Reservation;
import resto.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import resto.DAO.RestaurantDAO;
import resto.DAO.clientDAO;




/**
 *
 * @author miadselmi
 */
public class ReservationDAO {
    public void insertReservation(Reservation r){

         String requete = "insert into reservation(Nbre_personnes,date,id_client,id_restaurant) values (?,?,?,?)";

         try { //dep=depdao.findDepotById(st.getDepot().getId_dep());
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, r.getNbre_personnes());
            ps.setDate(2,r.getDate());
            ps.setInt(3,r.getClient().getId_client());
            ps.setInt(4,r.getRestaurant().getId_restaurant() );

            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    
      public void updateReservation(Reservation r){
        String requete = "update reservation set nbre_personnes=?, date=?, id_client=? ,id_restaurant =? where id_reservation=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, r.getNbre_personnes());
            ps.setDate(2, r.getDate());
            ps.setInt(3, r.getClient().getId_client());
            ps.setInt(4, r.getRestaurant().getId_restaurant());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
      
       public void deleteReservation(int id){

          String requete = "delete from reservation where id_sreservation=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }

       
       
      public Reservation findReservationBydate(int date){

        String requete = "select * from reservation where date=?";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ResultSet resultat = ps.executeQuery();
        clientDAO ClientDAO = new clientDAO();
        RestaurantDAO restaurantDAO =new RestaurantDAO();
        Reservation reservation = new Reservation();
        while (resultat.next()){

            reservation.setId_reservation(resultat.getInt(1));
            reservation.setNbre_personnes(resultat.getInt(2));
            reservation.setDate(resultat.getDate(3));
            reservation.setClient(ClientDAO.findClientById(resultat.getInt(4)));
            reservation.setRestaurant(restaurantDAO.findRestaurantById(resultat.getInt(5)));
        }
        return reservation;
       
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }

       public List<Reservation> DisplayAllReservation (){


        List<Reservation> listereservations = new ArrayList<Reservation>();

        String requete = "select * from reservation";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            clientDAO ClientDAO = new clientDAO();
            RestaurantDAO restaurantDAO= new RestaurantDAO(); 
            while(resultat.next()){
                Reservation reservation =new Reservation();
               reservation.setId_reservation(resultat.getInt(1));
                reservation.setNbre_personnes(resultat.getInt(2));
                reservation.setDate(resultat.getDate(3));
                reservation.setClient(ClientDAO.findClientById(resultat.getInt(4)));
                reservation.setRestaurant(restaurantDAO.findRestaurantById(resultat.getInt(5)));


                listereservations.add(reservation);
                
            }
            return listereservations;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }

    
}
