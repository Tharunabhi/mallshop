package com.cg.ms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ShopService {
	
	@Autowired
	private ShopRepository repository;
	
	public List<Shop> listAll(){
		return repository.findAll();
	}
	
	public Shop get(Integer id) {
		return repository.findById(id).get();
	}
	
	public void save(Shop shop) {
		repository.save(shop);
	}

	public void delete(Integer id)
	{
		repository.deleteById(id);
		
		
	}
}
