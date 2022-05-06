package com.zensar.stockapplication.service;

import java.util.List;

import com.zensar.stockapplication.entity.Stock;
import com.zensar.stockapplication.entity.StockRequest;
import com.zensar.stockapplication.entity.StockResponse;

public interface StockService {

	public List<Stock> getAllStocks(int pageNumber,int pageSize,String[] sortBy);
	
	public Stock getStock(long stockId) ;
	
	public Stock createStock(StockRequest stock);
	
	public String deleteStock(long stockId);
	
	public String deleteAllStocks();
	
	public Stock updateStock(long stockId,Stock stock);

	public List<StockResponse> getStockByName(String stockName);
}
