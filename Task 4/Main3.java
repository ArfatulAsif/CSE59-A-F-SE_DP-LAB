
interface Printer{
    void printDocument();
}

interface Scanner{
    void scanDocument();
}

interface FaxMachine{
    void faxDocument();
}

class BasicPrinter implements Printer{
    public void printDocument(){
        System.out.println("Basic Printer: Printing document...");
    }
}

class MultiFuctionCopier implements Printer, Scanner, FaxMachine{
    public void printDocument(){
        System.out.println("MultiFunction: Printing...");
    }

    public void scanDocument(){
        System.out.println("MultiFunction: Scanning...");
    }

    public void faxDocument(){
        System.out.println("MultiFunction: Faxing...");
    }
}

public class Main3{
    public static void main(String[] args){
        Printer basicPrinter = new BasicPrinter();

        basicPrinter.printDocument();

        System.out.println("---------------------------------");

        MultiFuctionCopier mfp = new MultiFuctionCopier();

        mfp.printDocument();
        mfp.scanDocument();
        mfp.faxDocument();
    }
}
