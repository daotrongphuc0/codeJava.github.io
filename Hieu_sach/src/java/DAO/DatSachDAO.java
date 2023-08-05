/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.DatSach;
import model.NguoiDung;
import model.Sach;

/**
 *
 * @author daotr
 */
public class DatSachDAO extends DBContext{
    public ArrayList<DatSach> layTatCa() {
        ArrayList<DatSach> list = new ArrayList<>();

        String sql = "select * from tbldatsach";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DatSach tmp = new DatSach();
                tmp.setId(rs.getInt("id"));
                
                
                NguoiDungDAO b = new NguoiDungDAO();
                tmp.setNguoiDung(b.layTheoId(rs.getInt("idNguoidung")));
                
                
                SachDAO s = new SachDAO();
                tmp.setSach(s.layTheoId(rs.getInt("idSach")));
                
                
                tmp.setSl(rs.getInt("sl"));
               

                list.add(tmp);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }
    
    public ArrayList<DatSach> layTheoNguoiDung(int idNguoiDung) {
        ArrayList<DatSach> list = new ArrayList<>();

        String sql = "select * from tbldatsach where idNguoiDung=" + idNguoiDung;

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DatSach tmp = new DatSach();
                tmp.setId(rs.getInt("id"));
                
                
                NguoiDungDAO b = new NguoiDungDAO();
                tmp.setNguoiDung(b.layTheoId(idNguoiDung));
                
                
                SachDAO s = new SachDAO();
                tmp.setSach(s.layTheoId(rs.getInt("idSach")));
                
                
                tmp.setSl(rs.getInt("sl"));

                list.add(tmp);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }
    
    public DatSach layTheoId(int id) {
    

        String sql = "select * from tbldatsach where id=" + Integer.toString(id);
        DatSach tmp = new DatSach();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                tmp.setId(rs.getInt("id"));
                
                
                NguoiDungDAO b = new NguoiDungDAO();
                tmp.setNguoiDung(b.layTheoId(rs.getInt("idNguoidung")));
                
                
                SachDAO s = new SachDAO();
                tmp.setSach(s.layTheoId(rs.getInt("idSach")));
                
                
                tmp.setSl(rs.getInt("gia"));
               

                
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return tmp;
    }
    
    public void themDatSach(DatSach datSach) {
        String sql = "INSERT INTO tbldatsach(idNguoiDung,idSach,sl) VALUES(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, datSach.getNguoiDung().getId());
            ps.setInt(2, datSach.getSach().getId());
            ps.setInt(3,datSach.getSl());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public boolean checkSanPham(int idNguoiDung, int idSach){
        String sql = "select * from tbldatsach where idNguoiDung="+idNguoiDung+" and idSach="+idSach;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return false;
    }
    
    public void updateSoluong(NguoiDung nguoiDung,Sach sach,int soLuong){
        String sql = "UPDATE tbldatsach SET sl=? WHERE idNguoiDung=? AND idSach=?";
        try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, soLuong);
                ps.setInt(2, nguoiDung.getId());
                ps.setInt(3, sach.getId());

                ps.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
    }
    public void xoaTheoId(int id){
        String sql = "DELETE FROM tbldatsach WHERE id="+id;
        try{
            PreparedStatement st = conn.prepareStatement(sql);         
            st.executeUpdate();
        } catch(SQLException e){
            System.out.println(e); 
        }
    }
    
    public void xoaTheoIdNguoiDung(int id){
        String sql = "DELETE FROM tbldatsach WHERE idNguoiDung="+id;
        try{
            PreparedStatement st = conn.prepareStatement(sql);         
            st.executeUpdate();
        } catch(SQLException e){
            System.out.println(e); 
        }
    }
    public static void main(String[] args) {
        DatSachDAO a = new DatSachDAO();
        for(DatSach i:a.layTheoNguoiDung(1)){
            System.out.println(i);
        }
    }
}
