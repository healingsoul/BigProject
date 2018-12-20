/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigproject.Lib;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Alfaza
 */
public class Controller {
    
    private Admin extractAdminFromResultSet(ResultSet rs) throws SQLException {
    Admin admin = new Admin();
    admin.setIdDokter( rs.getInt("id_dokter") );
    admin.setNama( rs.getString("nama") );
    admin.setSpesialis( rs.getString("spesialis") );
    return admin;
}
    
    
    
    public Admin getAdmin(int id_dokter) {
    Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM admin WHERE id=" + id_dokter);
            if(rs.next())
            {
                Admin admin = new Admin();
                admin.setIdDokter( rs.getInt("id_dokter") );
                admin.setNama( rs.getString("nama") );
                admin.setSpesialis( rs.getString("spesialis") );
                
                return admin;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    return null;
}
    
    
//Login Method
    public Admin getadminByadminNameAndPassword(String user, String pass) {
    ConnectionFactory connector = new ConnectionFactory();
    Connection connection = connector.getConnection();
    try {
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM admin WHERE user=? AND pass=?");
        ps.setString(1, user);
        ps.setString(2, pass);
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
    return extractAdminFromResultSet(rs);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return null;
}
    
//Select All Method
    public Set getAllAdmin() {
    ConnectionFactory connector = new ConnectionFactory();
    Connection connection = connector.getConnection();
    try {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM admin");
        Set admins = new HashSet();
        while(rs.next())
        {
            Admin admin = extractAdminFromResultSet(rs);
            admins.add(admin);
        }
        return admins;
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return null;
}
    
//Insert
    public boolean insertAdmin(Admin admin) {
    ConnectionFactory connector = new ConnectionFactory();
    Connection connection = connector.getConnection();
    try {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO admin(nama, spesialis) VALUES (?, ?)");
        ps.setString(1, admin.getNama());
        ps.setString(2, admin.getSpesialis());
        int i = ps.executeUpdate();
      if(i == 1) {
        return true;
      }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return false;
}
 //Update Method   
    public boolean updateAdmin(Admin admin) {
    ConnectionFactory connector = new ConnectionFactory();
    Connection connection = connector.getConnection();
    try {
        PreparedStatement ps = connection.prepareStatement("UPDATE admin SET name=?, spesialis=? WHERE id_dokter=?");
        ps.setString(1, admin.getNama());
        ps.setString(2, admin.getSpesialis());
        ps.setInt(3, admin.getIdDokter());
        int i = ps.executeUpdate();
      if(i == 1) {
    return true;
      }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return false;
}
    //Delete Method
    public boolean deleteAdmin(int id_dokter) {
    ConnectionFactory connector = new ConnectionFactory();
    Connection connection = connector.getConnection();
    try {
        Statement stmt = connection.createStatement();
        int i = stmt.executeUpdate("DELETE FROM admin WHERE id=" + id_dokter);
      if(i == 1) {
    return true;
      }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return false;
}

}
