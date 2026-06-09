
class NumberChecker{
    public void check(int num){
        if(num % 2 == 0 && num>10){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}


public class main2 {
    public static void main(String[] args) {
        NumberChecker checker = new NumberChecker();
        System.out.print("Testing with 14: ");
        checker.check(14);
    }
}
