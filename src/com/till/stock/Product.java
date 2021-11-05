package com.till.stock;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    // свойства класса
    private BigDecimal purchasePrice; // цена заказа
    private BigDecimal salePrice; // цена продажи
    private double percent; // проценты
    // методы класса
    // устанавливаем цену заказа
    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
        this.calculatePercent();
        System.out.println("Цена закупки " + this.purchasePrice);
    }
    // устанавливаем цену продажи
    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
        this.calculatePercent();
        System.out.println("Цена продажи " + this.salePrice);
    }
    // расчитываем процент
    public void calculatePercent() {
        if(this.salePrice != null && this.purchasePrice != null)
        {
            this.percent = this.salePrice.divide(this.purchasePrice, 2, RoundingMode.CEILING).doubleValue() * 100 - 100;
        }
    }
    
    public void printPercent()
    {
        System.out.println(this.percent);
    }
    
    public Product(){
        this.purchasePrice = null;
        this.salePrice = null;
        this.percent = Double.NaN;
    }
}
