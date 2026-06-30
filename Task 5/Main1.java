interface Printer {
    void printDocument();
}

interface Scanner {
    void scanDocument();
}

interface FaxMachine {
    void faxDocument();
}

// Multi-function device implements all capabilities
class MultiFunctionCopier implements Printer, Scanner, FaxMachine {

    @Override
    public void printDocument() {
        System.out.println("Printing...");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning...");
    }

    @Override
    public void faxDocument() {
        System.out.println("Faxing...");
    }
}

// Basic printer only implements what it actually supports
class BasicPrinter implements Printer {

    @Override
    public void printDocument() {
        System.out.println("Printing...");
    }
}

public class Main {

    public static void main(String[] args) {

        Printer printer = new BasicPrinter();
        printer.printDocument();

        MultiFunctionCopier mfc = new MultiFunctionCopier();
        mfc.printDocument();
        mfc.scanDocument();
        mfc.faxDocument();
    }
}
