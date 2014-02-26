/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resto.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import resto.util.MyConnection;
import resto.entities.*;


/**
 *
 * @author miadselmi
 */
public class CommentaireDAO {
    
      public void insertCommentaire(Commentaire c){

        String requete = "insert into commentaire (id_client,text,date,id_restaurant) values (?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);


            ps.setInt(1,c.getClient().getId_client());
            ps.setString(2, c.getText());
            ps.setString(3, c.getDate());
            ps.setInt(4,c.getRestaurant().getId_restaurant() );

            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

   public void updateCommentaire(Commentaire c){
        String requete = "update commentaire set id_client=?, text=?, date=?, id_restaurant=? where id_commentaire=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, c.getClient().getId_client());
            ps.setString(2, c.getText());
            ps.setString(3, c.getDate());
            ps.setInt(4, c.getRestaurant().getId_restaurant());
            ps.executeUpdate();
            System.out.println("Mise à jour du commentaire est effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }

     public void deleteCommentaire(int id){

          String requete = "delete from commentaire where id_commentaire=?";
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


      public Commentaire findCommentaireBy(int num){

        String requete = "select * from commentaire where id_commentaire=?";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ResultSet resultat = ps.executeQuery();
       clientDAO ClientDAO = new clientDAO();
       RestaurantDAO restaurantDAO =new RestaurantDAO();
        Commentaire commentaire = new Commentaire();
        while (resultat.next()){

            commentaire.setId_commentaire(resultat.getInt(1));
            commentaire.setClient(ClientDAO.findClientById(resultat.getInt(2)));
            commentaire.setText(resultat.getString(3));
            commentaire.setRestaurant(restaurantDAO.findRestaurantById(resultat.getInt(4)));
        }
        return commentaire;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }


        public List<Commentaire> DisplayAllCommentaires (){


       List<Commentaire> listecommentaires = new ArrayList<Commentaire>();
     //   List<Commentaire> listerestaurants = new ArrayList<Commentaire>();


        String requete = "select * from commentaire";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            clientDAO ClientDAO = new clientDAO();
            RestaurantDAO restaurantDAO = new RestaurantDAO();
            while(resultat.next()){

                Commentaire commentaire =new Commentaire();

                commentaire.setId_commentaire(resultat.getInt(1));
                commentaire.setClient(ClientDAO.findClientById(resultat.getInt(1)));
                commentaire.setText(resultat.getString(3));
                commentaire.setRestaurant(restaurantDAO.findRestaurantById((resultat.getInt(4))));

                listecommentaires.add(commentaire);

            }
            return listecommentaires ;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des commentaires "+ex.getMessage());
            return null;
        }
    }


}
