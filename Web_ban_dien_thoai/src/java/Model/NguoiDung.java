/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author daotr
 */
public class NguoiDung {
    private String idNguoiDung;
    private String tenND;
    private String taiKhoan;
    private String matKhau;
    private String email;

    public NguoiDung() {
    }

    public NguoiDung(String idNguoiDung, String tenND, String taiKhoan, String matKhau, String email) {
        this.idNguoiDung = idNguoiDung;
        this.tenND = tenND;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.email = email;
    }

    public String getIdNguoiDung() {
        return idNguoiDung;
    }

    public String getTenND() {
        return tenND;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getEmail() {
        return email;
    }

    public void setIdNguoiDung(String idNguoiDung) {
        this.idNguoiDung = idNguoiDung;
    }

    public void setTenND(String tenND) {
        this.tenND = tenND;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
