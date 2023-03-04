package com.nbcb.design.decorating;

public class Milk extends CondimentDecorator {

    private Beverage beverage;

    /**
     * constructor
     * ������Beverageʵ������Ҫ��Ϊ����չBeverage�Ĺ���
     * @param beverage
     */
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * ��ǿBeverage��getDescription()����
     * �������������ţ��
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + " add Milk ... ";
    }

    /**
     * ��ǿBeverage��cost()����
     * �������ţ�̣��۸���Ҫ��΢����һ��
     * @return
     */
    @Override
    public double cost() {
        return beverage.cost() + 0.25;
    }
}
