public class Main7 {
    public static void main(String[] args) {
        String emergencyMsg = "Flash flood warning. Move to higher ground immediately.";

        
        System.out.println("--- Deploying System with Bluetooth Mesh ---");
        INetworkProtocol bluetooth = new BluetoothMeshNetwork();
        DisasterAlertSystem systemA = new DisasterAlertSystem(bluetooth);
        systemA.triggerEmergencyAlert(emergencyMsg);

        
        System.out.println("--- Deploying System with WiFi Direct ---");
        INetworkProtocol wifi = new WiFiDirectNetwork();
        DisasterAlertSystem systemB = new DisasterAlertSystem(wifi);
        systemB.triggerEmergencyAlert(emergencyMsg);
    }
}
interface INetworkProtocol {
    void broadcast(String message);
}


class BluetoothMeshNetwork implements INetworkProtocol {
    @Override
    public void broadcast(String message) {
        System.out.println("Bluetooth Mesh: Broadcasting alert packet over BLE advertisement channels...");
        System.out.println("Payload: " + message);
    }
}

class WiFiDirectNetwork implements INetworkProtocol {
    @Override
    public void broadcast(String message) {
        System.out.println("WiFi Direct: Broadcasting alert frame over P2P group facility...");
        System.out.println("Payload: " + message);
    }
}


class DisasterAlertSystem {
    private final INetworkProtocol network;

    
    public DisasterAlertSystem(INetworkProtocol network) {
        if (network == null) {
            throw new IllegalArgumentException("Network protocol cannot be null.");
        }
        this.network = network;
    }

    public void triggerEmergencyAlert(String alertDetails) {
        System.out.println("[CRITICAL ALERT TRIGGERED]");
        network.broadcast(alertDetails);
        System.out.println("------------------------------------------------");
    }
}




