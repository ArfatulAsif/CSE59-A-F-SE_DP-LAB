class ConfigurationManager {
    private static volatile ConfigurationManager instance;

    private ConfigurationManager() {
        System.out.println("Reading heavy configuration from disk....");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }
}

public class p2ex1 {
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();

        System.out.println("Same instance in memory? " + (config1 == config2));

    }
}
