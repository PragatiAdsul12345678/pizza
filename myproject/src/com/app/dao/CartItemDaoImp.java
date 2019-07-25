package com.app.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.app.pojos.*;

@Repository
@Transactional
public class CartItemDaoImp implements ICartItemDao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void addCartItem(CartItem cartItem) {
		sf.getCurrentSession().saveOrUpdate(cartItem);
	}

	@Override
	public void removeCartItem(CartItem cartItem) {
		 sf.getCurrentSession().delete(cartItem);

	}

	@Override
	public void removeAllCartItems(Cart cart) {
		
		List<CartItem> cartItems = cart.getCartItems();
		
		for(CartItem item: cartItems) {
			removeCartItem(item);
		}

	}

	public int getCartItemBypizza_id(int pizza_id) {
		return pizza_id;
		
	}
}




