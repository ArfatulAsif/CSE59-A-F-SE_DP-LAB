class Sensor {
    String name;
    int batteryLevel;
    
    void charge() {
        batteryLevel = 100;
        System.out.println("Sensor fully charged");
    }
}

public class Main {
    public static void main(String[] args){
        Sensor mySensor = new Sensor();
        
        mySensor.name="Temperature Sensor";
        mySensor.batteryLevel=15;
         System.out.println(mySensor.name + "current battery: "+ mySensor.batteryLevel + "%");
         mySensor.charge();
         
          System.out.println("verify battery level: "+ mySensor.batteryLevel+ "%");
         
        
    }
}
