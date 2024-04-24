package cn.ctyun.ctapi.ctecs.ecsbackupbatchupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量更新云主机备份信息>
 * Entity: EcsBackupBatchUpdateRequestBody
 */
public class EcsBackupBatchUpdateRequestBody {
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * updateInfo
     * 云主机备份更新信息
     */
    private EcsBackupBatchUpdateUpdateInfo[] updateInfo;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsBackupBatchUpdateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set updateInfo
     * @param updateInfo 云主机备份更新信息
     * @return this
     */
    public EcsBackupBatchUpdateRequestBody withUpdateInfo(EcsBackupBatchUpdateUpdateInfo[] updateInfo) {
        this.updateInfo = updateInfo;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public EcsBackupBatchUpdateUpdateInfo[] getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(EcsBackupBatchUpdateUpdateInfo[] updateInfo) {
        this.updateInfo = updateInfo;
    }
}
