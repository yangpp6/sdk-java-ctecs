package cn.ctyun.ctapi.ctecs.ecsmigratetime;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-获取云主机迁移时间预估>
 * Entity: EcsMigrateTimeIdentity
 */
public class EcsMigrateTimeIdentity {
    /**
     * accountId
     * 用户的标识
     */
    private String accountId;

    /**
     * set accountId
     * @param accountId 用户的标识
     * @return this
     */
    public EcsMigrateTimeIdentity withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
