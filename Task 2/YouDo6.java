
public class Main{
    public static void main(String[] args){
        GameApplet game= new GameApplet();
        
        game.launch();
        game.play();
        
    }
}

class Applet {
    void launch() {
        System.out.println("Applet lauched");
    
    }
}

class GameApplet extends Applet {
    void play() {
        System.out.println("Playing game");
    }
}

