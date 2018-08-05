package com.nbcb.design.state;

/**
 * ���״̬��һ����ɫ״̬
 * һ����˵,��has quarter״̬�����ʵʩ��turn crack������
 * �Ǿ���sold״̬
 * ���ڶ���һ��״̬: winner state
 * �����״̬�£����ʵʩdispense()��������������Ļ������³�������
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
         * ������ô˵���ȳ������ͷ�һ����
         */
        gumbalMachineState.releaseBall();

        /**
         * ���ɵ��ǣ��ͷ�һ�����Ժ󣬸պ�û�и�������ˣ�̫������
         */
        if( gumbalMachineState.getCount() == 0){
            gumbalMachineState.setState(gumbalMachineState.getSoldOutState());
        }else{
            gumbalMachineState.releaseBall(); // ���ͷ�һ����
            if(gumbalMachineState.getCount() > 0 ){
                gumbalMachineState.setState(gumbalMachineState.getNoQuarterState());

            }else{
                System.out.println("sold out!!");
                gumbalMachineState.setState(gumbalMachineState.getSoldOutState());
            }
        }

    }
}
