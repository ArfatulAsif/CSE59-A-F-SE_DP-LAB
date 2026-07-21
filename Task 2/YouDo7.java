
interface Clickable {
    void onClick(); 
}
class Button implements Clickable {
    public void onClick() {
        System.out.println("Button was clicked!");
    }
}
public class Main {
    public static void main (String[] args){
        Button myButton=new Button();
    myButton.onClick();
    }
    
}
