//task4
class Sensor {
    String name;
    int batterylevel;
    
    void charge() {
        batterylevel = 100;
        System.out.println("Sensor fully chagred!");
        
    }
}

public class Main {
    public static void main(String[] args) {
        Sensor sensor =  new Sensor();
        sensor.charge();
        
        System.out.println("Battery Level: " + sensor.batterylevel);
    }
}
