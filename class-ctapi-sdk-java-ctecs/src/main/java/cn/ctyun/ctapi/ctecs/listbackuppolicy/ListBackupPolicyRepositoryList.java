package cn.ctyun.ctapi.ctecs.listbackuppolicy;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份策略列表>
 * Entity: ListBackupPolicyRepositoryList
 */
public class ListBackupPolicyRepositoryList {
    /**
     * repositoryID
     * 云主机备份库ID
     */
    private String repositoryID;
    /**
     * repositoryName
     * 云主机备份库名称
     */
    private String repositoryName;

    /**
     * set repositoryID
     * @param repositoryID 云主机备份库ID
     * @return this
     */
    public ListBackupPolicyRepositoryList withRepositoryID(String repositoryID) {
        this.repositoryID = repositoryID;
        return this;
    }

    /**
     * set repositoryName
     * @param repositoryName 云主机备份库名称
     * @return this
     */
    public ListBackupPolicyRepositoryList withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    public String getRepositoryID() {
        return repositoryID;
    }

    public void setRepositoryID(String repositoryID) {
        this.repositoryID = repositoryID;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }
}
