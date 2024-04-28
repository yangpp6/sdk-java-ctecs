package cn.ctyun.ctapi.ctecs.ecsmaintainstatus;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-获取云主机维护属性>
 * Entity: EcsMaintainStatusIdentity
 */
public class EcsMaintainStatusIdentity {
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
    public EcsMaintainStatusIdentity withAccountId(String accountId) {
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
