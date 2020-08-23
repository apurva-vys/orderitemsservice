package com.order.management.orderitems.service;

import com.order.management.orderitems.model.OrderItems;
import com.order.management.orderitems.pojo.OrderItemsPOJO;

public interface OrderItemsService {
	
	public boolean saveOrderItems(OrderItemsPOJO orderItemsPOJO);
	public String returnOrderItems(String name);

}
