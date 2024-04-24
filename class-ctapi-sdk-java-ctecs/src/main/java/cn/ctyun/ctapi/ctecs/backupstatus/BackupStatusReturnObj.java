package cn.ctyun.ctapi.ctecs.backupstatus;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份状态>
 * Entity: BackupStatusReturnObj
 */
public class BackupStatusReturnObj {
    /**
     * instanceBackupStatus
     * 备份状态，取值范围：<br />CREATING: 备份创建中, <br />ACTIVE: 可用， <br />RESTORING: 备份恢复中，<br />DELETING: 删除中，<br />EXPIRED：到期，<br />ERROR：错误
     */
    private String instanceBackupStatus;

    /**
     * set instanceBackupStatus
     * @param instanceBackupStatus 备份状态，取值范围：<br />CREATING: 备份创建中, <br />ACTIVE: 可用， <br />RESTORING: 备份恢复中，<br />DELETING: 删除中，<br />EXPIRED：到期，<br />ERROR：错误
     * @return this
     */
    public BackupStatusReturnObj withInstanceBackupStatus(String instanceBackupStatus) {
        this.instanceBackupStatus = instanceBackupStatus;
        return this;
    }

    public String getInstanceBackupStatus() {
        return instanceBackupStatus;
    }

    public void setInstanceBackupStatus(String instanceBackupStatus) {
        this.instanceBackupStatus = instanceBackupStatus;
    }
}
