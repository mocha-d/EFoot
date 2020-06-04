package com.ssd.efoot.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ssd.efoot.domain.Product;

public interface ProductDao {

	List<Product> getProductListByCategory(String categoryId) throws DataAccessException;

	List<Product> searchProductList(String keywords) throws DataAccessException;

	Product getProduct(String productId) throws DataAccessException;

}
