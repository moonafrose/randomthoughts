package printing;

public class Machine {
    protected boolean isOn;
    public Machine(boolean isOn)
    {
        this.isOn=isOn;
    }
    public void TurnOn()
    {
        this.isOn=true;
    }
    public void TurnOff()
    {
        this.isOn=false;
    }
}
