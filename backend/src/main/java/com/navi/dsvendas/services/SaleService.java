package com.navi.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.navi.dsvendas.dto.SaleDTO;
import com.navi.dsvendas.dto.SaleSuccessDTO;
import com.navi.dsvendas.dto.SaleSumDTO;
import com.navi.dsvendas.entities.Sale;
import com.navi.dsvendas.repositories.SaleRepository;
import com.navi.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> list = saleRepository.findAll(pageable);
		Page<SaleDTO> listDto = list.map(x -> new SaleDTO(x));
		return listDto;
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return saleRepository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupBySeller(){
		return saleRepository.successGroupedBySeller();
	}
	
}
