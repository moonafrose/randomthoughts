package printing;

public class Machine implements IMachine {
    protected boolean isOn;
    public Machine(boolean isOn)
    {
        this.isOn=isOn;
    }
    public void TurnOn()
    {
        this.isOn=true;
        System.out.println("Machine is on");
    }
    public void TurnOff()
    {
        this.isOn=false;
    }

    public boolean isOn() 
    {
        return isOn;
    }
}
