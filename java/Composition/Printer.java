package printing;

public class Printer extends Machine //extends is used for inheritance
{
    private String modelNumber;
    private PaperTray paperTray = new PaperTray(); // Papertray is specific to a printer and not to a machine, hence printer
                                                   // is composed of this attribute.
    public Printer(boolean isOn, String modelNumber)
    {
        super(isOn); //calls the superclass constructor and initializes it.
        this.modelNumber=modelNumber;
    }
    
    public void Print(int copies) 
    {
      while(copies>0 && !paperTray.isEmpty())
      {
          System.out.println(this.modelNumber+" -- printing copy no "+copies);
          copies--;
          paperTray.usePaper();
      }
      if(paperTray.isEmpty())
      {
          System.out.println("Load more papers to the tray");
      }
    }
    public void Print() //Method overloading : Same function name, same return type but different parameters
    {
        System.out.println(this.modelNumber+" is"+(isOn?" On":" Off"));
    }
    public void loadPaper(int count)
    {
        paperTray.addPaper(count);
        System.out.println("Loaded "+count+" paper successfully");
    }
    
    
}
