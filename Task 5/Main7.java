interface INetworkProtocol {
    void broadcastMessage(String msg);
}

class BluetoothMeshNetwork implements INetworkProtocol {
    @Override
    public void broadcastMessage(String msg) {
        System.out.println("Broadcasting via Bluetooth Mesh: " + msg);
    }
}

class DisasterAlertSystem {
    private INetworkProtocol network;

    public DisasterAlertSystem(INetworkProtocol network) {
        this.network = network;
    }

    public void triggerAlert(String alertData) {
        network.broadcastMessage(alertData);
    }
}
