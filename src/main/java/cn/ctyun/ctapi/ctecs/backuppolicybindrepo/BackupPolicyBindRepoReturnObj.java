package cn.ctyun.ctapi.ctecs.backuppolicybindrepo;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机备份策略绑定存储库>
 * Entity: BackupPolicyBindRepoReturnObj
 */
public class BackupPolicyBindRepoReturnObj {
    /**
     * repositoryID
     * 存储库ID
     */
    private String repositoryID;
    /**
     * policyID
     * 云主机备份策略ID
     */
    private String policyID;

    /**
     * set repositoryID
     * @param repositoryID 存储库ID
     * @return this
     */
    public BackupPolicyBindRepoReturnObj withRepositoryID(String repositoryID) {
        this.repositoryID = repositoryID;
        return this;
    }

    /**
     * set policyID
     * @param policyID 云主机备份策略ID
     * @return this
     */
    public BackupPolicyBindRepoReturnObj withPolicyID(String policyID) {
        this.policyID = policyID;
        return this;
    }

    public String getRepositoryID() {
        return repositoryID;
    }

    public void setRepositoryID(String repositoryID) {
        this.repositoryID = repositoryID;
    }

    public String getPolicyID() {
        return policyID;
    }

    public void setPolicyID(String policyID) {
        this.policyID = policyID;
    }
}
