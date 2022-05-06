package com.zensar.stockapplication.service;

import java.util.List;

import com.zensar.stockapplication.entity.Stock;

public interface StockService {

	public List<Stock> getAllStocks(int pageNumber,int pageSize,String[] sortBy);
	
	public Stock getStock(long stockId) ;
	
	public Stock createStock(Stock stock);
	
	public String deleteStock(long stockId);
	
	public String deleteAllStocks();
	
	public Stock updateStock(long stockId,Stock stock);

	public List<Stock> getStockByName(String stockName);
}
