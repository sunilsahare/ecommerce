package com.ecommerce.productservice.service;

import com.ecommerce.common.dto.ProductDto;
import com.ecommerce.productservice.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public ProductDto addProduct(ProductDto productDto);
    public ProductDto getProduct(Long productId);

    public Optional<Product> getProductByProductId(Long productId);
    public List<ProductDto> getProductsList();

    public Product getProductByUserId(Long userId, Long ProductId);

    public List<ProductDto> getProductListByUserId(Long userId);

    public ProductDto updateProduct(ProductDto productDto);

    public void deleteProduct(Long[] productId);

    public void deleteProductsByUserId(Long[] userId);


}
