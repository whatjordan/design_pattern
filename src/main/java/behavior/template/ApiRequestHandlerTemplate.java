package behavior.template;

import java.util.HashMap;
import java.util.Map;

public class ApiRequestHandlerTemplate extends RequestHandlerTemplate {
    private Map<String, String> nameAndPwdMap;

    public ApiRequestHandlerTemplate() {
        nameAndPwdMap = new HashMap<>();
        nameAndPwdMap.put("admin", "123");
    }

    @Override
    protected void preHandle(Map context) throws Exception {
        String user = (String) context.get("user");
        String pwd = (String) context.get("pwd");
        if (user != null && pwd != null
                && nameAndPwdMap.containsKey(user)
                && nameAndPwdMap.get(user).equals(pwd)) {
            System.out.println("validation is successful");
        }else{
            throw new Exception(" validation is failed!");
        }
    }

    @Override
    protected void request(Map context) {
        System.out.println("handle api request content: " + context.get("content"));
    }
}
