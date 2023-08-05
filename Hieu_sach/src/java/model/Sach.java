/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author daotr
 */
public class Sach {
    private int id;
    private String ten;
    private String tacGia;
    private String theLoai;
    private int gia;

    public Sach() {
    }

    public Sach(int id, String ten, String tacGia, String theLoai, int gia) {
        this.id = id;
        this.ten = ten;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.gia = gia;
    }

   

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
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

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    @Override
    public String toString() {
        return "Sach{" + "id=" + id + ", ten=" + ten + ", tacGia=" + tacGia + ", theLoai=" + theLoai + ", gia=" + gia + '}';
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    
    
    
}
