package com.till.operations;

import java.math.BigDecimal;
import com.till.stock.Product;


public class SaleOrder extends Order{    
    public BigDecimal price;
    
    public void execute()
    {
        product.setSalePrice(this.price);
        System.out.println("Продаем");
    }
    
    public SaleOrder(Product product, BigDecimal price)
    {
        this.product = product;
        this.price = price;
    }
}
