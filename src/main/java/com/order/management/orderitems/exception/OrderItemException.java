package com.order.management.orderitems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class OrderItemException {
	
	@ExceptionHandler(value = OrderItemNotProcessException.class)
	   public ResponseEntity<Object> exception(OrderItemNotProcessException exception) {
	      return new ResponseEntity<>("OrderItems not process", HttpStatus.BAD_REQUEST);
	   }

}
