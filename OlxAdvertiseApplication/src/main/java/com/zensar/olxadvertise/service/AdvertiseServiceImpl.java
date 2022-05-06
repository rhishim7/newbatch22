package com.zensar.olxadvertise.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.olxadvertise.entity.Advertise;
import com.zensar.olxadvertise.repository.AdvertiseRepository;

@Service
public class AdvertiseServiceImpl implements AdvertiseService {

	@Autowired
	private AdvertiseRepository advertiseRepository;
//	static List<Advertise> advertises = new ArrayList<>();
//	static {
//		advertises.add(new Advertise(1, "laptop", "54000", "Electronics Goods", "Intel Core 3 Sony Vaio", "anand",
//				"12/12/2022", "13/12/2022", "Open"));
//		advertises.add(new Advertise(2, "Computer", "59000", "Computer Goods", "Intel Core 9 Razor Gaming", "anand",
//				"12/12/202", "13/12/2021", "Open"));
//	}
	
	@Override
	public List<Advertise> getAllAdvertises() {
		return advertiseRepository.findAll();
	}

	@Override
	public Advertise createStock(Advertise advertise, String token) {
		if (token.equals("rm66633")) {
			advertiseRepository.save(advertise);
		} else {
			return null;
		}
		return advertise;
	}

	@Override
	public Advertise getAdvertise(int advertiseId) {
		Optional<Advertise> findById = advertiseRepository.findById(advertiseId);
		if(findById.isPresent()) {
			Advertise advertise = findById.get();
			return advertise;
			}
			else return null;
	}

	@Override
	public Advertise updateStock(int advertiseId, Advertise advertise) {
		Advertise availableAdvertise = getAdvertise(advertiseId);
		return advertiseRepository.save(advertise);
	}

	@Override
	public List<Advertise> getAllAdvertisesByUser(String token) {
		if(token.equals("rm66633"))
		{
			return advertiseRepository.findAll();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Advertise getSpecificAdvertise(int postId, String token) {
		if(token.equals("rm66633"))
		{
			Optional<Advertise> findById = advertiseRepository.findById(postId);
			if(findById.isPresent()) {
				Advertise advertise = findById.get();
				return advertise;
				}
				else return null;
		}
		return null;
	}

	@Override
	public boolean deleteSpecificAdvertise(int postId, String token) {
		if(token.equals("rm66633"))
		{
			advertiseRepository.deleteById(postId);
			return true;
		}
		return false;
	}

	@Override
	public Advertise filterBasedSearchAdvertise() {
//		String filterText = "open";
//		Optional<Advertise> findAny = advertises.stream().filter(criteria -> criteria.toString().toLowerCase().contains(filterText)).findAny();
//		if(findAny.isPresent())
//		{
//			return findAny.get();
//		}
//		else
//		{
//			return null;
//		}
		return null;
	}

	@Override
	public Advertise searchAdvertise() {
//		String searchText = "closed";
//		Optional<Advertise> findAny = advertises.stream().filter(criteria -> criteria.toString().toLowerCase().contains(searchText)).findAny();
//		if(findAny.isPresent())
//		{
//			return findAny.get();
//		}
//		else
//		{
//			return null;
//		}
		return null;
	}

	@Override
	public List<Advertise> getAllAdvertises(int postId2, String token) {
		
			return advertiseRepository.findAll();
		
	}

}
