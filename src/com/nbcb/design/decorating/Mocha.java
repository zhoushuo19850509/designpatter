package com.nbcb.design.decorating;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    /**
     * constructor
     * ������Beverageʵ������Ҫ��Ϊ����չBeverage�Ĺ���
     * @param beverage
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * ��ǿBeverage��getDescription()����
     * �������������Ħ��
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + " add Mocha ... ";
    }

    /**
     * ��ǿBeverage��cost()����
     * �������Ħ�����۸���Ҫ��΢����һ��
     * @return
     */
    @Override
    public double cost() {
        return beverage.cost() + 0.3;
    }
}
