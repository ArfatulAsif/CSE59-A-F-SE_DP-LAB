class ContestState {
    int[] scores = {85,90,95};


void PrintFirstScore() {
    System.out.println(scores[0]);
   }
}

public class Main {
    public static void main(String[] args) {
        ContestState contest = new ContestState();
        contest.PrintFirstScore();
    }
}
