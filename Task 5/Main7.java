interface INetworkProtocol {
    void broadcastMessage (String msg);
}

class BluetoothMeshNetwork implements INetworkProtocol{
    @Override 
    public void broadcastMessage (String msg){
        System.out.println("Broadcasting via Bluetooth Mesh: "+ msg);
    }
}

class DisasterAlertSystem {
    private final INetworkProtocol network ;
    
    public DisasterAlertSystem(INetworkProtocol network){
        this.network = network;
    }
    
    public void triggerAlert(String AlertData){
        network.broadcastMessage(AlertData);
    }
}

public class BasicPrinter {
    public static void main (String[] args){
        INetworkProtocol bluetooth = new BluetoothMeshNetwork();
        DisasterAlertSystem System = new DisasterAlertSystem (bluetooth);
        System.triggerAlert("Cyclone Warning ");
    }
    
}
