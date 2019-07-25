package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IOrderDao;
import com.app.pojos.Cart;
import com.app.pojos.CartItem;
import com.app.pojos.Orders;

@Service
@Transactional
public class OrderServiceImp implements IOrderService{

	@Autowired
	private IOrderDao OrderDao;
	
	@Autowired
	private ICartService cartService;
	
	@Override
	public void addOrders(Orders order) {
		OrderDao.addOrder(order);
	
	}

	@Override
	public int getCustomerOrderGrandTotal(int cartId)
	{
		int grandTotal = 0;
		Cart cart = cartService.getCartById(cartId);
		List<CartItem> cartItems = cart.getCartItems();
		
		for(CartItem item: cartItems) {
			grandTotal += item.getTotalPrice();
			
		}
		return grandTotal;
	}
	

	public static int getOrdersTotal(int cartId) {
		// TODO Auto-generated method stub
		return 0;
	}
		
	}


