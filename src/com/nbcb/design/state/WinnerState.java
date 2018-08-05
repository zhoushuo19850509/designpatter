package com.nbcb.design.state;

/**
 * 这个状态是一个特色状态
 * 一般来说,在has quarter状态，如果实施了turn crack动作，
 * 那就是sold状态
 * 现在多了一个状态: winner state
 * 在这个状态下，如果实施dispense()动作，如果球充足的话，会吐出两个球
 *
 */
public class WinnerState implements State{

    private GumbalMachineState gumbalMachineState;

    public WinnerState(GumbalMachineState gumbalMachineState){
        this.gumbalMachineState = gumbalMachineState;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait ,we are already giving you 2 gumballs!");
    }

    @Override
    public void rejectQuarter() {
        System.out.println("Sorry ,you already turned the crank");


    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice would not give you another ball!");

    }

    @Override
    public void dispense() {
        System.out.println("You are a winner! You get two balls for your quarter!");
        /**
         * 不管怎么说，先尝试着释放一个球
         */
        gumbalMachineState.releaseBall();

        /**
         * 不巧的是，释放一个球以后，刚好没有更多的球了，太不幸了
         */
        if( gumbalMachineState.getCount() == 0){
            gumbalMachineState.setState(gumbalMachineState.getSoldOutState());
        }else{
            gumbalMachineState.releaseBall(); // 再释放一个球！
            if(gumbalMachineState.getCount() > 0 ){
                gumbalMachineState.setState(gumbalMachineState.getNoQuarterState());

            }else{
                System.out.println("sold out!!");
                gumbalMachineState.setState(gumbalMachineState.getSoldOutState());
            }
        }

    }
}
