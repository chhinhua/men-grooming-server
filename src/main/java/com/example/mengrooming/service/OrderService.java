package com.example.mengrooming.service;

import com.example.mengrooming.entity.Order;

public interface OrderService {
    Order addOrder(Order order, long userId);

    Order updateOrder(Order order, long id);
}
