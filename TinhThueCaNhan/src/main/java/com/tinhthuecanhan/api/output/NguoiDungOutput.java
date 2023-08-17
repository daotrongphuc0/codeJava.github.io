package com.tinhthuecanhan.api.output;

import java.util.ArrayList;
import java.util.List;

import com.tinhthuecanhan.dto.NguoiDungDTO;


public class NguoiDungOutput {
	private int page;
	private int totalPage;
	private List<NguoiDungDTO> listResult = new ArrayList<>();
	
	public NguoiDungOutput() {
		// TODO Auto-generated constructor stub
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<NguoiDungDTO> getListResult() {
		return listResult;
	}

	public void setListResult(List<NguoiDungDTO> listResult) {
		this.listResult = listResult;
	}

	
	
	
}
