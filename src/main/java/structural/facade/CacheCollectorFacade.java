package structural.facade;

public class CacheCollectorFacade extends AbstractCollectorFacade {
    private CacheStoreService cacheStoreService;
    private HttpClient httpClient;

    public CacheCollectorFacade() {
        this.httpClient = new HttpClient();
        this.cacheStoreService = new CacheStoreService();
    }

    @Override
    public void collect() {
        String data = httpClient.requestApi();
        cacheStoreService.storeData(data);
    }
}
