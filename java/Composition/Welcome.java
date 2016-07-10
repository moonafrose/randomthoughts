package greetings;

import printing.Printer;

public class Welcome {
    public static void main(String[] args){
    Printer myprinter = new Printer(true,"My Printer");
    myprinter.Print(1);
    myprinter.loadPaper(1);
    myprinter.Print(2);
   // myprinter.Print();
    }
    
}
