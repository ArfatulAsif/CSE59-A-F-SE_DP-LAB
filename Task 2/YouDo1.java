class ContestStats{
    
    int[] scores = {85,90,95};
    public void printFirstScores(){
        System.out.println("The first scores is : " + scores [0] );
        
    }
    
}

public class main {
    public static void main(String[] args){
        ContestStats state = new ContestStats();
        state.printFirstScores();
    }
}
