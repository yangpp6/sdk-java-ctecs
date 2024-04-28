package cn.ctyun.ctapi.ctecs.ecslitevncdetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <获取轻量型云主机的VNC>
 * Entity: EcsLiteVncDetailsReturnObj
 */
public class EcsLiteVncDetailsReturnObj {
    /**
     * token
     * token
     */
    private String token;

    /**
     * set token
     * @param token token
     * @return this
     */
    public EcsLiteVncDetailsReturnObj withToken(String token) {
        this.token = token;
        return this;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
