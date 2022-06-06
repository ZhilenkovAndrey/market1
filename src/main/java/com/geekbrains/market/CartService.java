package com.geekbrains.market;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class CartService {
    private ProductService productService;
    private Cart cart;

    @Autowired
    public CartService(ProductService productService) {
        this.productService = productService;
    }

    @PostConstruct
    public void init() {
        this.cart = new Cart();
    }

    public Cart getCurrentCart() {
        return this.cart;
    }

    public void addToCart(int productId) {
        Product product = productService.find(productId).get();
        cart.add(product);
    }

    public void addToCart(String productTitle) {
        Product product = productService.find(productTitle).get();
        cart.add(product);
    }

    public void removeFromCart(String productTitle) {
        Product product = productService.find(productTitle).get();
        cart.remove(product);
    }

    public void removeFromCart(int productId) {
        Product product = productService.find(productId).get();
        cart.remove(product);
    }
}
