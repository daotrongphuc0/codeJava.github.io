/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
import java.sql.Date;
/**
 *
 * @author daotr
 */
public class SanPham {
    private String idSanPham;
    private String tenSP;
    private HangDT hangDT;
    private int pin;
    private int ram;
    private int rom;
    private String cpu;
    private String ktManHinh;
    private String cameraTruoc;
    private String cameraSau;
    private int gia;
    private ArrayList<HinhAnh> hinhAnh;
    private Date created_at;
    private Date updated_at;

    public SanPham() {
    }

    public SanPham(String idSanPham, String tenSP, HangDT hangDT, int pin, int ram, int rom, String cpu, String ktManHinh, String cameraTruoc, String cameraSau, int gia, ArrayList<HinhAnh> hinhAnh, Date created_at, Date updated_at) {
        this.idSanPham = idSanPham;
        this.tenSP = tenSP;
        this.hangDT = hangDT;
        this.pin = pin;
        this.ram = ram;
        this.rom = rom;
        this.cpu = cpu;
        this.ktManHinh = ktManHinh;
        this.cameraTruoc = cameraTruoc;
        this.cameraSau = cameraSau;
        this.gia = gia;
        this.hinhAnh = hinhAnh;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }


    
    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setHangDT(HangDT hangDT) {
        this.hangDT = hangDT;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setKtManHinh(String ktManHinh) {
        this.ktManHinh = ktManHinh;
    }

    public void setCameraTruoc(String cameraTruoc) {
        this.cameraTruoc = cameraTruoc;
    }

    public void setCameraSau(String cameraSau) {
        this.cameraSau = cameraSau;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setHinhAnh(ArrayList<HinhAnh> hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public String getTenSP() {
        return tenSP;
    }

    public HangDT getHangDT() {
        return hangDT;
    }

    public int getPin() {
        return pin;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public String getCpu() {
        return cpu;
    }

    public String getKtManHinh() {
        return ktManHinh;
    }

    public String getCameraTruoc() {
        return cameraTruoc;
    }

    public String getCameraSau() {
        return cameraSau;
    }

    public int getGia() {
        return gia;
    }

    public ArrayList<HinhAnh> getHinhAnh() {
        return hinhAnh;
    }
    
    
}
