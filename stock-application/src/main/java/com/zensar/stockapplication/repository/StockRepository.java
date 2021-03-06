package com.zensar.stockapplication.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.stockapplication.entity.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {

	public List<Stock> findByStockName(String stockName);

}
