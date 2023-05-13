package com.example.mengrooming.service.impl;

import com.example.mengrooming.entity.Cart;
import com.example.mengrooming.entity.CartItem;
import com.example.mengrooming.service.CartService;
import org.springframework.stereotype.Service;

/**
 * @author Chhin_Hua - 13/05
 **/

@Service
public class CartServiceImpl implements CartService {
    @Override
    public Cart getCartByUserId(long userId) {
        return null;
    }

    @Override
    public CartItem addCartItem(CartItem cartItem, long cardId) {
        return null;
    }

    @Override
    public String clearCart(long id) {
        return null;
    }
}
