package com.order.management.orderitems.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface OrderItemsRepository  extends CrudRepository<OrderItems,Integer> {
	
	

}
