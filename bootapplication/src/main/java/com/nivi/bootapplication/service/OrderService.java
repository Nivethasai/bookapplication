package com.nivi.bootapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nivi.bootapplication.model.Order;
import com.nivi.bootapplication.repository.OrderRepository;


@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public void save(Order order) {
		orderRepository.save(order);

	}

	public List<Order> findAllOrders() {
		return orderRepository.findByOrderByIdDesc();
	}

	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	public Order findOne(Long id) {
		return orderRepository.findOne(id);
	}

	public List<Order> findByUserIdOrderByIdDesc(Long userId) {
		return orderRepository.findByUserIdOrderByIdDesc(userId);
	}

}
