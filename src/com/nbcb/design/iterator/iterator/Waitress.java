package com.nbcb.design.iterator.iterator;

public class Waitress {


    private DinnerMenu dinnerMenu = null;
    private PancakeHouseMenu pancakeHouse = null;

    public Waitress(DinnerMenu dinnerMenu, PancakeHouseMenu pancakeHouse) {
        this.dinnerMenu = dinnerMenu;
        this.pancakeHouse = pancakeHouse;
    }

    public void printMenu(){
        Iterator dinnerMenuIterator = dinnerMenu.createIterator();
        Iterator pancakeHouseIterator = pancakeHouse.createIterator();
        System.out.println("Waitress start print dinner Menus ...");
        printMenu(dinnerMenuIterator);
        System.out.println("Waitress start print pancakeHouse Menus ...");
        printMenu(pancakeHouseIterator);
    }


    public void printMenu(Iterator menuIterator){
        while(menuIterator.hasNext()){
            System.out.println(menuIterator.next());
        }
    }


}
