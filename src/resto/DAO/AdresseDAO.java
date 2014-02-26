/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resto.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import resto.entities.Adresse;
import resto.util.MyConnection;

/**
 *
 * @author Aymen
 */
public class AdresseDAO {

    /*public int insertAdresse(Adresse ad) {
        // DepotDAO depdao=new DepotDAO();
int res = -1;
        String requete = "insert into adresse (id_adresse,gouvernorat,delegation) values (?,?,?)";
        try {

            //dep=depdao.findDepotById(st.getDepot().getId_dep());
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, ad.getId_adresse());
            ps.setString(2, ad.getGouvernorat());
            ps.setString(3, ad.getDelegation());

            res =  ps.executeUpdate();
             System.out.println("Ajout effectuée avec succès, res = "+res);
             ps =  MyConnection.getInstance().prepareStatement("select * from adresse where gouvernorat="+ad.getGouvernorat()+
                     " and delegation = "+ad.getDelegation());
             //récup le resultset, lire l'id de l'enregistrement, et le retourner
           
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
        return res;
    }

    public void updateAdresse(Adresse ad) {
       //AdresseDAO adao= new AdresseDAO();
        String requete = "update adresse set  gouvernorat=?, delegation=? where id_adresse=? ";  //
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ad.getGouvernorat());
            ps.setString(2, ad.getDelegation());
            ps.setInt(3, ad.getId_adresse());

            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //  Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    public void deleteAdresse(int num) {

        String requete = "delete from adresse where id_adresse=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, num);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    public Adresse findAdresseByID(int id) {
        Adresse adresse = new Adresse();
        String requete = "select * from adresse where id_adresse=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                adresse.setId_adresse(resultat.getInt(1));
                adresse.setGouvernorat(resultat.getString(2));
                adresse.setDelegation(resultat.getString(3));

                System.out.println("id" + resultat.getInt(1));
                System.out.println(resultat.getString(2));
                System.out.println(resultat.getString(3));
            }
            return adresse;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de l'adresse " + ex.getMessage());
            return null;
        }
    }

    public Adresse findAdresseByDelegation(String delegation) {
        Adresse adresse = new Adresse();
        String requete = "select * from adresse where delegation=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, delegation);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                adresse.setId_adresse(resultat.getInt(1));
                System.out.println("ID Adresse : " + adresse.getId_adresse());
                adresse.setGouvernorat(resultat.getString(2));
                System.out.println(resultat.getString(2));
                adresse.setDelegation(resultat.getString(3));
                System.out.println(resultat.getString(3));
            }
            return adresse;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du l'adresse " + ex.getMessage());
            return null;
        }
    }

    public Adresse findAdresseByGouvernorat(String gouv) {
        Adresse adresse = new Adresse();
        String requete = "select * from adresse where gouvernorat = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, gouv);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                adresse.setId_adresse(resultat.getInt(1));
                System.out.println("Id adresse : " + adresse.getId_adresse());
                adresse.setGouvernorat(resultat.getString(2));
                System.out.println(resultat.getString(2));
                adresse.setGouvernorat(resultat.getString(3));
                System.out.println(resultat.getString(3));
            }
            return adresse;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du l'adresse " + ex.getMessage());
            return null;
        }
    }

    public List<Adresse> DisplayAllAdresses() {


        List<Adresse> listeadresses = new ArrayList<Adresse>();

        String requete = "select * from adresse";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Adresse adresse = new Adresse();
                adresse.setId_adresse(resultat.getInt(1));
                adresse.setGouvernorat(resultat.getString(2));
                adresse.setDelegation(resultat.getString(3));

                listeadresses.add(adresse);
                            //System.out.println(listeadresses);

            }
            return listeadresses;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des adresses " + ex.getMessage());
            return null;
        }
    } */
}
