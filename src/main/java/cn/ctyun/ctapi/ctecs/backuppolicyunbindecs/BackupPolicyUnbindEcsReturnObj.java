package cn.ctyun.ctapi.ctecs.backuppolicyunbindecs;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-备份策略解绑云主机>
 * Entity: BackupPolicyUnbindEcsReturnObj
 */
public class BackupPolicyUnbindEcsReturnObj {
    /**
     * policyID
     * 云主机备份策略ID
     */
    private String policyID;
    /**
     * instanceIDList
     * 一台或多台云主机ID，多台则使用英文逗号分割
     */
    private String instanceIDList;

    /**
     * set policyID
     * @param policyID 云主机备份策略ID
     * @return this
     */
    public BackupPolicyUnbindEcsReturnObj withPolicyID(String policyID) {
        this.policyID = policyID;
        return this;
    }

    /**
     * set instanceIDList
     * @param instanceIDList 一台或多台云主机ID，多台则使用英文逗号分割
     * @return this
     */
    public BackupPolicyUnbindEcsReturnObj withInstanceIDList(String instanceIDList) {
        this.instanceIDList = instanceIDList;
        return this;
    }

    public String getPolicyID() {
        return policyID;
    }

    public void setPolicyID(String policyID) {
        this.policyID = policyID;
    }

    public String getInstanceIDList() {
        return instanceIDList;
    }

    public void setInstanceIDList(String instanceIDList) {
        this.instanceIDList = instanceIDList;
    }
}
