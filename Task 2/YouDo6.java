Class Applet {
    void launch(){
        System.out.println("Applet launched");
        
    }}
    
    class GameApplet extends Applet {
        void play(){
            System.out.println("Playing game);
        }
    }
    
    public class Main {
    public static void main(String[] args) {
        GameApplet myGame = new GameApplet();
        myGame.launch();
        myGame.play();
    }
}

