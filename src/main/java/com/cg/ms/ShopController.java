package com.cg.ms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {
	
	private static final Shop shop = null;
	@Autowired
	private ShopService service;
	
	//Retrieval
	@GetMapping("/shop")
	public List<Shop> listAll(){
		return service.listAll(); 
	}
	
	//Retrieve By Id
	@GetMapping("/shop/{id}")
	public ResponseEntity <Shop> get(@PathVariable Integer id) {
		try {
			Shop shop = service.get(id);
			return new ResponseEntity<Shop>(shop,HttpStatus.OK);
		} 
		catch (Exception e) {
			return new ResponseEntity<Shop>(shop,HttpStatus.NOT_FOUND);
			
		}
						
	}
	
	//create
	@PostMapping("/shop")
			public void add(@RequestBody Shop shop) {
				service.save(shop);
			}
	//update
	@PutMapping("/shop/{id}")
	public ResponseEntity<?> update(@RequestBody Shop shop,@PathVariable Integer id){
		try {
			Shop existShop = service.get(id);
			service.save(shop);
			return new ResponseEntity <> (HttpStatus.OK);
		} 
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//delete
	@DeleteMapping("/shop/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}