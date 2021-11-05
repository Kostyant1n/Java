
package com.till;

import java.math.BigDecimal;
import com.till.stock.Product;
import com.till.operations.PurchaseOrder;
import com.till.operations.SaleOrder;


public class Start {
    public static void main(String[] args) {
        Product enamel = new Product();
        Product varnish = new Product();
        Product pencil = new Product();               
        PurchaseOrder purchaseEnamel = new PurchaseOrder(enamel, new BigDecimal("50.25"));
        PurchaseOrder purchaseVarnish = new PurchaseOrder(varnish, new BigDecimal("25.02"));
        PurchaseOrder purchasePencil = new PurchaseOrder(pencil, new BigDecimal("12.04"));
        purchaseEnamel.execute();
        purchaseVarnish.execute();
        purchasePencil.execute();
        SaleOrder saleVarnish = new SaleOrder(varnish, new BigDecimal("35.02"));
        SaleOrder salePencil = new SaleOrder(pencil, new BigDecimal("15.04"));
        saleVarnish.execute();
        salePencil.execute();
        enamel.printPercent();
        varnish.printPercent();
        pencil.printPercent();
        
    }
}
