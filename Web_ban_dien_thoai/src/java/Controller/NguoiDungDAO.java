/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.NguoiDung;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author daotr
 */
public class NguoiDungDAO  extends DBContext{ 
    public void addNguoiDung(NguoiDung nguoiDung) {
        String sql = "INSERT INTO tblNguoiDung(idNguoiDung,  tenND, taiKhoan, matKhau,  email, created_at, updated_at) VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nguoiDung.getIdNguoiDung());
            ps.setString(2, nguoiDung.getTenND());
            ps.setString(3, nguoiDung.getTaiKhoan());
            ps.setString(4, nguoiDung.getMatKhau());
            ps.setString(5, nguoiDung.getEmail());
            ps.setDate(6, nguoiDung.getCreated_at());
            ps.setDate(7, nguoiDung.getUpdated_at());
            
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<NguoiDung> getAll(){
        ArrayList<NguoiDung> list = new ArrayList<>();
        
        String sql = "select * from dbo.NguoiDung";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                NguoiDung tmp = new NguoiDung();
                tmp.setIdNguoiDung(rs.getString("idNguoiDung"));
                tmp.setTenND(rs.getString("tenND"));
                tmp.setTaiKhoan(rs.getString("taiKhoan"));
                tmp.setMatKhau(rs.getString("matKhau"));
                tmp.setEmail(rs.getString("email"));
                tmp.setCreated_at(rs.getDate("created_at"));
                tmp.setUpdated_at(rs.getDate("updated_at"));
                list.add(tmp);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return list;
    }
    
    
    public static void main(String[] args) {
        NguoiDungDAO n = new NguoiDungDAO();
        ArrayList<NguoiDung> a = n.getAll();
        System.out.println(a.get(0).getIdNguoiDung());
    }
    
}
