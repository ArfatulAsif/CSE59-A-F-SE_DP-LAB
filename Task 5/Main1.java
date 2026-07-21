
public interface Printer {
    void printDocument();
}

public interface Scanner {
    void scanDocument();
}

public interface FaxMachine {
    void faxDocument();
}

public class BasicPrinter implements Printer {
    @Override
    public void printDocument() {
        System.out.println("Printing...");
    }
}

public class MultiFunctionCopier implements Printer, Scanner, FaxMachine {
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
