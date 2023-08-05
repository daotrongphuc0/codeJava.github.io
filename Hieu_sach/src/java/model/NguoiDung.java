/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author daotr
 */
public class NguoiDung {
    private int id;
    private String ten;
    private String tk;
    private String mk;
    private String email;
    private String diaChi;
    private int vaiTro;

    public NguoiDung() {
    }

    
    public NguoiDung(int id, String ten, String tk, String mk, String email, String diaChi, int vaiTro) {
        this.id = id;
        this.ten = ten;
        this.tk = tk;
        this.mk = mk;
        this.email = email;
        this.diaChi = diaChi;
        this.vaiTro = vaiTro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(int vaiTro) {
        this.vaiTro = vaiTro;
    }

    @Override
    public String toString() {
        return "NguoiDung{" + "id=" + id + ", ten=" + ten + ", tk=" + tk + ", mk=" + mk + ", email=" + email + ", diaChi=" + diaChi + ", vaiTro=" + vaiTro + '}';
    }

   
    
    
}

