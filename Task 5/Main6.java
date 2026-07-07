
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


    public void handleHttpRequest() {
        System.out.println("Routing traffic to endpoint.");
    }
}

class DatabaseService implements DatabaseManager {


    public void executeSqlStatement() {
        System.out.println("Executing SQL Statement.");
    }
}

class DockerService implements ContainerOps {

    public void restartDockerContainer() {
        System.out.println("Restarting Docker Container.");
    }
}
public class Main6 {
    public static void main(String[] args) {

        HttpService controller = new WebController();
        controller.handleHttpRequest();

        DatabaseManager database = new DatabaseService();
        database.executeSqlStatement();

        ContainerOps docker = new DockerService();
        docker.restartDockerContainer();
    }
}
