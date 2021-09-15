package behavior.template;

import java.util.Map;

public abstract class RequestHandlerTemplate {

    protected void preHandle(Map context) throws Exception {
    }

    protected abstract void request(Map context);

    protected void postHandle(Map context) {
    }

    public final void handle(Map context) throws Exception {
        preHandle(context);
        request(context);
        postHandle(context);
    }
}
