class Sensor{
    String name;
    int batteryLevel;
    
    public void charge(){
        batteryLevel= 100;
        System.out.println("Sensor fully charged");
        
    }
    
  
}

public class Main {
    public static void main (String [] args){
        Sensor mySensor = new Sensor ();
        mySensor.name = "Temperature Sensor";
        mySensor.charge();
        System.out.println("New battery level:" + mySensor.batteryLevel);
    }
}
