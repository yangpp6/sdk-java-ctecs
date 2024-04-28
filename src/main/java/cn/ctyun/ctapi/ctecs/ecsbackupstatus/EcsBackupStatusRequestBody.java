package cn.ctyun.ctapi.ctecs.ecsbackupstatus;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份状态>
 * Entity: EcsBackupStatusRequestBody
 */
public class EcsBackupStatusRequestBody {
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * instanceBackupID
     * 云主机备份ID
     */
    private String instanceBackupID;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsBackupStatusRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set instanceBackupID
     * @param instanceBackupID 云主机备份ID
     * @return this
     */
    public EcsBackupStatusRequestBody withInstanceBackupID(String instanceBackupID) {
        this.instanceBackupID = instanceBackupID;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getInstanceBackupID() {
        return instanceBackupID;
    }

    public void setInstanceBackupID(String instanceBackupID) {
        this.instanceBackupID = instanceBackupID;
    }
}
