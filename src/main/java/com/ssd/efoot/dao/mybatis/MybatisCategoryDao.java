package com.ssd.efoot.dao.mybatis;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.ssd.efoot.dao.CategoryDao;
import com.ssd.efoot.dao.mybatis.mapper.CategoryMapper;
import com.ssd.efoot.domain.Category;

@Repository
public class MybatisCategoryDao implements CategoryDao {
	@Autowired
	private CategoryMapper categoryMapper;
	
	public List<Category> getCategoryList() throws DataAccessException {
		return categoryMapper.getCategoryList();
	}

	public Category getCategory(String categoryId) throws DataAccessException {
		return categoryMapper.getCategory(categoryId);
	}
}
