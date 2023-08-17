package com.tinhthuecanhan.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tinhthuecanhan.converter.HoaDonConverter;
import com.tinhthuecanhan.dto.HoaDonDTO;
import com.tinhthuecanhan.entity.HoaDonEntity;
import com.tinhthuecanhan.service.IHoaDonService;

@CrossOrigin
@RestController
public class HoaDonAPI {
	
	@Autowired
	private IHoaDonService hoaDonService;
	
	@Autowired
	private HoaDonConverter hoaDonConverter;
	
	@GetMapping("hoadon/{id}")
	public HoaDonDTO getHoaDonById(@PathVariable Long id) {
	    HoaDonEntity entity = hoaDonService.findById(id);
	    return hoaDonConverter.toDTO(entity);
	}
	
	@PostMapping(value = "/hoadon")
	public HoaDonDTO createNew(@RequestBody HoaDonDTO model) {
		return hoaDonConverter.toDTO(hoaDonService.save(model));
	}
}
