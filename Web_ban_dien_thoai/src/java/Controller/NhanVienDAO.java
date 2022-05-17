/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.NhanVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author daotr
 */
public class NhanVienDAO {
    private Connection conn = null;

    public NhanVienDAO() {
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

    
    public void addNhanVien(NhanVien nhanVien) {
        String sql = "INSERT INTO tblNhanVien(idNhanVien,  ten, taiKhoan, matKhau) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nhanVien.getIdNhanVien());
            ps.setString(2, nhanVien.getTen());
            ps.setString(3, nhanVien.getTaiKhoan());
            ps.setString(4, nhanVien.getMatKhau());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
