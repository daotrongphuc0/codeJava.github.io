/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.NguoiDung;
import model.Sach;

/**
 *
 * @author daotr
 */
public class NguoiDungDAO extends DBContext{
    
    
    public ArrayList<NguoiDung> layTatCa() {
        ArrayList<NguoiDung> list = new ArrayList<>();

        String sql = "select * from tblnguoidung";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NguoiDung tmp = new NguoiDung();
                tmp.setId(rs.getInt("id"));
                tmp.setTen(rs.getString("ten"));
                tmp.setTk(rs.getString("tk"));
                tmp.setMk(rs.getString("mk"));
                tmp.setEmail(rs.getString("email"));
                tmp.setDiaChi(rs.getString("diaChi"));
                tmp.setVaiTro(rs.getInt("vaiTro"));

                list.add(tmp);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }
    
    public NguoiDung layTheoId(int idNguoiDung) {
        String sql = "select * from tblnguoidung where id=" + idNguoiDung ;
        NguoiDung tmp = new NguoiDung();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){   
                tmp.setId(rs.getInt("id"));
                tmp.setTen(rs.getString("ten"));
                tmp.setTk(rs.getString("tk"));
                tmp.setMk(rs.getString("mk"));
                tmp.setEmail(rs.getString("email"));
                tmp.setDiaChi(rs.getString("diaChi"));
                tmp.setVaiTro(rs.getInt("vaiTro"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return tmp;
    }
    
    public  void themNguoiDung(NguoiDung nguoiDung) {
        String sql = "INSERT INTO tblnguoidung(vaiTro,  ten, tk, mk,  email, diaChi) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, nguoiDung.getVaiTro());
            ps.setString(2, nguoiDung.getTen());
            ps.setString(3, nguoiDung.getTk());
            ps.setString(4, nguoiDung.getMk());
            ps.setString(5, nguoiDung.getEmail());
            ps.setString(6, nguoiDung.getDiaChi());
            
            
            

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void update(NguoiDung nguoiDung){
        String sql = "UPDATE tblnguoidung SET vaiTro=?, ten= ?,tk=?,mk=?,email=?,diaChi=?  WHERE id="+nguoiDung.getId();
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, nguoiDung.getVaiTro());
            ps.setString(2, nguoiDung.getTen());
            ps.setString(3, nguoiDung.getTk());
            ps.setString(4, nguoiDung.getMk());
            ps.setString(5, nguoiDung.getEmail());
            ps.setString(6, nguoiDung.getDiaChi());
            ps.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void delete(int id){
        DatSachDAO dsd = new DatSachDAO();
        dsd.xoaTheoIdNguoiDung(id);
        String sql = "DELETE FROM tblnguoidung WHERE id="+id;
        try{
            PreparedStatement st = conn.prepareStatement(sql);         
            st.executeUpdate();
        } catch(SQLException e){
            System.out.println(e); 
        }
    }
    public NguoiDung check(String user,String pass){
        String sql = "select * from tblnguoidung where tk=? and mk=?";
        try{
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1,user);
            st.setString(2,pass);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                return new NguoiDung(rs.getInt("id"),rs.getString("ten"),
                        user, pass, rs.getString("email"),rs.getString("diaChi"),
                        rs.getInt("vaiTro"));
            }
        } catch(SQLException e){
            
        }
        return null;
    }
    public static void main(String[] args) {
        NguoiDungDAO a = new NguoiDungDAO();
        
        NguoiDung b =a.layTheoId(1);
        b.setDiaChi("VN");
        a.update(b);
        System.out.println(a.layTheoId(1));
        
    }

    
}
