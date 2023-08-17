package com.tinhthuecanhan.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tinhthuecanhan.converter.CauHinhConverter;
import com.tinhthuecanhan.dto.CauHinhDTO;
import com.tinhthuecanhan.entity.CauHinhEntity;
import com.tinhthuecanhan.service.ICauHinhService;

@CrossOrigin
@RestController
public class CauHinhAPI {
	
	@Autowired
	private ICauHinhService cauHinhService;
	
	@Autowired
	private CauHinhConverter cauHinhConverter;
	
	@GetMapping(value = "/cauhinh/{id}")
    public ResponseEntity<CauHinhDTO> getById(@PathVariable Long id) {
    	CauHinhEntity cauHinhEntity = cauHinhService.findById(id);
    	if(cauHinhEntity != null) {
    		return new ResponseEntity<>(cauHinhConverter.toDTO(cauHinhEntity), HttpStatus.OK);
    	}
    	else {
    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	}
    }
    
    @PostMapping(value = "/cauhinh")
	public ResponseEntity<CauHinhDTO> createNew(@RequestBody CauHinhDTO model) {
		CauHinhEntity cauHinhEntity = cauHinhService.save(model);
    	if(cauHinhEntity != null) {
    		return new ResponseEntity<>(cauHinhConverter.toDTO(cauHinhEntity), HttpStatus.OK);
    	}
    	else {
    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	}
	}
    
    @GetMapping(value = "/cauhinh")
    public ResponseEntity<CauHinhDTO> getById() {
    	CauHinhEntity cauHinhEntity = cauHinhService.findCurrent();
    	if(cauHinhEntity != null) {
    		return new ResponseEntity<>(cauHinhConverter.toDTO(cauHinhEntity), HttpStatus.OK);
    	}
    	else {
    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	}
    }
}
