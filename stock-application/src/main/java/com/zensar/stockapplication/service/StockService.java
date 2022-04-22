package com.zensar.stockapplication.service;

import java.util.List;

import com.zensar.stockapplication.entity.Stock;

public interface StockService {

	public List<Stock> getAllStocks();
	
	public Stock getStock(long stockId) ;
	
	public Stock createStock(Stock stock);
	
	public String deleteStock(long stockId);
	
	public String deleteAllStocks();
	
	public Stock updateStock(int stockId,Stock stock);
}
