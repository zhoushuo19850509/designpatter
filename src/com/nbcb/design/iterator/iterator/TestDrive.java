package com.nbcb.design.iterator.iterator;

public class TestDrive {
    public static void main(String[] args) {
        DinnerMenu dinnerMenu = new DinnerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        Waitress waitress = new Waitress(dinnerMenu,pancakeHouseMenu);
        waitress.printMenu();

    }
}
