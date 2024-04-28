package cn.ctyun.ctapi.ctecs.ecsmigratetime;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-获取云主机迁移时间预估>
 * Entity: EcsMigrateTimeCustomInfo
 */
public class EcsMigrateTimeCustomInfo {
    /**
     * identity
     * 使用identity中的accountId作为用户的标识
     */
    private EcsMigrateTimeIdentity identity;

    /**
     * set identity
     * @param identity 使用identity中的accountId作为用户的标识
     * @return this
     */
    public EcsMigrateTimeCustomInfo withIdentity(EcsMigrateTimeIdentity identity) {
        this.identity = identity;
        return this;
    }

    public EcsMigrateTimeIdentity getIdentity() {
        return identity;
    }

    public void setIdentity(EcsMigrateTimeIdentity identity) {
        this.identity = identity;
    }
}
