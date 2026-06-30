

class NumberChecker {
    public void check(int num) {
        if (num % 2 == 0 && num > 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NumberChecker nc = new NumberChecker();
        nc.check(14); 
    }
}
