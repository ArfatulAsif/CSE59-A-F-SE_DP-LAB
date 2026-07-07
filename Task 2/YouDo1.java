class ContestStats {
    
    int[] scores = {85, 90, 95};

    
    public void printFirstScore() {
        System.out.println("First score: " + scores[0]);
    }
}


 class Main1 {
    public static void main(String[] args) {
        
        ContestStats stats = new ContestStats();

        
        stats.printFirstScore();
    }
}

