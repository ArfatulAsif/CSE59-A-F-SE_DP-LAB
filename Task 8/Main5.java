
class ModelWeightsCache {
    private static volatile ModelWeightsCache instance;

    private ModelWeightsCache() {
        System.out.println("Loading 2GB model weights into memory... (Cached successfully)");
    }

public static ModelWeightsCache getInstances() {
    if(instance == null) {
        synchronized (ModelWeightsCache.class){
            if(instance == null) {
                        instance = new ModelWeightsCache();
                    }
                }
            }
            return instances;
        }
        public void predict(String dataSample) {
            System.out.println("Running inference on: " + dataSample);
        }
    }
 
public class Main5 {
    public static void main(String[] args){
        ModelWeightsCache cache1 = ModelWeightsCache.getInstances();
        cache1.predict("image_02.png");
    }
}
