package printing;

public class Printer extends Machine //extends is used for inheritance
{
    private String modelNumber;
    public Printer(boolean isOn, String modelNumber)
    {
        super(isOn); //calls the superclass constructor and initializes it.
        this.modelNumber=modelNumber;
    }
    
    public void Print(int copies) 
    {
      while(copies>0)
      {
          System.out.println(this.modelNumber+" -- printing copy no "+copies);
          copies--;
      }
    }
    public void Print() //Method overloading : Same function name, same return type but different parameters
    {
        System.out.println(this.modelNumber+" is"+(isOn?" On":" Off"));
    }
    
    
}
