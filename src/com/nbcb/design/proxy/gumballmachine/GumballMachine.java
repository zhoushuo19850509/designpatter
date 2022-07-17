package com.nbcb.design.proxy.gumballmachine;

/**
 * GumballMachine
 */
public class GumballMachine {

    private String location;
    private int count;
    private String status;

    public GumballMachine(String location, int count) {
        this.location = location;
        this.count = count;
        this.status = MachineState.STATUS_ON;
    }

    /**
     * Getter/Setter
     * @return
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
