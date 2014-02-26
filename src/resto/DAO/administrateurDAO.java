package resto.DAO;
import resto.util.MyConnection;
import java.sql.*;
import resto.entities.administrateur;



public class administrateurDAO {


     public void updateadministrateur(administrateur admin){
        String requete = " update administrateur set pwd=? , login=? where id_admin=? ";
       try {
           //dep=depdao.findDepotById(st.getDepot().getId_dep());
            PreparedStatement ps =  MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, admin.getLogin());
            ps.setString(2, admin.getPwd());
            ps.setInt(3, admin.getId_admin());


          /*  ps.setInt(1,admin.getId_admin());
            ps.setString(2,admin.getPwd());
            ps.setString(3,admin.getLogin());*/
            ps.executeUpdate();
            System.out.println(" Mise à jour du password est effectuée avec succès ");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(" erreur lors de la mise à jour "+ex.getMessage());
        }

    }


     public administrateur findadministrateurByID(int id) {
        administrateur admin = new administrateur();
        String requete = "select * from administrateur where id_admin=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                admin.setId_admin(resultat.getInt(1));
                admin.setLogin(resultat.getString(2));
                admin.setPwd(resultat.getString(3));

                System.out.println("id" + resultat.getInt(1));
                System.out.println(resultat.getString(2));
                System.out.println(resultat.getString(3));
            }
            return admin;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche de l'administrateur " + ex.getMessage());
            return null;
        }
    }


    public boolean authenticate() {
        String requete = "SELECT * FROM administrateur";
administrateur Admin = new administrateur();
boolean userExist = false;

        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {

                if ((Admin.getLogin().equals(resultat.getString("login"))) && (Admin.getPwd().equals(resultat.getString("pwd")))) {
                    userExist = true;
//return (aux);
                } else {
                    userExist = false;
// return (aux);
                }

            }

        } catch (Exception e) {
            System.out.println("echec pilote : " + e);
        }


        return (userExist);

    }
}
