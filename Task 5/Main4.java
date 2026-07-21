interface QuantizationModel {
    void quantizeModel();
}
class ResNet18 implements QuantizationModel {
    @Override
    public void quantizeModel() {
        System.out.println("applying int18");
    }
}

class MobileNet implements QuantizationModel {
    @Override
    public void quantizeModel() {
        System.out.println("applying int8");
    }

}

class InterfaceEngine {
    public void applyQuantization(QuantizationModel model) {
        model.quantizeModel();
    }
}

public class Main4 {
    public static void main(String[] args) {
        InterfaceEngine engine = new InterfaceEngine();
        QuantizationModel rsNet = new ResNet18();
        QuantizationModel mobileNet = new MobileNet();

        engine.applyQuantization(rsNet);
        engine.applyQuantization(mobileNet);
    }
} 
