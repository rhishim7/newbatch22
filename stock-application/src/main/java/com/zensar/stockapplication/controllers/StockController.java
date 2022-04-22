package com.zensar.stockapplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.stockapplication.entity.Stock;
import com.zensar.stockapplication.service.StockService;

@RestController
@RequestMapping("/stocks") // Pre map the URI/URL to all the mapping's.
public class StockController {
	
	@Autowired
	private StockService stockService;

//	static List<Stock> stocks = new ArrayList<>();
//	static {
//		stocks.add(new Stock(21, "RIL", "BSE", 2160));
//		stocks.add(new Stock(32, "Zensar", "BSE", 530));
//		stocks.add(new Stock(2, "RM", "BSE", 30));
//
//	}

//	public StockController()
//	{
//		stocks.add(new Stock(21, "RIL","BSE", 2160));
//		stocks.add(new Stock(32, "Zensar","BSE", 530));
//		stocks.add(new Stock(2, "RM","BSE", 30));
//	}

	// Now we have to map these to url then we use annotation as GETMapping
	//here url is already defined above
	@GetMapping()
	public List<Stock> getAllStocks() {
		return stockService.getAllStocks();
	}

	// Here we are accessing specific stock id using URL
	//url already added on top /stocks
	@GetMapping("{stockId}")
	public Stock getStock(@PathVariable long stockId) {
		return stockService.getStock(stockId);
	}

	// another method
	// for accessing stocks or specific stocks id using url
	// requestParam is anothe method which we have to pass ?=value in the URL to get
	// data
//	@GetMapping("/stocks")
//	public Stock getStockUsingRequestParam(@RequestParam(value = "id",defaultValue = "2") long id)
//	{
//		for(Stock stock:stocks)
//			if(stock.getStockId()==id)
//			{
//				return stock;
//			}
//		return null;
//	}

	
	//Using java 8 for accessing specific stock from its id
	//url already added on top /stocks
//	@GetMapping("{stockId}")
//	public Stock getStock(@PathVariable long stockId) {
//		Optional<Stock> stockFound = stocks.stream().filter(stock -> stock.getStockId()==stockId).findAny();
//		if(stockFound.isPresent())
//		{
//			return stockFound.get();
//		}
//		else
//		{
//			return new Stock();
//		}
//		
//	}
	
	// Creating a stock using POST method
	// Request Body is used to provide JSON envir body to write a code
	// ResponseEntity is a class to play with the status code.
	//url already added on top /stocks
	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Stock createStock(@RequestBody Stock stock) {
		return stockService.createStock(stock);
	}

//	@PostMapping("/stocks")	
//	public ResponseEntity<Stock> createStock(@RequestBody Stock stock) {
//		stocks.add(stock);
//		return new ResponseEntity<>(stock, HttpStatus.CREATED);
//	}

	// delete
	//url already added on top /stocks
	@DeleteMapping("/{stockId}")
	public String deleteStock(@PathVariable("stockId") long stockId) {
		return stockService.deleteStock(stockId);
		
	}
	
	//delete all stocks
	//url already added on top
	@DeleteMapping()
	public String deleteAllStocks()
	{
		return stockService.deleteAllStocks();
	}
	
	// update using put
	//url already added on top /stocks
	@PutMapping("/{stockId}")
	public Stock updateStock(@PathVariable int stockId, @RequestBody Stock stock) {
		return stockService.updateStock(stockId, stock);
		
	}
}
