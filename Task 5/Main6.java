
interface HttpService {
    void handleHttpRequest();
}

interface DatabaseManager {
    void executeSqlStatement();
}

interface ContainerOps {
    void restartDockerContainer();
}

class webController implements HttpService {
    public void handleHttpRequest() {
        System.out.println("Routing traffic to endpoint.");
    }
}

class DataSerrvice implements DatabaseManager {
    public void executeSqlStatement() {
        System.out.println("Executing SQL query.");
    }
}

class DockerService implements ContainerOps {
    public void restartDockerContainer() {
        System.out.println("Restarting Docker container.");
    }
}
public class Main6 {
    public static void main(String[] args) {
        HttpService controller = new WebController();
        controller.handleHttpRequest();

        DatabaseManager db = new DatabaseService();
        db.executeSqlStatement();

        ContainerOps docker = new DockerService();
        docker.restartDockerContainer();

    }
}
