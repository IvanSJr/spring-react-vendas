package com.navi.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.navi.dsvendas.entities.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long>{

}
