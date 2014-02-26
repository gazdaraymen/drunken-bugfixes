package resto.DAO;
import java.sql.*;
import resto.entities.client;
import resto.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khouloud
 */
public class clientDAO {

    public void insertclient(client st){
          

         String requete = "insert into client (id_client,nom,prenom,sexe,Email,Tel,adresse,login,pwd,etat) values (?,?,?,?,?,?,?,?,?,?)";
        try { 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, st.getId_client());
            ps.setString(2, st.getNom());
            ps.setString(3, st.getPrenom());
            ps.setString(4, st.getSexe());
            ps.setString(5, st.getEmail());
            ps.setInt(6,st.getTel());
            ps.setString(7,st.getAdresse());
            ps.setString (8,st.getLogin());
            ps.setString(9,st.getPwd());
            ps.setBoolean(10,st.isEtat());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }

    public void updateclient(client st){
        String requete = "update client set id_client=?,nom=?,prenom=?,sexe=?,Email=?,Tel=?,adresse=?,login=?,pwd=?,etat=?";
       try { 
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, st.getId_client());
            ps.setString(2, st.getNom());
            ps.setString(3, st.getPrenom());
            ps.setString(4, st.getSexe());
            ps.setString(5, st.getEmail());
            ps.setInt(6,st.getTel());
            ps.setString(7,st.getAdresse());
            ps.setString (8,st.getLogin());
            ps.setString(9,st.getPwd());
            ps.setBoolean(10,st.isEtat());
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }

     public void deleteclient(int n){

          String requete = "delete from client where id_client=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1,n);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }

         public client findclientBynom(String nom){
         client Client = new client();
           String requete = "select * from client where nom = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                Client.setId_client(resultat.getInt(1));
                System.out.println("Id client : "+Client.getId_client());

                Client.setNom(resultat.getString(2));
                System.out.println("Nom client : "+Client.getNom());
            }
            return Client;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du client "+ex.getMessage());
            return null;
        }
    }




          public client findClientById(int id_res){
    client cl = new client();
     String requete = "select * from client where id_client = ?";
        try {

            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id_res);
            ResultSet resultat = (ResultSet) ps.executeQuery();
            while (resultat.next())
            {
                cl.setId_client(resultat.getInt(1));
                cl.setNom(resultat.getString(2));
                cl.setPrenom(resultat.getString(3));
                cl.setSexe(resultat.getString(4));
                cl.setEmail(resultat.getString(5));
                cl.setTel(resultat.getInt(6));
                cl.setAdresse(resultat.getString(7));
                cl.setLogin(resultat.getString(8));
                cl.setPwd(resultat.getString(9));
                cl.setEtat(resultat.getBoolean(10));


                System.out.println("Nom Client : "+cl.getNom());
                System.out.println("Prenom Client : "+cl.getPrenom());

            }
            return cl;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du client "+ex.getMessage());
            return null;
        }

    }



       public List<client> DisplayAllclient (){

        List<client> listeclient = new ArrayList<client>();

        String requete = "select * from client";
        try {
           Statement statement = (Statement) MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = (ResultSet) statement.executeQuery(requete);
            clientDAO ClientDAO = new clientDAO();
            while(resultat.next()){
                client Client =new client();
                Client.setId_client(resultat.getInt(1));
                Client.setNom(resultat.getString(2));
                Client.setPrenom(resultat.getString(3));
                Client.setSexe(resultat.getString(4));
                Client.setAdresse(resultat.getString(5));
                Client.setEmail(resultat.getString(6));
                Client.setTel(resultat.getInt(7));
                Client.setLogin(resultat.getString(8));
                Client.setPwd(resultat.getString(9));
                Client.setEtat(resultat.getBoolean(10));
                listeclient.add(Client);
            }
            return listeclient;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des client "+ex.getMessage());
            return null;
        }
    }

}
