/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Sach;

/**
 *
 * @author daotr
 */
public class SachDAO extends DBContext{
    public ArrayList<Sach> layTatCa() {
        ArrayList<Sach> list = new ArrayList<>();

        String sql = "select * from tblsach";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Sach tmp = new Sach();
                tmp.setId(rs.getInt("id"));
                tmp.setTen(rs.getString("ten"));
                tmp.setTacGia(rs.getString("tacGia"));
                tmp.setTheLoai(rs.getString("theLoai"));
                tmp.setGia(rs.getInt("gia"));

                list.add(tmp);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }
    
    public ArrayList<Sach> timSach(String s) {
        ArrayList<Sach> list = new ArrayList<>();

        String sql = "select * from tblsach where ten LIKE '%"+s+"%'";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Sach tmp = new Sach();
                tmp.setId(rs.getInt("id"));
                tmp.setTen(rs.getString("ten"));
                tmp.setTacGia(rs.getString("tacGia"));
                tmp.setTheLoai(rs.getString("theLoai"));
                tmp.setGia(rs.getInt("gia"));

                list.add(tmp);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }
    
    public ArrayList<Sach> layTheoTheLoai(String theLoai) {
        ArrayList<Sach> list = new ArrayList<>();

        String sql = "select * from tblsach where theLoai=" + theLoai;

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Sach tmp = new Sach();
                tmp.setId(rs.getInt("id"));
                tmp.setTen(rs.getString("ten"));
                tmp.setTacGia(rs.getString("tacGia"));
                tmp.setTheLoai(rs.getString("theLoai"));
                tmp.setGia(rs.getInt("gia"));

                list.add(tmp);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }
    
    public Sach layTheoId(int id) {
    

        String sql = "select * from tblsach where id=" + Integer.toString(id);
        Sach tmp = new Sach();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
                tmp.setId(rs.getInt("id"));
                tmp.setTen(rs.getString("ten"));
                tmp.setTacGia(rs.getString("tacGia"));
                tmp.setTheLoai(rs.getString("theLoai"));
                tmp.setGia(rs.getInt("gia"));

                
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return tmp;
    }
    
    public void themSach(Sach sach) {
        String sql = "INSERT INTO tblsach(ten,tacGia,theLoai,gia) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sach.getTen());
            ps.setString(2, sach.getTacGia());
            ps.setString(3, sach.getTheLoai());
            ps.setInt(4,sach.getGia());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void xoaTheoId(int id){
        String sql = "DELETE FROM tblsach WHERE id="+ Integer.toString(id);
        try{
            PreparedStatement st = conn.prepareStatement(sql);         
            st.executeUpdate();
        } catch(SQLException e){
            System.out.println(e); 
        }
    }

    public void update(Sach a) {
        String sql = "UPDATE tblsach SET  ten= ?,tacGia=?,theLoai=?,gia=?  WHERE id="+a.getId();
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, a.getTen());
            ps.setString(2, a.getTacGia());
            ps.setString(3, a.getTheLoai());
            ps.setInt(4, a.getGia());
            ps.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }

    public void delete(int id) {
        DatSachDAO dsd = new DatSachDAO();
        dsd.xoaTheoIdNguoiDung(id);
        String sql = "DELETE FROM tblsach WHERE id="+id;
        try{
            PreparedStatement st = conn.prepareStatement(sql);         
            st.executeUpdate();
        } catch(SQLException e){
            System.out.println(e); 
        }
    }
}
