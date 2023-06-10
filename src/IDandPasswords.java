import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){
        logininfo.put("Thomas","12345");
        logininfo.put("ThomasA","123456");
        logininfo.put("ThomasAgner","12345678");
    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
