package design_pattern.structural;

import org.junit.Test;
import structural.facade.CacheCollectorFacade;
import structural.facade.DatabaseCollectorFacade;

public class FacadeExample {
    @Test
    public void test() {
        CacheCollectorFacade cacheCollectorFacade = new CacheCollectorFacade();
        cacheCollectorFacade.collect();
        DatabaseCollectorFacade databaseCollectorFacade = new DatabaseCollectorFacade();
        databaseCollectorFacade.collect();
    }

}
