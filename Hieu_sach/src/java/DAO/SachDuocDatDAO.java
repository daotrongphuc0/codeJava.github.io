/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.SachDuocDat;

/**
 *
 * @author daotr
 */
public class SachDuocDatDAO extends DBContext {
    
    
    public ArrayList<SachDuocDat> layTheoNguoiDung(int idNguoiDung) {
        ArrayList<SachDuocDat> list =  new ArrayList<>();

        String sql = "select * from tblSachDuocDat where idNguoiDung=" + idNguoiDung;

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SachDuocDat tmp = new SachDuocDat();
                tmp.setId(rs.getInt("id"));
                
                NguoiDungDAO a = new NguoiDungDAO();
                tmp.setNguoiDung(a.layTheoId(idNguoiDung));
                
                SachDAO b = new SachDAO();
                tmp.setSach(b.layTheoId(rs.getInt("idSach")));
                
                tmp.setSl(rs.getInt("sl"));
               

            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }
    
    public SachDuocDat layTheoId(int id) {
    

        String sql = "select * from tblSachDuocDat where theLoai=" + Integer.toString(id);
        SachDuocDat tmp = new SachDuocDat();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
                tmp.setId(rs.getInt("id"));
                
                NguoiDungDAO a = new NguoiDungDAO();
                tmp.setNguoiDung(a.layTheoId(id));
                
                SachDAO b = new SachDAO();
                tmp.setSach(b.layTheoId(rs.getInt("idSach")));
                
                tmp.setSl(rs.getInt("sl"));

                
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return tmp;
    }
    
    public void themSachDuocDat(SachDuocDat sachDuocDat) {
        String sql = "INSERT INTO tblSachDuocDat(idNguoiDung,idSach,sl) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, sachDuocDat.getNguoiDung().getId());
            ps.setInt(2, sachDuocDat.getSach().getId());
            ps.setInt(3,sachDuocDat.getSl());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void xoaTheoId(int id){
        String sql = "DELETE FROM tblSachDuocDat WHERE id="+ Integer.toString(id);
        try{
            PreparedStatement st = conn.prepareStatement(sql);         
            st.executeUpdate();
        } catch(SQLException e){
            System.out.println(e); 
        }
    }
}
