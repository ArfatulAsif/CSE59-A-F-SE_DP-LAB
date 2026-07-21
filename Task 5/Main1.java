interface Printer {
    void printDocument();
}

interface Scanner {
    void scanDocument();
}

interface Fax {
    void faxDocument();
}

class MultifunctionCopyer implements Printer, Scanner, Fax {
    @Override
    public void printDocument() {
        System.out.println("Prining...");

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

class BasicPrinter implements Printer {

    @Override
    public void printDocument() {
        System.out.println("Printing...");
    }
}


public class main1 {
    public static void main(String[] args) {

        System.out.println("Multifunction Copyer");
        MultifunctionCopyer copyer = new MultifunctionCopyer();
        copyer.printDocument();
        copyer.scanDocument();
        copyer.faxDocument();

        System.out.println();

        System.out.println("Basic Printer");
        BasicPrinter printer = new BasicPrinter();
        printer.printDocument();
    }
}
