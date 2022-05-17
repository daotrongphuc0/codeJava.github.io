/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author daotr
 */
public class NhanVien {
    private String idNhanVien;
    private String ten;
    private String taiKhoan;
    private String matKhau;

    public NhanVien() {
    }

    public NhanVien(String idNhanVien, String ten, String taiKhoan, String matKhau) {
        this.idNhanVien = idNhanVien;
        this.ten = ten;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
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
    
}
