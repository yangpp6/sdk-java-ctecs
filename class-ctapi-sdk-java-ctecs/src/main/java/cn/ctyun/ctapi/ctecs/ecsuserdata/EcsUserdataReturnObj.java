package cn.ctyun.ctapi.ctecs.ecsuserdata;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询一台云主机的自定义数据>
 * Entity: EcsUserdataReturnObj
 */
public class EcsUserdataReturnObj {
    /**
     * userdata
     * 用户自定义数据。
     */
    private String userdata;

    /**
     * set userdata
     * @param userdata 用户自定义数据。
     * @return this
     */
    public EcsUserdataReturnObj withUserdata(String userdata) {
        this.userdata = userdata;
        return this;
    }

    public String getUserdata() {
        return userdata;
    }

    public void setUserdata(String userdata) {
        this.userdata = userdata;
    }
}
