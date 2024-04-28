package cn.ctyun.ctapi.ctecs.deletebackuppolicy;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-删除云主机备份策略>
 * Entity: DeleteBackupPolicyReturnObj
 */
public class DeleteBackupPolicyReturnObj {
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
    public DeleteBackupPolicyReturnObj withPolicyID(String policyID) {
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
