package cn.ctyun.ctapi.ctecs.ecsbackup;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机立即备份>
 * Entity: EcsBackupReturnObj
 */
public class EcsBackupReturnObj {
    /**
     * policyID
     * 云主机备份策略ID
     */
    private String policyID;

    /**
     * set policyID
     * @param policyID 云主机备份策略ID
     * @return this
     */
    public EcsBackupReturnObj withPolicyID(String policyID) {
        this.policyID = policyID;
        return this;
    }

    public String getPolicyID() {
        return policyID;
    }

    public void setPolicyID(String policyID) {
        this.policyID = policyID;
    }
}
