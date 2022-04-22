package com.zensar.stockapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.stockapplication.entity.Stock;

@Service
public class StockServiceImpl implements StockService {

	static List<Stock> stocks = new ArrayList<>();
	static {
		stocks.add(new Stock(21, "RIL", "BSE", 2160));
		stocks.add(new Stock(32, "Zensar", "BSE", 530));
		stocks.add(new Stock(2, "RM", "BSE", 30));

	}

	@Override
	public List<Stock> getAllStocks() {
		return stocks;
	}

	@Override
	public Stock getStock(long stockId) {
		for (Stock stock : stocks)
			if (stock.getStockId() == stockId) {
				return stock;
			}
		return null;
	}

	@Override
	public Stock createStock(Stock stock) {
		stocks.add(stock);
		return stock;
	}

	@Override
	public String deleteStock(long stockId) {

		for (Stock stock : stocks) {
			if (stock.getStockId() == stockId)

			{
				stocks.remove(stock);
				return "Stock Deleted Successfully : " + stockId;
			}

		}
		return "Sorry Stock Id is not Available";
	}

	@Override
	public String deleteAllStocks() {
		stocks.removeAll(stocks);
		return "All Stocks Deleted";
	}

	@Override
	public Stock updateStock(int stockId, Stock stock) {
		Stock availableStock = getStock(stockId);
		availableStock.setStockName(stock.getStockName());
		availableStock.setMarketName(stock.getMarketName());
		availableStock.setStockPrice(stock.getStockPrice());
		return availableStock;
	}

}
