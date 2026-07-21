class ConfigurationManager  {
    private static volatile ConfigurationManager instance ;
    
    private ConfigurationManager() {
        System.out.println("Reading heavy config file from disk... (Only happens once)");

    }
    
    public static ConfigurationManager getInstance(){
        if (instance == null){
            synchronized (ConfigurationManager.class) {
                if (instance == null){
                    instance = new ConfigurationManager ();
                }
            }
        }
        return instance;
    }
}

public class Main2 {
    public static void main (String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();

        System.out.println("Same instance is memory?" + (config1 == config2));
    }
}
