package com.nbcb.design.iterator.iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements Menu {
    private List<MenuItem> menuItems = null;


    /**
     * constructor
     */
    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();
        menuItems.add(
                new MenuItem("Blueberry pancake","pancake made of fresh pancake",36,true));

        menuItems.add(
                new MenuItem("Shandong pancake","pancake of shandong style",15,false));

        menuItems.add(
                new MenuItem("Egg pancake","pancake made of eggs and flour",10,true));

        menuItems.add(
                new MenuItem("Fruit pancake","pancake made of fresh pineapple",50,true));
    }

    @Override
    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
