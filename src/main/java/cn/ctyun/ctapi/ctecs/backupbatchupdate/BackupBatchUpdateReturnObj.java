package cn.ctyun.ctapi.ctecs.backupbatchupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量更新云主机备份信息>
 * Entity: BackupBatchUpdateReturnObj
 */
public class BackupBatchUpdateReturnObj {
    /**
     * instanceBackupIDList
     * 云主机备份ID列表
     */
    private String[] instanceBackupIDList;

    /**
     * set instanceBackupIDList
     * @param instanceBackupIDList 云主机备份ID列表
     * @return this
     */
    public BackupBatchUpdateReturnObj withInstanceBackupIDList(String[] instanceBackupIDList) {
        this.instanceBackupIDList = instanceBackupIDList;
        return this;
    }

    public String[] getInstanceBackupIDList() {
        return instanceBackupIDList;
    }

    public void setInstanceBackupIDList(String[] instanceBackupIDList) {
        this.instanceBackupIDList = instanceBackupIDList;
    }
}
