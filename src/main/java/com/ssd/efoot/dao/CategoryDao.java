package com.ssd.efoot.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ssd.efoot.domain.Category;

public interface CategoryDao {

	List<Category> getCategoryList() throws DataAccessException;

	Category getCategory(String categoryId) throws DataAccessException;

}
