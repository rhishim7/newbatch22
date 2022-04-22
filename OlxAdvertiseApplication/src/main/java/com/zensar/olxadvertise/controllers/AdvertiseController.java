package com.zensar.olxadvertise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxadvertise.entity.Advertise;
import com.zensar.olxadvertise.service.AdvertiseService;

@RestController
//@RequestMapping("/advertise")
public class AdvertiseController {

	@Autowired
	private AdvertiseService advertiseService;

	@GetMapping(value="/advertise",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<Advertise> getAllAdvertises() {
		return advertiseService.getAllAdvertises();
	}

	// Posts new Advertise Excel sheet no. 7
	@PostMapping(value="/advertise",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Advertise createStock(@RequestBody Advertise advertise, @RequestHeader("auth-token") String token) {
		
		return advertiseService.createStock(advertise, token);

	}

	// Here we are accessing specific stock id using URL
	// url already added on top /stocks
	@GetMapping(value="/advertise/{advertiseId}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Advertise getAdvertise(@PathVariable long advertiseId) {
		return advertiseService.getAdvertise(advertiseId);
	}

	// Update existing adv-ertises Excel sheet no. 8
	@PutMapping(value="/advertise/{advertiseId}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Advertise updateStock(@PathVariable int advertiseId, @RequestBody Advertise advertise) {
		return advertiseService.updateStock(advertiseId, advertise);
	}
	
	// Reads all advertisements posted by logged in user Excelsheet No. 9
	@GetMapping(value="/user/advertise",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<Advertise> getAllAdvertisesByUser(@RequestHeader ("auth-token")String token)
	{
		return advertiseService.getAllAdvertises();
	}
	
	// Read specific advertisements posted by logged in user Excelsheet No.10
	@GetMapping(value="/user/advertise/{postId}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Advertise getSpecificAdvertise(@PathVariable int postId,@RequestHeader("auth-token")String token)
	{
		return advertiseService.getSpecificAdvertise(postId, token);
	}
	
	// Delete specific advertisements posted by logged in user ExcelSheet no.11
	@DeleteMapping("/user/advertise/{postId}")
	public boolean deleteSpecificAdvertise(@PathVariable int postId,@RequestHeader("auth-token") String token)
	{
		return advertiseService.deleteSpecificAdvertise(postId, token);
	}
	
	// Search advertisements based upon given filter criteria ExcelSheet no.12
	
//	@GetMapping("/advertise/search/filtercriteria")
//	public Advertise filterBasedSearchAdvertise()
//	{
//		String filterText = "g";
//			for(Advertise element:advertises)
//			{
//				if(element.toString().contains(filterText))
//				{
//					return element;
//				}
//			}
//			return null;
//	}
	
	// Search advertisements based upon given filter criteria ExcelSheet no.12
	
	@GetMapping(value="/advertise/search/filtercriteria",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Advertise filterBasedSearchAdvertise()
	{
		return advertiseService.filterBasedSearchAdvertise();
	}
	
	//Matches advertisements using the peovided 'searchText' within all fields of an advertise.
	//ExcelSheet no. 13
	@GetMapping(value="/advertise/search",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Advertise searchAdvertise()
	{
		return advertiseService.searchAdvertise();
	}
	
	//Return advertise details
	//ExcelSheet no. 14
	@GetMapping("/advertise/{postId2}")
	public List<Advertise> getAllAdvertises(@PathVariable int postId2,@RequestHeader ("auth-token")String token)
	{
		return advertiseService.getAllAdvertises();
	}
}
