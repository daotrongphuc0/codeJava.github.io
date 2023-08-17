package com.tinhthuecanhan.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tinhthuecanhan.api.output.ListThueDuocKhaiOutput;
import com.tinhthuecanhan.api.output.ThueDuocKhaiOutput;
import com.tinhthuecanhan.converter.ThueDuocKhaiConverter;
import com.tinhthuecanhan.dto.ThueDuocKhaiDTO;
import com.tinhthuecanhan.entity.ThueDuocKhaiEntity;
import com.tinhthuecanhan.service.IThueDuocKhaiService;

@CrossOrigin
@RestController
public class ThueDuocKhaiApi {
	@Autowired
	private IThueDuocKhaiService thueDuocKhaiService;
	
	@Autowired
	private ThueDuocKhaiConverter thueDuocKhaiConverter;
	
	@GetMapping("thueduockhai/{id}")
	public ThueDuocKhaiOutput getRoleById(@PathVariable Long id) {
		ThueDuocKhaiEntity entity = thueDuocKhaiService.findById(id);
	    return new ThueDuocKhaiOutput(thueDuocKhaiConverter.toDTO(entity));
	}
	
	@PostMapping(value = "/thueduockhai")
	public ThueDuocKhaiOutput createNew(@RequestBody ThueDuocKhaiDTO model) {
		return new ThueDuocKhaiOutput(thueDuocKhaiConverter.toDTO(thueDuocKhaiService.save(model)));
	}
	
	@GetMapping(value = "/thueduockhai")
	public ListThueDuocKhaiOutput showNew( @RequestParam(value = "vung", required = false) Long vung,
							 @RequestParam(value = "status", required = false) String status) {
		
		if(status == null) {
			if(vung == null) {
				return new ListThueDuocKhaiOutput(thueDuocKhaiConverter.toDTO(thueDuocKhaiService.findAll()));
			}
			else {
				return new ListThueDuocKhaiOutput(thueDuocKhaiConverter.toDTO(thueDuocKhaiService.findAllByVung(vung)));
			}
		}else {
			if(vung == null) {
				return new ListThueDuocKhaiOutput(thueDuocKhaiConverter.toDTO(thueDuocKhaiService.findAllBySTT(status)));
			}
			else {
				return new ListThueDuocKhaiOutput(thueDuocKhaiConverter.toDTO(thueDuocKhaiService.findAllByVungAndSTT(vung, status)));
			}
		}
		
		
		
		
	}
}
