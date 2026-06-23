
interface Printer {
    void printDocument ();
}

interface Scanner {
    void scanDocument ();
}

interface FaxMachine{
    void faxDocument();
}

class BasicPrinter implements Printer {
    @Override
    public void printDocument (){
        System.out.println ("Basic Printer : Printing...");
    }
}

class MultiFunctionCopier implements Printer, Scanner , FaxMachine{
    @Override 
    public void printDocument (){
        System.out.println ("MF Copier: Printing...");
    }
    
    @Override 
    public void scanDocument (){
        System.out.println ( "MF Copier : Scanning...");
    }
    
    @Override 
    public void faxDocument (){
        System.out.println ( "MF Copier : Faxing...");
    }
}

public class Main {
    public static void main ( String [] args ){
        Printer basic = new BasicPrinter ();
        basic.printDocument ();
        MultiFunctionCopier mfp = new MultiFunctionCopier ();
        mfp. printDocument ();
        mfp. scanDocument ();
        mfp. faxDocument ();
    }
}
