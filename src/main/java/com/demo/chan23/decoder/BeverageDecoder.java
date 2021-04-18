package com.demo.chan23.decoder;

/**
 * @author pandacoco
 * @description 装饰抽象类 抽象装饰器器类的存在简化了真实装饰器类的写法。
 * 只强化需要强化的方法
 * 如果装饰器直接派生自上层接口 则必须实现所有方法，如果实际不需要，则多余实现
 * 应该派生自抽象装饰器
 * @date 2021-04-18 23:43
 */
public abstract class BeverageDecoder implements IBeverage{
    IBeverage beverage;

    public BeverageDecoder(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getName() {
        return beverage.getName();
    }

    @Override
    public void open() {

    }
}
