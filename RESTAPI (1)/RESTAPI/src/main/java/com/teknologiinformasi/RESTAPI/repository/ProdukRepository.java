package com.teknologiinformasi.RESTAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teknologiinformasi.RESTAPI.model.Produk;


@Repository
public interface ProdukRepository extends JpaRepository<Produk, Long> {
}
