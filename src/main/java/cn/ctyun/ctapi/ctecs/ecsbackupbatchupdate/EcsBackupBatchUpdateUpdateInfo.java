package cn.ctyun.ctapi.ctecs.ecsbackupbatchupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量更新云主机备份信息>
 * Entity: EcsBackupBatchUpdateUpdateInfo
 */
public class EcsBackupBatchUpdateUpdateInfo {
    /**
     * instanceBackupID
     * 云主机备份ID
     */
    private String instanceBackupID;
    /**
     * name
     * 云主机备份名称，长度为2~63个字符
     */
    private String name;
    /**
     * description
     * 云主机备份描述
     */
    private String description;

    /**
     * set instanceBackupID
     * @param instanceBackupID 云主机备份ID
     * @return this
     */
    public EcsBackupBatchUpdateUpdateInfo withInstanceBackupID(String instanceBackupID) {
        this.instanceBackupID = instanceBackupID;
        return this;
    }

    /**
     * set name
     * @param name 云主机备份名称，长度为2~63个字符
     * @return this
     */
    public EcsBackupBatchUpdateUpdateInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * set description
     * @param description 云主机备份描述
     * @return this
     */
    public EcsBackupBatchUpdateUpdateInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getInstanceBackupID() {
        return instanceBackupID;
    }

    public void setInstanceBackupID(String instanceBackupID) {
        this.instanceBackupID = instanceBackupID;
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
}
