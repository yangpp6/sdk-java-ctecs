package cn.ctyun.ctapi.ctecs.ecsbackupcreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建云主机备份>
 * Entity: EcsBackupCreateRequestBody
 */
public class EcsBackupCreateRequestBody {
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * ID
     * 云主机ID
     */
    private String ID;
    /**
     * name
     * 云主机备份名称，名称长度为2-63字符，包含字母（区分大小写）、数字和特殊字符（~!@#$%^*_-+{[]}:,.?）的组合
     */
    private String name;
    /**
     * description
     * 云主机备份描述
     */
    private String description;
    /**
     * forceConsistencyBackup
     * 是否强制创建一致性的备份
     */
    private String forceConsistencyBackup;
    /**
     * repositoryID
     * 存储库ID
     */
    private String repositoryID;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsBackupCreateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set ID
     * @param ID 云主机ID
     * @return this
     */
    public EcsBackupCreateRequestBody withID(String ID) {
        this.ID = ID;
        return this;
    }

    /**
     * set name
     * @param name 云主机备份名称，名称长度为2-63字符，包含字母（区分大小写）、数字和特殊字符（~!@#$%^*_-+{[]}:,.?）的组合
     * @return this
     */
    public EcsBackupCreateRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * set description
     * @param description 云主机备份描述
     * @return this
     */
    public EcsBackupCreateRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * set forceConsistencyBackup
     * @param forceConsistencyBackup 是否强制创建一致性的备份
     * @return this
     */
    public EcsBackupCreateRequestBody withForceConsistencyBackup(String forceConsistencyBackup) {
        this.forceConsistencyBackup = forceConsistencyBackup;
        return this;
    }

    /**
     * set repositoryID
     * @param repositoryID 存储库ID
     * @return this
     */
    public EcsBackupCreateRequestBody withRepositoryID(String repositoryID) {
        this.repositoryID = repositoryID;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getForceConsistencyBackup() {
        return forceConsistencyBackup;
    }

    public void setForceConsistencyBackup(String forceConsistencyBackup) {
        this.forceConsistencyBackup = forceConsistencyBackup;
    }

    public String getRepositoryID() {
        return repositoryID;
    }

    public void setRepositoryID(String repositoryID) {
        this.repositoryID = repositoryID;
    }
}
