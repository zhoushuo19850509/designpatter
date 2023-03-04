package com.nbcb.design.decorating;

public abstract class Beverage {

    String description = "Unknown Beverage  ...";

    public String getDescription() {
        return description;
    }

    // ���󷽷�����Ҫ����ȥʵ��
    public abstract double cost();

    /**
     * ��ӡBeverage��description�ֶ�
     * ������һ���ر���Ҫע��ĵط������Ǵ�ӡdescription�ֶε�ʱ��
     * ǧ����ֱ�Ӵ�ӡ��ǰBeverage�����description����
     * ����Ӧ�õ��õ�ǰBeverage�����getDescription()������ȡdescription����
     *
     * ������Ϊ�����������֮������Ǹ�����ʵ���࣬
     * ����Mocha������Ȼ����һ��Beverage����
     * ����Mocha�����е�description�������ĸ���(Beverage)�е�Ĭ��description�ֶ�(Unknown Beverage)
     *
     * �����ʵ��¶������ģʽ��һ�����⣬���Ǿ����������֮��
     * ��������Ȼ�������ǻ����������Beverage������ʵ�Ѿ�����������
     *
     * �������´��룬
     * beverage3��Ȼ�������Ǿ���Milk���ε�Beverage����
     * ����beverage3�е����Ժ�ԭ��HouseBlend�����Ѿ���һ����
     * ��Ϊ�������κ�beverage3�Ѿ���Milk���󣬶�����HouseBlend������
     *
     * Beverage beverage3 = new HouseBlend();
     * beverage3 = new Milk(beverage3);
     *
     * ���µ����ζ����У�����ֻ�ܵ�����Щ��Ҫ���εķ�����
     * ������������е�getDescription()����/cost()������
     * ��Ϊ��Щ��������Ա����εĶ���(HouseBlend),�������⴦���
     * ����δ�����εķ��������δ����ȷ������ܻ��в���Ԥ֪������
     * @return
     */
    @Override
    public String toString() {
        return "Beverage{" +
                " description='" + getDescription() + '\'' +
                " cost='" + cost() + '\'' +
                '}';
    }
}
