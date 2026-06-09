
class Sensor{
    String name;
    int batteryLevel;

    public Sensor(String name,int initialBattery){
        this.name = name;
        this.batteryLevel = initialBattery;
    }

    public void charge(){
        this.batteryLevel = 100;
        System.out.println(name + " sensor fully charged");
    }
}


public class main4 {
    public static void main(String[] args) {
        Sensor proximitySensor = new Sensor("proximity", 45);

        proximitySensor.charge();

        System.out.println("Verified battery level: " + proximitySensor.batteryLevel + "%");
    }
}
