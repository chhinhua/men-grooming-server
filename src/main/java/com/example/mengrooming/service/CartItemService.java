package com.example.mengrooming.service;

import com.example.mengrooming.entity.CartItem;

public interface CartItemService {
    CartItem updateCartItem(CartItem cartItem, long id);

    String deleteCartItem(long id);
}
