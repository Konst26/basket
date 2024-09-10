package com.ShopBasket.Demo.service;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class BasketService {

    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public void addItems(List<Integer> ids) {
        basket.addItems(ids);
    }

    public Collection<Integer> get() {
        return basket.getItems();
    }
}