package com.nbcb.design.command.ceilingfan;

import com.nbcb.design.command.remotecontrol.Command;

public class CeilingFanHighCommand implements Command {

    private CeilingFan ceilingFan;
    private int previous;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        // 在调整风扇风速之前，先保存目前的风扇速录
        this.previous = ceilingFan.getSpeed();
        this.ceilingFan.high();
    }

    /**
     * 调用undo()方法，把风扇速度调整到原来的速度
     */
    @Override
    public void undo() {
        this.ceilingFan.undo(previous);
    }
}
