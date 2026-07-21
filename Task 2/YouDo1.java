class ContestStats{
    int[] scores = {85,90,95};
    public void printFirstScore(){
        System.out.println("The first score is: " + scores[0]);

    }
}

public class main1{
    public static void main(String[] args){
        ContestStats stats = new ContestStats();
        stats.printFirstScore();
    }
}
