package com.order.management.orderitems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.order.management.orderitems.exception.OrderItemNotProcessException;
import com.order.management.orderitems.pojo.OrderItemsPOJO;
import com.order.management.orderitems.service.OrderItemsService;

@RestController
@RequestMapping("/orderitems")
public class OrderItemController {
	
	@Autowired
	OrderItemsService orderItemsService;
	
	@RequestMapping(value = "/items/save" , method = RequestMethod.POST)
	public ResponseEntity<Object> addItems(@RequestBody OrderItemsPOJO orderItemsPOJO) {
		
		boolean flag = orderItemsService.saveOrderItems(orderItemsPOJO);
		if(flag) {
			
			return new ResponseEntity<>("OrderItesms are process successfully", HttpStatus.OK);
		}else {
			throw new OrderItemNotProcessException();
		}
		
	}
	
	@RequestMapping(value = "/items/readproducts" , method = RequestMethod.GET)
	public String readProduct(@RequestParam("name") String name) {
		System.out.println("name -------------------"+name);
		String quantity = orderItemsService.returnOrderItems(name);
		
		return quantity;
	}
	

}
