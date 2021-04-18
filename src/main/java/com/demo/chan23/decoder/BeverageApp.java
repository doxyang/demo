package com.demo.chan23.decoder;

/**
 * @author pandacoco
 * @description
 * @date 2021-04-18 23:58
 */
public class BeverageApp {
    public static void main(String[] args) {
        IBeverage beverage = new Milk(new Sugar(new BeverageIml("coffe")));
        System.out.println(beverage.getName());
    }
}
