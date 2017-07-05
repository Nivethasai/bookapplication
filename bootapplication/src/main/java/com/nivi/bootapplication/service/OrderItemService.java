package com.nivi.bootapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nivi.bootapplication.model.OrderItem;
import com.nivi.bootapplication.repository.OrderItemRepository;



@Service
public class OrderItemService {

	@Autowired
	private OrderItemRepository orderItemRepository;

	public void save(OrderItem orderItem) {
		orderItemRepository.save(orderItem);
	}

}