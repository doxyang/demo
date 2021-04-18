package com.demo.chan23.decoder;

/**
 * @author pandacoco
 * @description 牛奶装饰器
 * @date 2021-04-18 23:51
 */
public class Milk extends BeverageDecoder {

    public Milk(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return beverage.getName() + " add milk ";
    }

/* 派生自抽象装饰器 则不需要实现所有接口方法 */
//    @Override
//    public void open() {
//
//    }
}
