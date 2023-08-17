package com.tinhthuecanhan.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tinhthuecanhan.converter.ChungMinhTaiChinhConverter;
import com.tinhthuecanhan.dto.ChungMinhTaiChinhDTO;
import com.tinhthuecanhan.entity.ChungMinhTaiChinhEntity;
import com.tinhthuecanhan.service.IChungMinhTaiChinhService;

@CrossOrigin
@RestController
public class ChungMinhTaiChinhAPI {

	@Autowired
	private IChungMinhTaiChinhService chungMinhTaiChinhService;

	@Autowired
	private ChungMinhTaiChinhConverter chungMinhTaiChinhConverter;

	@GetMapping("/chungMinhTaiChinh/{id}")
	public ChungMinhTaiChinhDTO getChungMinhTaiChinhById(@PathVariable Long id) {
		ChungMinhTaiChinhEntity entity = chungMinhTaiChinhService.findOne(id);
		return chungMinhTaiChinhConverter.toDTO(entity);
	}

	@GetMapping("/cmtcByThueDuocKhai")
	public List<ChungMinhTaiChinhDTO> showNew(@RequestParam(value = "idTDK") Long idTDK) {

		return chungMinhTaiChinhConverter.toDTO(chungMinhTaiChinhService.findAllByTDKID(idTDK));
	}

	@PostMapping(value = "/chungMinhTaiChinh")
	public ChungMinhTaiChinhDTO createNew(@RequestBody ChungMinhTaiChinhDTO model) {
		return chungMinhTaiChinhConverter.toDTO(chungMinhTaiChinhService.save(model));
	}
}
