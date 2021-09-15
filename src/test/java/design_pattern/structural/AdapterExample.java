package design_pattern.structural;

import org.junit.Test;
import structural.adapter.CacheObjectAdapter;
import structural.adapter.ThirdPartyCacheLibrary;

import java.util.HashMap;
import java.util.Map;

public class AdapterExample {
    @Test
    public void test() {
        CacheObjectAdapter cacheObjectAdapter = new CacheObjectAdapter(new XxCacheLibrary());
        cacheObjectAdapter.put("a", "a");
    }

    class XxCacheLibrary implements ThirdPartyCacheLibrary {
        Map map = new HashMap();

        @Override
        public Object retrieveData(String key) {
            return map.get(key);
        }

        @Override
        public void setData(String key, Object data) {
            map.put(key, data);
        }

        @Override
        public void methodThatWeDoNotUse() {
            System.out.println("We don't use this method");
        }
    }
}
