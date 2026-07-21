interface HttpService {
    void handleHttpRequest();
}

interface DatabaseManager {
    void executeSqlStatement();
}

interface ContainerOps {
    void restartDockerContainer();
}

class WebController implements HttpService {
    @Override
    public void handleHttpRequest() {
        System.out.println("Routing traffic to endpoint.");
    }
}

public class BasicPrinter {
    public static void main(String[] args) {
        HttpService controller = new WebController();
        controller.handleHttpRequest();
    }
}
