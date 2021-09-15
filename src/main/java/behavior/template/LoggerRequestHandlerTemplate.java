package behavior.template;

import java.util.Date;
import java.util.Map;

public class LoggerRequestHandlerTemplate extends RequestHandlerTemplate {

    @Override
    protected void postHandle(Map context) {
        System.out.println("record request content: (" + new Date() + ")  " + context.get("content"));
    }

    @Override
    protected void request(Map context) {
        //Maybe just dispatch the request
    }
}
