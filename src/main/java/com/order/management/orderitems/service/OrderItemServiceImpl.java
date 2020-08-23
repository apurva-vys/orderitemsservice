package com.order.management.orderitems.service;

import java.util.List;

import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.management.orderitems.model.OrderItems;
import com.order.management.orderitems.model.OrderItemsRepository;
import com.order.management.orderitems.pojo.OrderItemsPOJO;


@Service
public class OrderItemServiceImpl implements OrderItemsService {

	@Autowired
	OrderItemsRepository orderItemsRepository;
	@Override
	public boolean saveOrderItems(OrderItemsPOJO orderItemsPOJO) {
		OrderItems orderItems = convertPojoToModel(orderItemsPOJO);
		OrderItems orderItems1 = orderItemsRepository.save(orderItems);
		System.out.println(orderItems1.getId());
		return true;
	}

	private OrderItems convertPojoToModel(OrderItemsPOJO orderItemsPOJO) {
		OrderItems orderItems = new OrderItems();
		orderItems.setProductcode(orderItemsPOJO.getProductCode());
		orderItems.setProductname(orderItemsPOJO.getProductName());
		orderItems.setQuntity(orderItemsPOJO.getQuantity());
		return orderItems;
	}

	@Override
	public String returnOrderItems(String productname) {
		Iterable<OrderItems> iterable = orderItemsRepository.findAll();
		
		
		List<OrderItems> orderList = IteratorUtils.toList(iterable.iterator()); 
		
		String quantity = convertModelToPJO(orderList,productname);
		
		return quantity;
	}

	private String convertModelToPJO(List<OrderItems> orderList,String productname) {
		String quantity = null;
		for(OrderItems orderItems : orderList) {
			
			if(productname.equals(orderItems.getProductname())) {
				
				quantity = orderItems.getQuntity();
				
			}
				
		}
		return quantity;
	}
	

}
