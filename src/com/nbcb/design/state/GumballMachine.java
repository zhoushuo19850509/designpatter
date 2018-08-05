package com.nbcb.design.state;


/**
 * 首先了解一下Gumball machine的运行机制
 * 场景是：需要投币才能吐出球来。
 *
 * 这个类是最原始的：在每个动作中，
 * 都要先判断当前gumball machine的状态，然后选择相应的动作
 * 类似: if(state == SOLD_OUT){ ... } else if(){ ... }
 *
 * 总而言之，这个文件是面向动作:
 * 每次执行一个动作，都要判断当前的状态。
 * 根据不同的状态，作出不同的反应
 */
public class GumballMachine {

    final static int SOLD_OUT = 0;  // no gumball at all
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;   // gumball is available ,quarter is ready

    int state = SOLD_OUT;   // initial state : no gumball at all
    int count = 0;  // gumball的数量

    // constructor
    public GumballMachine(int count){
        this.count = count;
        state = NO_QUARTER;

    }


    // all operations below

    /**
     * 投币
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
     * 吐币
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
            System.out.println("Sorry ,you already turned the crank");  // 现在要吐币，已经太迟了，gumball 已经要出来了

        }

    }

    /**
     * 旋转把手按钮，吐出一个gumball
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
            dispense(); //开始处理吐gumball的事情了

        }

    }

    /**
     * 执行分配gumball的动作
     * 只处理SOLD状态的情况，其他状态都是非法的
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
