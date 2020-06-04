package com.ssd.efoot.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ssd.efoot.domain.Order;

public interface OrderDao {

  List<Order> getOrdersByUsername(String username) throws DataAccessException;

  Order getOrder(int orderId) throws DataAccessException;

  void insertOrder(Order order) throws DataAccessException;

}
