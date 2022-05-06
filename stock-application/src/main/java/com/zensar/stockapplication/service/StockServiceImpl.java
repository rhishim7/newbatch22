package com.zensar.stockapplication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.zensar.stockapplication.entity.Stock;
import com.zensar.stockapplication.entity.StockRequest;
import com.zensar.stockapplication.entity.StockResponse;
import com.zensar.stockapplication.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockRepository stockRepository;
	private ModelMapper modelMapper;
//	static List<Stock> stocks = new ArrayList<>();
//	static {
//		stocks.add(new Stock(21, "RIL", "BSE", 2160));
//		stocks.add(new Stock(32, "Zensar", "BSE", 530));
//		stocks.add(new Stock(2, "RM", "BSE", 30));
//
//	}

	@Override
	public List<Stock> getAllStocks(int pageNumber,int pageSize,String[] sortBy) {
		Page<Stock> pageStocks = stockRepository.findAll(PageRequest.of(pageNumber, pageSize,Sort.by(sortBy)));
		return pageStocks.getContent();
	}
	
	@Override
	public List<StockResponse> getStockByName(String stockName) {

		List<Stock> findStockByName = stockRepository.findByStockName(stockName);
		List<StockResponse> stocks = new ArrayList<StockResponse>();

		for(Stock st:findStockByName) {
		stocks.add(modelMapper.map(st, StockResponse.class));
		}
		return stocks;

		}

	@Override
	public Stock getStock(long stockId) {
//		for (Stock stock : stocks)
//			if (stock.getStockId() == stockId) {
//				return stock;
//			}
//		return null;
		Optional<Stock> optStock = stockRepository.findById(stockId);
		if(optStock.isPresent())
		{
			Stock stock = optStock.get();
			return stock;
		}
		return new Stock();
	}

	@Override
	public Stock createStock(StockRequest stock) {
//		stocks.add(stock);
//		return stock;
		Stock newStock = new Stock();
		newStock.setStockName(stock.getStockName());
		newStock.setMarketName(stock.getMarketName());		
		newStock.setStockPrice(stock.getStockPrice());
		return stockRepository.save(newStock);
	}

	@Override
	public String deleteStock(long id) {
		stockRepository.deleteById(id);
		return "Stock Deleted : "+id;
//		for (Stock stock : stocks) {
//			if (stock.getStockId() == stockId)
//
//			{
//				stocks.remove(stock);
//				return "Stock Deleted Successfully : " + stockId;
//			}
//
//		}
//		return "Sorry Stock Id is not Available";
	}

	@Override
	public String deleteAllStocks() {
//		stocks.removeAll(stocks);
		
		stockRepository.deleteAll();
		return "All Stocks Deleted";
	}

	@Override
	public Stock updateStock(long stockId, Stock stock) {
		Stock availableStock = getStock(stockId);
		return stockRepository.save(stock);
//		availableStock.setStockName(stock.getStockName());
//		availableStock.setMarketName(stock.getMarketName());
//		availableStock.setStockPrice(stock.getStockPrice());
//		return availableStock;
	}


}
