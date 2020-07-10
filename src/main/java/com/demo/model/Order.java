package com.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	/** The id. */

	private long orderId;

	/** The name. */
	private int orderAmount;

	private String orderDate;
	
}
