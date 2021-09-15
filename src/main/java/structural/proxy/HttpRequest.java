package structural.proxy;

public class HttpRequest implements AbstractRequest{
    @Override
    public void doRequest(RequestContext context) {
        System.out.println("Handle request! " + context.getContent());
    }

}
