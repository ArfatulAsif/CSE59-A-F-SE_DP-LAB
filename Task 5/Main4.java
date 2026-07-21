interface OptimizableModel{
     void quantize();
}


class ResNet18 implements OptimizableModel{
    public void quantize(){
        System.out.println("Applying int8 quantization for ResNet-18.");
    }
}

class MobileNet implements OptimizableModel{
    public void quantize(){
        System.out.println("Applying dynaimic quyantization");
    }
}

class InferenceEngine {
    public void runOptimization(OptimizableModel model) {
        model.quantize();
    }
}
public class main4 {
    public static void main(String[] args) {
        InferenceEngine engine = new InferenceEngine();
        OptimizableModel resnet = new ResNet18();
        OptimizableModel mobileNet = new MobileNet();

        engine.runOptimization(resnet);
        engine.runOptimization(mobileNet);
    }
}

