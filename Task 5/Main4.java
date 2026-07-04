public class Main4 {
    public static void main(String[] args) {
        InferenceEngine engine = new InferenceEngine();

        
        OptimizableModel resnet = new ResNet18();
        engine.quantizeModel(resnet);

        
        OptimizableModel mobilenet = new MobileNet();
        engine.quantizeModel(mobilenet);
        
        
        OptimizableModel transformer = new OptimizableModel() {
            @Override
            public void quantize() {
                System.out.println("Applying float16 quantization for Transformer.");
            }
        };
        engine.quantizeModel(transformer);
    }
}

interface OptimizableModel {
    void quantize();
}


class ResNet18 implements OptimizableModel {
    @Override
    public void quantize() {
        System.out.println("Applying int8 quantization for ResNet-18.");
    }
}

class MobileNet implements OptimizableModel {
    @Override
    public void quantize() {
        System.out.println("Applying dynamic quantization for MobileNet.");
    }
}


class InferenceEngine {
    public void quantizeModel(OptimizableModel model) {
        if (model == null) {
            System.out.println("Error: No model provided.");
            return;
        }
        model.quantize();
    }
}



