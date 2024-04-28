package cn.ctyun.ctapi.ctecs.ecsvncshow;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询一台云主机的Web管理终端地址>
 * Entity: EcsVncShowReturnObj
 */
public class EcsVncShowReturnObj {
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
    public EcsVncShowReturnObj withToken(String token) {
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
