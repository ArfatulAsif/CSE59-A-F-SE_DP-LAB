public class ContestStats {
    int[] scores = {85, 90, 95};
    
    public void printFirstScore() {
        System.out.println(scores[0]);
    }
          
    
}

public class Main {
    public static void main(String[] args){
        ContestStats cs = new ContestStats();
        cs.printFirstScore();
    }
}
