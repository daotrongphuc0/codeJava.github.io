package com.tinhthuecanhan.dto;

public class ThueDuocKhaiDTO extends BaseDTO{
 
    private Long nguoiDungId;

    private float thuNhap,mucLuongDongBH;
    private Long vung,nguoiPhuThuoc;
    private String trangThai;
    private Long thangKhai, namKhai;
    
    private CauHinhDTO cauHinhDTO;
    
    


    

    public ThueDuocKhaiDTO() {
    }

 

    public Long getThangKhai() {
		return thangKhai;
	}




    public float ThuePhaiDong() {
    	float thuNhapChiuthue =  (this.thuNhap-this.tinhGiamThue());
    	float res = 0;
    	if(thuNhapChiuthue <=0) return res;
    	//<5    	
    	if(thuNhapChiuthue >= 5000000) {
    		
    		float tmp = (5000000*this.getCauHinhDTO().getNhoHonBang5());
    		res += tmp;
    		thuNhapChiuthue -= 5000000;
    	}
    	else {
    		res += (thuNhapChiuthue * this.getCauHinhDTO().getNhoHonBang5());
    		return res;
    	}
    	
    	
    	//5-10
    	if(thuNhapChiuthue >= 5000000) {
    		float tmp = (5000000*this.getCauHinhDTO().getTu5den10());
    		res += tmp;
    		thuNhapChiuthue -= 5000000;
    	}
    	else {
    		res =  res +(thuNhapChiuthue * this.getCauHinhDTO().getTu5den10());
    		return res;
    	}
    	
    	//10-18
    	if(thuNhapChiuthue >= 8000000) {
    		float tmp = (8000000*this.getCauHinhDTO().getTu10den18());
    		res += tmp;
    		thuNhapChiuthue -= 8000000;
    	}
    	else {
    		res =  res + (thuNhapChiuthue * this.getCauHinhDTO().getTu10den18());
    		return res;
    	}
    	//18-32
    	if(thuNhapChiuthue >= 14000000) {
    		float tmp = (14000000*this.getCauHinhDTO().getTu18den32());
    		res += tmp;
    		thuNhapChiuthue -= 14000000;
    	}
    	else {
    		res =  res + (thuNhapChiuthue * this.getCauHinhDTO().getTu18den32());
    		return res;
    	}
    	
    	//32-52
    	if(thuNhapChiuthue >= 20000000) {
    		float tmp = (20000000*this.getCauHinhDTO().getTu32den52());
    		thuNhapChiuthue -= 20000000;
    		res += tmp;
    	}
    	else {
    		res =  res + (thuNhapChiuthue * this.getCauHinhDTO().getTu32den52());
    		return res;
    	}
    	//52-80
    	if(thuNhapChiuthue >= 28000000) {
    		float tmp =(28000000*this.getCauHinhDTO().getTu52den80());
    		thuNhapChiuthue -= 28000000;
    		res +=tmp;
    	}
    	else {
    		res =  res + (thuNhapChiuthue * this.getCauHinhDTO().getTu52den80());
    		return res;
    	}
    	res =  res + (thuNhapChiuthue*this.getCauHinhDTO().getTren80());
    	return res;
    }
    
    
    public float tinhGiamThue() {

    	float gtBHYT = Math.min(this.mucLuongDongBH*this.getCauHinhDTO().getMucDongBHYT(), this.getCauHinhDTO().getMucLuongToiDaBHYT()*this.getCauHinhDTO().getMucDongBHYT());
    	float gtBHXH = Math.min(this.mucLuongDongBH*this.getCauHinhDTO().getMucDongBHXH(), this.getCauHinhDTO().getMucLuongToiDaBHXH()*this.getCauHinhDTO().getMucDongBHXH());   	
    	float gtBHTN = Math.min(this.mucLuongDongBH*this.getCauHinhDTO().getMucDongBHTN(), layLuongTTV(this.getVung())*20*this.getCauHinhDTO().getMucDongBHTN());
    	
    	return gtBHYT + gtBHXH + gtBHTN+ this.getCauHinhDTO().getGiamTruGiaCanh()+ this.getCauHinhDTO().getGiamTruNguoiPhuThuoc()*this.nguoiPhuThuoc;
    }
    
    public float layLuongTTV(Long vung) {

    	if(vung ==1) {
    		return this.getCauHinhDTO().getVung1();
    	}
    	if(vung ==2) {
    		return this.getCauHinhDTO().getVung2();
    	}
    	if(vung ==3) {
    		return this.getCauHinhDTO().getVung3();
    	}
    	if(vung ==4) {
    		return this.getCauHinhDTO().getVung4();
    	}
    	return 0;
    }
    




	public CauHinhDTO getCauHinhDTO() {
		return cauHinhDTO;
	}



	public void setCauHinhDTO(CauHinhDTO cauHinhDTO) {
		this.cauHinhDTO = cauHinhDTO;
	}






	public Long getNguoiDungId() {
		return nguoiDungId;
	}



	public void setNguoiDungId(Long nguoiDungId) {
		this.nguoiDungId = nguoiDungId;
	}



	public void setThangKhai(Long thangKhai) {
		this.thangKhai = thangKhai;
	}



	public Long getNamKhai() {
		return namKhai;
	}



	public void setNamKhai(Long namKhai) {
		this.namKhai = namKhai;
	}


    public float getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(float thuNhap) {
        this.thuNhap = thuNhap;
    }

    public float getMucLuongDongBH() {
        return mucLuongDongBH;
    }

    public void setMucLuongDongBH(float mucLuongDongBH) {
        this.mucLuongDongBH = mucLuongDongBH;
    }

    public Long getVung() {
        return vung;
    }

    public void setVung(Long vung) {
        this.vung = vung;
    }

    public Long getNguoiPhuThuoc() {
        return nguoiPhuThuoc;
    }

    public void setNguoiPhuThuoc(Long nguoiPhuThuoc) {
        this.nguoiPhuThuoc = nguoiPhuThuoc;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }


    
}
