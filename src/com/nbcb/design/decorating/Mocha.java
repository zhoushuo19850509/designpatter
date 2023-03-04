package com.nbcb.design.decorating;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    /**
     * constructor
     * 包含了Beverage实例，主要是为了扩展Beverage的功能
     * @param beverage
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 增强Beverage的getDescription()方法
     * 添加描述：加了摩卡
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + " add Mocha ... ";
    }

    /**
     * 增强Beverage的cost()方法
     * 如果加了摩卡，价格需要稍微调整一下
     * @return
     */
    @Override
    public double cost() {
        return beverage.cost() + 0.3;
    }
}
