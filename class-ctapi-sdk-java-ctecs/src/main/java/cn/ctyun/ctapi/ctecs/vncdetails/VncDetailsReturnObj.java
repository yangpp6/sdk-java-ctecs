package cn.ctyun.ctapi.ctecs.vncdetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-获取VNC详情>
 * Entity: VncDetailsReturnObj
 */
public class VncDetailsReturnObj {
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
    public VncDetailsReturnObj withToken(String token) {
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
