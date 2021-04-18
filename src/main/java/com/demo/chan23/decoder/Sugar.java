package com.demo.chan23.decoder;

/**
 * @author pandacoco
 * @description 糖装饰器
 * @date 2021-04-18 23:54
 */
public class Sugar implements IBeverage {
    IBeverage beverage;

    public Sugar(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getName() {
        return beverage.getName() + " add sugar ";
    }

    @Override
    public void open() {

    }
}
