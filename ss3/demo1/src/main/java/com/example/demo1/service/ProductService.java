package com.example.demo1.service;

import com.example.demo1.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    private static final Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "a", 10.0, "moi"));
        products.put(2, new Product(2, "b", 2.0 ,"cu"));
        products.put(3, new Product(3, "c", 10.0, "moi"));
        products.put(4, new Product(4, "d", 10.0, "cu"));
        products.put(5, new Product(5, "e", 10.0, "moi"));
        products.put(6, new Product(6, "f", 10.0, "moi"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
products.put(id,product);
    }

    @Override
    public void remove(int id) {
products.remove(id);
    }
}
