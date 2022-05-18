/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.NguoiDung;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author daotr
 */
public class NguoiDungDAO  extends DBContext{ 
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
    public ArrayList<NguoiDung> getAll(){
        ArrayList<NguoiDung> list = new ArrayList<>();
        
        String sql = "select * from dbo.NguoiDung";
        
        
        return list;
    }
    
}
