package com.app.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.dao.ICartItemDao;
import com.app.pojos.*;

@Service
public class CartItemService implements ICartItemService {

	@Autowired
	private ICartItemDao cartItemDao;
	
	public void addCartItem(CartItem cartItem) {
		
		cartItemDao.addCartItem(cartItem);

	}

	public void removeCartItem(CartItem cartItem) {
		
		cartItemDao.removeCartItem(cartItem);

	}

	public void removeAllCartItems(Cart cart) {
		
		cartItemDao.removeAllCartItems(cart);

	}

	@Override
	public int getCartItemByPizza_id(int pizza_id) {
		// TODO Auto-generated method stub
		return cartItemDao.getCartItemBypizza_id(pizza_id);
	}

	

}
