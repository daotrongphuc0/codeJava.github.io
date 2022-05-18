/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.NhanVien;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author daotr
 */
public class NhanVienDAO extends DBContext{
    public void addNhanVien(NhanVien nhanVien) {
        String sql = "INSERT INTO tblNhanVien(idNhanVien,  ten, taiKhoan, matKhau) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nhanVien.getIdNhanVien());
            ps.setString(2, nhanVien.getTen());
            ps.setString(3, nhanVien.getTaiKhoan());
            ps.setString(4, nhanVien.getMatKhau());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
}
