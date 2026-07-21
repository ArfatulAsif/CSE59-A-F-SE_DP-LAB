
class printer{
    
    void printdata(String text){
        System.out.println("text:"+ text);
    }
    void printdata(int number){
        System.out.println("number:"+ number);
    }
}

public class Main{
    public static void main(String[] args){
        
        printer print = new printer();
        print.printdata("hlw diya");
        print.printdata(100);
    }
}
