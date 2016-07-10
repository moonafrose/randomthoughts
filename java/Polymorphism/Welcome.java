package greetings;

import printing.Machine;
import printing.Printer;

public class Welcome {
    public static void main(String[] args){
    
        Machine m1= new Machine(true);
        m1.TurnOn(); //Will call parent's turn on method
        
        /*Anything that is a machine can be referenced by machine variable*/
        Machine m2 = new Printer(true,"My Machine");
        m2.TurnOn(); //Will call printer's turn on method which is overriden in the child class
   
        //Hence based on the type we are assigning, it will call the method on runtime
    }
    
}
