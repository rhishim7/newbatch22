package com.zensar.olxmaster.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxmaster.entity.Category;
import com.zensar.olxmaster.entity.Status;
import com.zensar.olxmaster.service.MasterService;

@RestController
@RequestMapping("/advertise")
public class MasterController {

	@Autowired
	private MasterService masterService;
	
	
	// Returns all categories of advertisements
	@GetMapping(value="/category",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<Category> getAllCategories()
	{
		return masterService.getAllCategories();
	}
	@GetMapping(value="/status",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<Status> getAllStatuses()
	{
		return masterService.getAllStatuses();
	}
	
	
}
