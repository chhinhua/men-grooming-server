package com.example.mengrooming.service;

import com.example.mengrooming.entity.Cart;
import com.example.mengrooming.entity.CartItem;

import java.util.List;

public interface CartService {
    Cart getCartByUserId(long userId);

    CartItem addCartItem(CartItem cartItem, long cardId);

    String clearCart(long id);
}
