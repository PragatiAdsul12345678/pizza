package com.app.service;

import com.app.pojos.Orders;

public interface IOrderService
{
public void addOrders(Orders order);
	
public int getCustomerOrderGrandTotal(int cartId);

}
