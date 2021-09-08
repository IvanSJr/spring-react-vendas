package com.navi.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.navi.dsvendas.dto.SaleDTO;
import com.navi.dsvendas.dto.SaleSuccessDTO;
import com.navi.dsvendas.dto.SaleSumDTO;
import com.navi.dsvendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAllSales(Pageable pageable){
		Page<SaleDTO> response = saleService.findAll(pageable);
		return ResponseEntity.ok().body(response);
	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupBySeller(){
		List<SaleSumDTO> response = saleService.amountGroupedBySeller();
		return ResponseEntity.ok().body(response);
		
	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller(){
		List<SaleSuccessDTO> response = saleService.successGroupBySeller();
		return ResponseEntity.ok().body(response);
	}
	
}
