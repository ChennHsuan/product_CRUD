package com.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;			//呼叫DAO介面來使用繼承的方法
	
	public List<Product> listAll(){			//取得全部資料，多筆故回傳list
		return repo.findAll();
	}
	public Product save(Product product) {		//儲存，不用回傳
		return repo.save(product);
	}
	public Product get(Long id) {			//單筆查詢，回傳物件類別
		return repo.findById(id).get();
	}
	public void delete(Long id) {			//刪除一筆，不回傳
		repo.deleteById(id);
	}
	
}
