/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author daotr
 */
public class dangnhapDAO {
    private Connection conn = null;

    public dangnhapDAO() {
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-UB75S83\\DNBK3_SV0:1433;DatabaseName=account;encrypt=true;trustServerCertificate=true;";
            String user = "sa";
            String pass = "123456";
            conn = DriverManager.getConnection(dbURL, user, pass);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } 
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void addUser(User user) {
        String sql = "INSERT INTO tblUser(name, pass) VALUES(?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getPass());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
