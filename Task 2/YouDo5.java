class Printer {
    void printData(String text) {
         System.out.println("Printing text: " + text);
    }
    
    void printData(int number) {
        System.out.println("Printing number: " + number);
    }
}

public class Main {
    public static void main(String[] args){
        Printer myPrinter = new Printer();
        
        myPrinter.printData("Hello, java");
        
        myPrinter.printData(42);
    }
}
