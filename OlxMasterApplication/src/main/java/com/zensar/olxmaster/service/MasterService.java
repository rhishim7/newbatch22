package com.zensar.olxmaster.service;

import java.util.List;

import com.zensar.olxmaster.entity.Category;
import com.zensar.olxmaster.entity.Status;

public interface MasterService {
	public List<Category> getAllCategories();
	public List<Status> getAllStatuses();
}
