/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resto.DAO;

import resto.util.MyConnection;
import java.sql.*;

import java.util.ArrayList;
import java.util.List;
import resto.entities.*;

/**
 *
 * @author khouloud
 */
public class restaurateurDAO {



    public void insertrestaurateur(restaurateur res) {
        String requete = "insert into restaurateur (id_restaurateur,nom,prenom,Email,Tel,login,pwd) values (?,?,?,?,?,?,?)";
        try {

            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, res.getId_restaurateur());

            ps.setString(2, res.getNom());
            ps.setString(3, res.getPrenom());
            ps.setString(4, res.getEmail());
            ps.setInt(5, res.getTel());
            ps.setString(6, res.getLogin());
            ps.setString(7, res.getPwd());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");

        } catch (SQLException ex) {

            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }

  /*  public int returnid(int id) {
        {
            String requete = "SELECT max(Id_restaurateur) FROM restaurateur";
            try
            { 
                Statement statement = MyConnection.getInstance().createStatement();
                ResultSet resultat = statement.executeQuery(requete);
                id = resultat.getInt(requete);
            } catch (SQLException ex) {

                System.out.println("erreur lors de l'insertion " + ex.getMessage());
            }

        }
        return id ;
    } */

    public int getId(int id) {
        String requete = "select * from restaurateur where  id_restaurateur= (select max(id_restaurateur) from restaurateur)";
            try
            {
                Statement statement = MyConnection.getInstance().createStatement();
                ResultSet resultat = statement.executeQuery(requete);
                if(resultat.next()){

                 id = resultat.getInt(1);
                 System.out.println(id);
                }
            } catch (SQLException ex) {

                System.out.println("erreur lors de la recherche de l'id " + ex.getMessage());
            }
        return id ;

        }



    public void updaterestaurateur(restaurateur res) {
        String requete = "update  restaurateur set nom=?,prenom=?,Email=?,Tel=?,login=?,pwd=? where id_restaurateur=?";
        try { //dep=depdao.findDepotById(st.getDepot().getId_dep());
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, res.getNom());
            ps.setString(2, res.getPrenom());
            ps.setString(3, res.getEmail());
            ps.setInt(4, res.getTel());
            ps.setString(5, res.getLogin());
            ps.setString(6, res.getPwd());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }

    }

    public void deleterestaurateur(int n) {

        String requete = "delete * from restaurateur where id_restaurateur=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, n);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    public restaurateur findrestaurateurBynom(String nom) {
        restaurateur Restaurateur = new restaurateur();
        String requete = "select * from restaurateur where nom = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                Restaurateur.setId_restaurateur(resultat.getInt(1));
                System.out.println("Id restaurateur " + resultat.getInt(1));
                Restaurateur.setNom(resultat.getString(2));
                System.out.println("nom restaurateur" + resultat.getString(2));
                System.out.println("Id restaurant " + resultat.getInt(3));

            }
            return Restaurateur;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du restaurateur " + ex.getMessage());
            return null;
        }
    }

    public List<restaurateur> DisplayAllrestaurateur() {

        List<restaurateur> listerestaurateur = new ArrayList<restaurateur>();

        String requete = "select * from restaurateur";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {
                restaurateur Restaurateur = new restaurateur();
                Restaurateur.setId_restaurateur(resultat.getInt(1));
                Restaurateur.setNom(resultat.getString(2));
                Restaurateur.setPrenom(resultat.getString(3));
                Restaurateur.setEmail(resultat.getString(4));
                Restaurateur.setTel(resultat.getInt(5));
                Restaurateur.setLogin(resultat.getString(6));
                Restaurateur.setPwd(resultat.getString(7));

                listerestaurateur.add(Restaurateur);
            }
            return listerestaurateur;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des restaurateur " + ex.getMessage());
            return null;
        }
    }
}
