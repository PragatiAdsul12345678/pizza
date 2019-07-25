package com.app.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.dao.ICartDao;
import com.app.pojos.Cart;
@Service
@Transactional
public class CartService implements ICartService {

	@Autowired
	private ICartDao cartDao;
	
	public Cart getCartById(int cartId) {
		
		return cartDao.getCartById(cartId);
	}

	public void update(Cart cart) {
		
		cartDao.update(cart);

	}

}
