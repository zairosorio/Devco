package starter.Models;

import java.util.Map;

public class LoginDataModels {
    private String user = null;
    private String pass = null;


    public LoginDataModels(Map<String, String> map) {
        this.pass = map.get("user");
        this.user = map.get("pass");
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
}
