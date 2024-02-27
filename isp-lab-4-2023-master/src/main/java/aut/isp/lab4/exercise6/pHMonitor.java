package aut.isp.lab4.exercise6;

import aut.isp.lab4.exercise5.Alarm;

public class pHMonitor {
    private float pH;
    private float pHLow;
    private float pHHigh;
    private boolean adjustpH;
    private boolean adjustedpH;
    private Alarm pHAlarm;
    public pHMonitor(float pH,float pHLow,float pHHigh,boolean adjustpH,boolean adjustedpH) {
        this.pH=pH;
        this.pHLow=pHLow;
        this.pHHigh=pHHigh;
        this.adjustpH=adjustpH;
        this.adjustedpH=adjustedpH;
    }
    public void updatepH(float newpH) {
        this.pH=newpH;
        if(this.pH<this.pHLow || this.pH>this.pHHigh) {
            this.pHAlarm.turnOn();
            this.adjustpH=true;
        }
        else {
            this.pHAlarm.turnOff();
            this.adjustpH=false;
        }
    }
    public boolean adjustpH() {
        return adjustpH;
    }
    public boolean adjustedpH() {
        return adjustedpH;
    }
    public void adjustpH(float newpH) {
        if(adjustpH) {
            this.pH=newpH;
            this.adjustedpH=true;
            this.pHAlarm.turnOff();
        }
    }

}
