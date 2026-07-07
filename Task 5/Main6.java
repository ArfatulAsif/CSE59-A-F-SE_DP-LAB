public class Main6 {
    public static void main(String[] args) {
        System.out.println("--- Booting Infrastructure Services --- \n");

        
        HttpService webService = new WebController();
        DatabaseManager dbService = new SqlDatabaseService();
        ContainerOps devOpsService = new DockerContainerService();

        
        webService.handleHttpRequest();
        dbService.executeSqlStatement();
        devOpsService.restartDockerContainer();

        System.out.println("\n--- All operations completed successfully ---");
    }
}

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
        System.out.println("WebController: Routing traffic to endpoint.");
    }
}
    
class SqlDatabaseService implements DatabaseManager {
    @Override
    public void executeSqlStatement() {
        System.out.println("SqlDatabaseService: Executing query on PostgreSQL database.");
    }
}


class DockerContainerService implements ContainerOps {
    @Override
    public void restartDockerContainer() {
        System.out.println("DockerContainerService: Restarting unhealthy container instance.");
    }
}



