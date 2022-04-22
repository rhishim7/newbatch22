package com.zensar.olxmaster.controllers;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxmaster.entity.*;

@RestController
@RequestMapping("/advertise")
public class AdvertiseController {

	static List<Category> category = new ArrayList<>();
	static List<Status> status = new ArrayList<>();
	static {
		category.add(new Category(1, "Furniture"));
		category.add(new Category(2, "Cars"));
		category.add(new Category(3, "Mobile Phones"));
		category.add(new Category(4, "Real Estate"));
		category.add(new Category(5, "Sports"));
		status.add(new Status(11, "Open"));
		status.add(new Status(12, "Open"));
		status.add(new Status(13, "Closed"));
		status.add(new Status(14, "Open"));
		status.add(new Status(15, "Closed"));
	}
	
	// Returns all categories of advertisements
	@GetMapping("/category")
	public List<Category> getAllCategories()
	{
		return category;
	}
	@GetMapping("/status")
	public List<Status> getAllStatuses()
	{
		return status;
	}
	
	
}