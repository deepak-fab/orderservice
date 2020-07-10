package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.model.Order;

@Service
public class OrderService {

	static List<Order> orderList = new ArrayList<Order>();
	static{
		orderList.add(new Order(1,650,"23-Jun-2020"));
		orderList.add(new Order(2,450,"15-Apr-2020"));
	}

	public List<Order> getOrderByUserId(Long userId) {
		return orderList;
	}

}
