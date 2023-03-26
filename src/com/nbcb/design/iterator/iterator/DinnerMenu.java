package com.nbcb.design.iterator.iterator;

import java.util.ArrayList;
import java.util.List;

public class DinnerMenu implements Menu {


    private List<MenuItem> menuItems = null;

    /**
     * constructor
     */
    public DinnerMenu() {
        this.menuItems = new ArrayList<>();
        menuItems.add(
                new MenuItem("Beef","Beef from Japan",220,false));

        menuItems.add(
                new MenuItem("Fried chicken","Fried chicken from England",50,false));


        menuItems.add(
                new MenuItem("Soup","Soup made of mushroom",30,true));

        menuItems.add(
                new MenuItem("Sushi","Sushi from Japan",68,false));

    }

    @Override
    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
