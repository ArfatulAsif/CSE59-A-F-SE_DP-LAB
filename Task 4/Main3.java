
public class Main3 {
    public static void main(String[] args) {
        System.out.println("--- Testing Basic Printer ---");
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.printDocument();

        System.out.println("\n--- Testing Multi-Function Copier ---");
        MultiFunctionCopier mfp = new MultiFunctionCopier();
        mfp.printDocument();
        mfp.scanDocument();
        mfp.faxDocument();
    }
}


interface Printer {
    void printDocument();
}

interface Scanner {
    void scanDocument();
}

interface FaxMachine {
    void faxDocument();
}


class BasicPrinter implements Printer {
    @Override
    public void printDocument() {
        System.out.println("Basic Printer: Printing...");
    }
}


class MultiFunctionCopier implements Printer, Scanner, FaxMachine {
    @Override
    public void printDocument() {
        System.out.println("MFP: Printing...");
    }

    @Override
    public void scanDocument() {
        System.out.println("MFP: Scanning...");
    }

    @Override
    public void faxDocument() {
        System.out.println("MFP: Faxing...");
    }
}

