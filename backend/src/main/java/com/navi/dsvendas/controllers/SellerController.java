package com.navi.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.navi.dsvendas.dto.SellerDTO;
import com.navi.dsvendas.services.SellerService;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

	@Autowired
	private SellerService sellerService;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAllSellers(){
		List<SellerDTO> response = sellerService.findAll();
		return ResponseEntity.ok().body(response);
	}
	
}
