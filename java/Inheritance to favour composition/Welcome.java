package greetings;

import printing.IMachine;
import printing.Machine;
import printing.Printer;

public class Welcome {
    public static void main(String[] args){
    
        /*
        $. Is-a relationship can be converted to a has-a relationship
        $. Printer class will no longer inherit from Machine class, instead it will implement IMachine interface
        $. Since other printer classes will also use IMachine, handling TurnOn and TurnOff method for each of them is like
           duplicating code.
           So we'll delegate it to Machine class
        $. Rest of the things will fairly remain the same, and we can still achieve polymorphism with this.
        */
        IMachine machine = new Printer(true, "My Printer");
        machine.TurnOn();
        
        IMachine machine2 = new Machine(false);
        machine2.TurnOn();
    }
    
}
