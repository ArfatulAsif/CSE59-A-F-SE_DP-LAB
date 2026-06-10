class NumberChecker {
    
    
    public void check(int num) {
        
        if (num % 2 == 0 && num > 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}


class Main2 {
    public static void main(String[] args) {
       
        NumberChecker checker = new NumberChecker();
        
        
        checker.check(14);
    }
}
