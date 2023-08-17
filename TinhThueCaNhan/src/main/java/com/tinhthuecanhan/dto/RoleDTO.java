package com.tinhthuecanhan.dto;

public class RoleDTO extends BaseDTO {
    private int isAdmin,xemDanhSach,xuatBaoCao,cauHinh;

    public RoleDTO() {
    }


    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getXemDanhSach() {
        return xemDanhSach;
    }

    public void setXemDanhSach(int xemDanhSach) {
        this.xemDanhSach = xemDanhSach;
    }

    public int getXuatBaoCao() {
        return xuatBaoCao;
    }

    public void setXuatBaoCao(int xuatBaoCao) {
        this.xuatBaoCao = xuatBaoCao;
    }

    public int getCauHinh() {
        return cauHinh;
    }

    public void setCauHinh(int cauHinh) {
        this.cauHinh = cauHinh;
    }

    
    
}
