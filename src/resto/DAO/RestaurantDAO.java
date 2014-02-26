/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package resto.DAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import resto.util.MyConnection;
import resto.entities.*;
/**
 *
 * @author Aymen
 */
public class RestaurantDAO {

    public void insertRestaurant(Restaurant rest){
        Restaurant res = new Restaurant();
        RestaurantDAO resdao= new RestaurantDAO();
        restaurateurDAO rerdao = new restaurateurDAO();
           // DepotDAO depdao=new DepotDAO();

         String requete = "insert into restaurant (budget_moy,region,id_restaurant,nom_restaurant,nbre_table,ambiance,alcool, specialite, id_restaurateur)"
                 + " values (?,?,?,?,?,?,?,?,?)";

        try {

            //dep=depdao.findDepotById(st.getDepot().getId_dep());
//            Adresse adr=addao.findAdresseByID(res.getAdresse().getId_adresse());
      PreparedStatement ps =  MyConnection.getInstance().prepareStatement(requete);

      ps.setString(1, rest.getBudget_moy());
           ps.setString(2,rest.getRegion() );
            ps.setInt(3, rest.getId_restaurant());

           ps.setString(4, rest.getNom_restaurant());
           ps.setInt(5,rest.getNbre_table());
           ps.setString(6,rest.getAmbiance());
             ps.setString(7,rest.getAlcool());
              ps.setString(8,rest.getSpecialite());
              ps.setInt(9, rest.getId_restaurateur());


            ps.executeUpdate();




            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
}

     public void UpdateResto(Restaurant resto){
        String requete = "update restaurant set budget_moy=?,  region=?,  nom_restaurant=?,  nbre_table=?, ambiance=? , alcool=? , specialite=? where id_restaurant=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);

            ps.setString(1, resto.getBudget_moy());
            ps.setString(2, resto.getRegion());
           

            ps.setString(3, resto.getNom_restaurant());
            ps.setInt(4, resto.getNbre_table());
            ps.setString(5, resto.getAmbiance());
            ps.setString(6, resto.getAlcool());
            ps.setString(7, resto.getSpecialite());

            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }


     public void deleteRestaurant(int id){

          String requete = "delete from restaurant where id_restaurant=?";
        try {
            PreparedStatement ps = (PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }



     public List<Restaurant> DisplayAllRestaurants (){


        List<Restaurant> listerestaurants = new ArrayList<Restaurant>();
AdresseDAO adresseDAO = new AdresseDAO();
        String requete = "select * from restaurant";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat =  statement.executeQuery(requete);

            while(resultat.next()){
                Restaurant restaurant =new Restaurant();
                restaurant.setBudget_moy(resultat.getString(1));
                
                restaurant.setRegion(resultat.getString(2));
                restaurant.setId_restaurant(resultat.getInt(3));
                restaurant.setNom_restaurant(resultat.getString(4));
                restaurant.setNbre_table(resultat.getInt(5));
                restaurant.setAmbiance(resultat.getString(6));
                restaurant.setAlcool(resultat.getString(7));
                restaurant.setSpecialite(resultat.getString(8));

              listerestaurants.add(restaurant);
            }
            return listerestaurants;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des restaurants "+ex.getMessage());
            return null;
        }

    }


     public Restaurant findRestaurantByBudget(String budget){
    Restaurant restaurant = new Restaurant();
     String requete = "select * from restaurant where budget_moy = ?";
        try {

            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, budget);
            ResultSet resultat = (ResultSet) ps.executeQuery();
            while (resultat.next())
            {
                restaurant.setBudget_moy(resultat.getString(1));
                System.out.println("Budget moyen : "+restaurant.getBudget_moy());

            }
            return restaurant;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }

     public Restaurant findRestaurantById(int id_res){
    Restaurant restaurant = new Restaurant();
     String requete = "select * from restaurant where id_restaurant = ?";
        try {

            PreparedStatement ps =  MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_res);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                restaurant.setId_restaurant(resultat.getInt(3));
                System.out.println("Nom restaurant : "+restaurant.getId_restaurant());
               
            }
            return restaurant;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du restaurant "+ex.getMessage());
            return null;
        }

    }
      public Restaurant findRestaurantByNom(String nom){
    Restaurant restaurant = new Restaurant();
     String requete = "select * from restaurant where nom_restaurant = ?";
        try {

            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = (ResultSet) ps.executeQuery();
            while (resultat.next())
            {
                restaurant.setId_restaurant(resultat.getInt(3));
                System.out.println("Nom restaurant : "+restaurant.getNom_restaurant());
                restaurant.setNom_restaurant(resultat.getString(2));
                System.out.println(resultat.getString(2));
            }
            return restaurant;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du restaurant "+ex.getMessage());
            return null;
        }
    }


public Restaurant findRestaurantBySpecialite(String spec){
    Restaurant restaurant = new Restaurant();
     String requete = "select * from restaurant where specialite = ?";
        try {

            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, spec);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                restaurant.setId_restaurant(resultat.getInt(3));
                System.out.println("Id restaurant : "+restaurant.getId_restaurant());

                restaurant.setNom_restaurant(resultat.getString(4));
                System.out.println("Nom restaurant : "+restaurant.getNom_restaurant());

                restaurant.setSpecialite(resultat.getString(8));
                System.out.println("Specialité :" +restaurant.getSpecialite());
            }
            return restaurant;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du restaurant "+ex.getMessage());
            return null;
        }
    }
}
