/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author daotr
 */
public class NhanVien {
    private String idNhanVien;
    private String ten;
    private String taiKhoan;
    private String matKhau;
    private Date created_at;
    private Date updated_at;

    public NhanVien() {
    }

    public NhanVien(String idNhanVien, String ten, String taiKhoan, String matKhau, Date created_at, Date updated_at) {
        this.idNhanVien = idNhanVien;
        this.ten = ten;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

   

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public String getTen() {
        return ten;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Date getCreated_at() {
        return created_at;
    }


    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
    
}
