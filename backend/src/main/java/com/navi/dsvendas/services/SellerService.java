package com.navi.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navi.dsvendas.dto.SellerDTO;
import com.navi.dsvendas.entities.Seller;
import com.navi.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;
	
	public List<SellerDTO> findAll(){
		
		List<Seller> list = sellerRepository.findAll();
		List<SellerDTO> listDto = list.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
		return listDto;
		
	}
	
}
