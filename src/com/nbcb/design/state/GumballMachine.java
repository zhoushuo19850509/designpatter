package com.nbcb.design.state;


/**
 * �����˽�һ��Gumball machine�����л���
 * �����ǣ���ҪͶ�Ҳ����³�������
 *
 * ���������ԭʼ�ģ���ÿ�������У�
 * ��Ҫ���жϵ�ǰgumball machine��״̬��Ȼ��ѡ����Ӧ�Ķ���
 * ����: if(state == SOLD_OUT){ ... } else if(){ ... }
 *
 * �ܶ���֮������ļ���������:
 * ÿ��ִ��һ����������Ҫ�жϵ�ǰ��״̬��
 * ���ݲ�ͬ��״̬��������ͬ�ķ�Ӧ
 */
public class GumballMachine {

    final static int SOLD_OUT = 0;  // no gumball at all
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;   // gumball is available ,quarter is ready

    int state = SOLD_OUT;   // initial state : no gumball at all
    int count = 0;  // gumball������

    // constructor
    public GumballMachine(int count){
        this.count = count;
        state = NO_QUARTER;

    }


    // all operations below

    /**
     * Ͷ��
     */
    public void insertQuarter(){
        if(state == HAS_QUARTER){
            System.out.println("You can't insert another quarter");

        }else if(state == NO_QUARTER){
            state = HAS_QUARTER;
            System.out.println("You insert aquarter");

        }else if(state == SOLD_OUT){
            System.out.println("You can't insert a quarter, the gumball is sold out");

        }else if(state == SOLD){
            System.out.println("Please wait ,we are already giving you a gumball!");

        }

    }

    /**
     * �±�
     */
    public void rejectQuarter(){
        if(state == HAS_QUARTER){
            System.out.println("Quarter returned");
            state = NO_QUARTER;

        }else if(state == NO_QUARTER){
            System.out.println("You have not inserted a quarter");

        }else if(state == SOLD_OUT){
            System.out.println("You can't reject ,you have not inserted a quarter");

        }else if(state == SOLD){
            System.out.println("Sorry ,you already turned the crank");  // ����Ҫ�±ң��Ѿ�̫���ˣ�gumball �Ѿ�Ҫ������

        }

    }

    /**
     * ��ת���ְ�ť���³�һ��gumball
     */
    public void turnCrank(){
        if(state == SOLD){
            System.out.println("Turning twice would not give you another ball!");

        }else if(state == NO_QUARTER){
            System.out.println("you turned but there's no quarter");

        }else if(state == SOLD_OUT){
            System.out.println("you turned but there's no gumballs");

        }else if(state == HAS_QUARTER){
            System.out.println("you turned!");
            state = SOLD;
            dispense(); //��ʼ������gumball��������

        }

    }

    /**
     * ִ�з���gumball�Ķ���
     * ֻ����SOLD״̬�����������״̬���ǷǷ���
     */
    public void dispense(){
        if(state == SOLD){
            System.out.println("A gumball comes rolling out of the slot!");

            count = count - 1;
            if(count == 0){
                System.out.println("Out of gumballs!!");
                state = SOLD_OUT;
            }else{
                state = NO_QUARTER;
            }

        }else if(state == NO_QUARTER){
            System.out.println("you need to pay first!");

        }else if(state == SOLD_OUT){
            System.out.println("No gumball dispensed");

        }else if(state == HAS_QUARTER){
            System.out.println("No gumball dispensed");

        }

    }


}
