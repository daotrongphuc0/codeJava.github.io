/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.NguoiDung;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author daotr
 */
public class NguoiDungDAO {
    private Connection conn = null;

    public NguoiDungDAO() {
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-UB75S83\\DNBK3_SV0:1433;DatabaseName=WEB_DienThoai;encrypt=true;trustServerCertificate=true;";
            String user = "sa";
            String pass = "123456";
            conn = DriverManager.getConnection(dbURL, user, pass);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        
    }

    
    public void addNguoiDung(NguoiDung nguoiDung) {
        String sql = "INSERT INTO tblNguoiDung(idNguoiDung,  tenND, taiKhoan, matKhau,  email) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nguoiDung.getIdNguoiDung());
            ps.setString(2, nguoiDung.getTenND());
            ps.setString(3, nguoiDung.getTaiKhoan());
            ps.setString(4, nguoiDung.getMatKhau());
            ps.setString(5, nguoiDung.getEmail());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
