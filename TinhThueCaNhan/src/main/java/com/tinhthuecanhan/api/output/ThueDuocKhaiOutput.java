package com.tinhthuecanhan.api.output;

import com.tinhthuecanhan.dto.ThueDuocKhaiDTO;

public class ThueDuocKhaiOutput {

	private float thue;
	private ThueDuocKhaiDTO thueDuocKhaiDTO;
	
	public ThueDuocKhaiOutput(ThueDuocKhaiDTO thueDuocKhaiDTO) {
		this.thueDuocKhaiDTO = thueDuocKhaiDTO;
		this.thue = thueDuocKhaiDTO.ThuePhaiDong();
	}


	


	public float getThue() {
		return thue;
	}





	public void setThue(float thue) {
		this.thue = thue;
	}





	public ThueDuocKhaiDTO getThueDuocKhaiDTO() {
		return thueDuocKhaiDTO;
	}


	public void setThueDuocKhaiDTO(ThueDuocKhaiDTO thueDuocKhaiDTO) {
		this.thueDuocKhaiDTO = thueDuocKhaiDTO;
	}



	
}
