package design_pattern.behaviour;

import behavior.template.ApiRequestHandlerTemplate;
import behavior.template.LoggerRequestHandlerTemplate;
import behavior.template.RequestHandlerTemplate;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TemplateExample {
    @Test
    public void test() throws Exception {
        RequestHandlerTemplate ApiHandlerTemplate = new ApiRequestHandlerTemplate();
        Map requestContext = new HashMap();
        requestContext.put("user", "admin");
        requestContext.put("pwd", "123");
        requestContext.put("content", " CONTENT ");
        ApiHandlerTemplate.handle(requestContext);
        RequestHandlerTemplate loggerHandlerTemplate = new LoggerRequestHandlerTemplate();
        loggerHandlerTemplate.handle(requestContext);

    }
}
