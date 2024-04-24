package cn.ctyun.ctapi.ctecs.ecsbackuprestore;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-恢复云主机备份>
 * Entity: EcsBackupRestoreReturnObj
 */
public class EcsBackupRestoreReturnObj {
    /**
     * instanceBackupID
     * 云主机备份ID
     */
    private String instanceBackupID;

    /**
     * set instanceBackupID
     * @param instanceBackupID 云主机备份ID
     * @return this
     */
    public EcsBackupRestoreReturnObj withInstanceBackupID(String instanceBackupID) {
        this.instanceBackupID = instanceBackupID;
        return this;
    }

    public String getInstanceBackupID() {
        return instanceBackupID;
    }

    public void setInstanceBackupID(String instanceBackupID) {
        this.instanceBackupID = instanceBackupID;
    }
}
