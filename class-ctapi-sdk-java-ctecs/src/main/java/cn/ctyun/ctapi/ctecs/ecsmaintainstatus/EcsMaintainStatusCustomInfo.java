package cn.ctyun.ctapi.ctecs.ecsmaintainstatus;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-获取云主机维护属性>
 * Entity: EcsMaintainStatusCustomInfo
 */
public class EcsMaintainStatusCustomInfo {
    /**
     * identity
     * 使用identity中的accountId作为用户的标识
     */
    private EcsMaintainStatusIdentity identity;

    /**
     * set identity
     * @param identity 使用identity中的accountId作为用户的标识
     * @return this
     */
    public EcsMaintainStatusCustomInfo withIdentity(EcsMaintainStatusIdentity identity) {
        this.identity = identity;
        return this;
    }

    public EcsMaintainStatusIdentity getIdentity() {
        return identity;
    }

    public void setIdentity(EcsMaintainStatusIdentity identity) {
        this.identity = identity;
    }
}
