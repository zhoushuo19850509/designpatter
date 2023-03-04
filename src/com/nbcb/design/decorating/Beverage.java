package com.nbcb.design.decorating;

public abstract class Beverage {

    String description = "Unknown Beverage  ...";

    public String getDescription() {
        return description;
    }

    // 抽象方法，需要子类去实现
    public abstract double cost();

    /**
     * 打印Beverage的description字段
     * 这里有一个特别需要注意的地方，就是打印description字段的时候，
     * 千万不能直接打印当前Beverage对象的description属性
     * 而是应该调用当前Beverage对象的getDescription()方法获取description属性
     *
     * 那是因为经过层层修饰之后，最后那个修饰实体类，
     * 比如Mocha对象，虽然包含一个Beverage对象
     * 但是Mocha对象中的description还是他的父类(Beverage)中的默认description字段(Unknown Beverage)
     *
     * 这个其实暴露出修饰模式的一个问题，就是经过层层修饰之后，
     * 修饰类虽然看起来是基础父组件类Beverage，但其实已经是修饰类了
     *
     * 比如以下代码，
     * beverage3虽然看起来是经过Milk修饰的Beverage对象，
     * 但是beverage3中的属性和原来HouseBlend对象已经不一样了
     * 因为经过修饰后，beverage3已经是Milk对象，而不是HouseBlend对象了
     *
     * Beverage beverage3 = new HouseBlend();
     * beverage3 = new Milk(beverage3);
     *
     * 在新的修饰对象中，我们只能调用那些需要修饰的方法，
     * 比如这个例子中的getDescription()方法/cost()方法，
     * 因为这些方法是针对被修饰的对象(HouseBlend),经过特殊处理的
     * 其他未精修饰的方法，如果未经正确处理可能会有不可预知的问题
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
