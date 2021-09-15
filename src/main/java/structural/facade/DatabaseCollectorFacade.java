package structural.facade;

public class DatabaseCollectorFacade extends AbstractCollectorFacade {
    private DatabaseStoreService databaseStoreService;
    private HttpClient httpClient;

    public DatabaseCollectorFacade() {
        this.httpClient = new HttpClient();
        this.databaseStoreService = new DatabaseStoreService();
    }

    @Override
    public void collect() {
        String data = httpClient.requestApi();
        databaseStoreService.storeData(data);
    }
}
