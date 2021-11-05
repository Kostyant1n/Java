
package com.till.operations;

import java.math.BigDecimal;
import com.till.stock.Product;


public class PurchaseOrder extends Order{
    public BigDecimal price;
    
    public void execute()
    {
        product.setPurchasePrice(this.price);
    }
    
    public PurchaseOrder(Product product, BigDecimal price)
    {
        this.product = product;
        this.price = price;
    }
}
