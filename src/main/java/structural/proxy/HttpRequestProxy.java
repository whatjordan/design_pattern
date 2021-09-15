package structural.proxy;

public class HttpRequestProxy implements AbstractRequest {
    HttpRequest httpRequest = new HttpRequest();

    private void preRequest(RequestContext context) {
        System.out.println("validate request identity");
    }

    @Override
    public void doRequest(RequestContext context) {
        preRequest(context);
        httpRequest.doRequest(context);
        postRequest(context);
    }

    private void postRequest(RequestContext context) {
        System.out.println("write request log ");
    }
}
