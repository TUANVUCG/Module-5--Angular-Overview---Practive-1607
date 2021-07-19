package com.codegym.service;

import com.codegym.model.Product;

public interface IProductService {
    Iterable<Product> getAll();
}
