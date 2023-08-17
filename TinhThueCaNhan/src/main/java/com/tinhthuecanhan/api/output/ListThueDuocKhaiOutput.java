package com.tinhthuecanhan.api.output;

import java.util.List;

import com.tinhthuecanhan.dto.ThueDuocKhaiDTO;

public class ListThueDuocKhaiOutput {
	private float tongThue;
	private List<ThueDuocKhaiDTO> list;
	
	
	public ListThueDuocKhaiOutput(List<ThueDuocKhaiDTO> list) {
		this.list = list;
		float res = new Long("0");
		for(ThueDuocKhaiDTO i:list) {
			res += i.ThuePhaiDong();
		}
		this.tongThue = res;
	}


	public float getTongThue() {
		return tongThue;
	}


	public void setTongThue(Long tongThue) {
		this.tongThue = tongThue;
	}


	public List<ThueDuocKhaiDTO> getList() {
		return list;
	}


	public void setList(List<ThueDuocKhaiDTO> list) {
		this.list = list;
	}
	
	
}
