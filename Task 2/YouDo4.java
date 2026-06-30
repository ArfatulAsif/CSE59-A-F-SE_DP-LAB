
class Sensor {
    String name;
    int batteryLevel;
    
    
    Sensor(String name, int batteryLevel) {
        this.name = name;
        this.batteryLevel = batteryLevel;
    }
    
    void charge() {
        batteryLevel = 100;
        System.out.println("Sensor fully charged");
    }
}

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor("Temperature Sensor", 45);
        
        sensor.charge();
        
        System.out.println("Battery Level: " + sensor.batteryLevel + "%");
    }
}
