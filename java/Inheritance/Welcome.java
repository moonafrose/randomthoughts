package greetings;

import printing.Printer;

public class Welcome {
    public static void main(String[] args){
    Printer myprinter = new Printer(true,"My Printer");
    myprinter.Print();
    myprinter.TurnOff();
    myprinter.Print();
    
    Printer yourprinter = new Printer(false,"Your Printer");
    yourprinter.Print();
    yourprinter.TurnOn();
    yourprinter.Print();
    }
    
}
