package com.zensar.olxmaster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.olxmaster.entity.Category;
import com.zensar.olxmaster.entity.Status;
import com.zensar.olxmaster.repository.MasterCategoryRepository;
import com.zensar.olxmaster.repository.MasterStatusRepository;

@Service
public class MasterServiceImpl implements MasterService {
	
	@Autowired
	private MasterCategoryRepository masterCategoryRepository;
	private MasterStatusRepository masterStatusRepository;

//	static List<Category> category = new ArrayList<>();
//	static List<Status> status = new ArrayList<>();
//	static {
//		category.add(new Category(1, "Furniture"));
//		category.add(new Category(2, "Cars"));
//		category.add(new Category(3, "Mobile Phones"));
//		category.add(new Category(4, "Real Estate"));
//		category.add(new Category(5, "Sports"));
//		status.add(new Status(11, "Open"));
//		status.add(new Status(12, "Open"));
//		status.add(new Status(13, "Closed"));
//		status.add(new Status(14, "Open"));
//		status.add(new Status(15, "Closed"));
//	}
	
	
	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return masterCategoryRepository.findAll();
	}

	@Override
	public List<Status> getAllStatuses() {
		// TODO Auto-generated method stub
		return masterStatusRepository.findAll();
	}

}
