package com.demo.chan23.decoder;

/**
 * @author pandacoco
 * @description 饮料实现类
 * @date 2021-04-18 23:39
 */
public class BeverageIml implements IBeverage {
    private String name;

    public BeverageIml(String name) {
        this.name = name;
    }

    public BeverageIml() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void open() {

    }

    public void setName(String name) {
        this.name = name;
    }
}
