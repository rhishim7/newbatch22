package com.zensar.olxadvertise.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxadvertise.entity.Advertise;

@RestController
//@RequestMapping("/advertise")
public class AdvertiseController {

	static List<Advertise> advertises = new ArrayList<>();
	static {
		advertises.add(new Advertise(1, "laptop", "54000", "Electronics Goods", "Intel Core 3 Sony Vaio", "anand",
				"12/12/2022", "13/12/2022", "Open"));
	}

	@GetMapping("/advertise")
	public List<Advertise> getAllAdvertises() {
		return advertises;
	}

	// Posts new Advertise Excel sheet no. 7
	@PostMapping("/advertise")
	public Advertise createStock(@RequestBody Advertise advertise, @RequestHeader("auth-token") String token) {
		if (token.equals("rm66633")) {
			advertises.add(advertise);
		} else {
			return null;
		}
		return advertise;
	}

	// Here we are accessing specific stock id using URL
	// url already added on top /stocks
	@GetMapping("/advertise/{advertiseId}")
	public Advertise getAdvertise(@PathVariable long advertiseId) {
		for (Advertise advertise : advertises)
			if (advertise.getAdvertiseId() == advertiseId) {
				return advertise;
			}
		return null;
	}

	// Update existing adv-ertises Excel sheet no. 8
	@PutMapping("/advertise/{advertiseId}")
	public Advertise updateStock(@PathVariable int advertiseId, @RequestBody Advertise advertise) {
		Advertise availableAdvertise = getAdvertise(advertiseId);
		availableAdvertise.setAdvertiseTitle(advertise.getAdvertiseTitle());
		availableAdvertise.setAdvertisePrice(advertise.getAdvertisePrice());
		availableAdvertise.setAdvertiseCategory(advertise.getAdvertiseCategory());
		availableAdvertise.setStatus(advertise.getStatus());
		availableAdvertise.setAdvertiseDescription(advertise.getAdvertiseDescription());
		return availableAdvertise;
	}
	
	// Reads all advertisements posted by logged in user Excelsheet No. 9
	@GetMapping("/user/advertise")
	public List<Advertise> getAllAdvertisesByUser(@RequestHeader ("auth-token")String token)
	{
		if(token.equals("rm66633"))
		{
			return advertises;
		}
		else
		{
			return null;
		}
	}
	
	// Read specific advertisements posted by logged in user Excelsheet No.10
	@GetMapping("/user/advertise/{postId}")
	public Advertise getSpecificAdvertise(@PathVariable int postId,@RequestHeader("auth-token")String token)
	{
		if(token.equals("rm66633"))
		{
			for (Advertise advertise : advertises)
				if (advertise.getAdvertiseId() == postId) {
					return advertise;
				}
				else
				{
					return null;
				}
		}
		return null;
	}
	
	// Delete specific advertisements posted by logged in user ExcelSheet no.11
	@DeleteMapping("/user/advertise/{postId}")
	public boolean deleteSpecificAdvertise(@PathVariable int postId,@RequestHeader("auth-token") String token)
	{
		if(token.equals("rm66633"))
		{
			for (Advertise advertise : advertises)
				if (advertise.getAdvertiseId() == postId) {
					advertises.remove(advertise);
					return true;
				}
				else
				{
					return false;
				}
		}
		return false;
	}
	
	// Search advertisements based upon given filter criteria ExcelSheet no.12
	
	@GetMapping("/advertise/search/filtercriteria")
	public Advertise filterBasedSearchAdvertise()
	{
		String filterText = "g";
			for(Advertise element:advertises)
			{
				if(element.toString().contains(filterText))
				{
					return element;
				}
			}
			return null;
	}
	
	//Matches advertisements using the peovided 'searchText' within all fields of an advertise.
	//ExcelSheet no. 13
	@GetMapping("/advertise/search")
	public Advertise SearchAdvertise()
	{
		String searchText = "laptop";
			for(Advertise element:advertises)
			{
				if(element.toString().contains(searchText))
				{
					return element;
				}
			}
			return null;
	}
	
	//Return advertise details
	//ExcelSheet no. 14
	@GetMapping("/advertise/{id}")
	public List<Advertise> getAllAdvertises(@PathVariable int id,@RequestHeader ("auth-token")String token)
	{
		if(token.equals("rm66633"))
		{
			for (Advertise advertise1 : advertises)
				if (advertise1.getAdvertiseId() == id) {
					return advertises;
				}
				else
				{
					return null;
				}
		}
		return null;
	}
	
}
