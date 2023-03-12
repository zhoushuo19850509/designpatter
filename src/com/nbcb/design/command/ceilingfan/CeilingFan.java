package com.nbcb.design.command.ceilingfan;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private int speed;

    public CeilingFan() {
        speed = OFF;
    }

    public void high(){
        this.speed = HIGH;
        System.out.println("CeilingFan turns to high ...");
    }

    public void medium(){
        this.speed = MEDIUM;
        System.out.println("CeilingFan turns to medium ...");
    }

    public void low(){
        this.speed = LOW;
        System.out.println("CeilingFan turns to low ...");
    }

    public void off(){
        this.speed = OFF;
        System.out.println("CeilingFan is off ...");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * �����������Commandʵ�����е�undo()����
     * �Զ��������ϴη��ȵķ���
     * @param prevSpeed
     */
    public void undo(int prevSpeed){
        if(prevSpeed == HIGH){
            this.high();
        }else if(prevSpeed == MEDIUM){
            this.medium();
        }else if(prevSpeed == LOW){
            this.low();
        }else if(prevSpeed == OFF){
            this.off();
        }
    }
}
