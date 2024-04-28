package cn.ctyun.ctapi.ctecs.batchupdateinstances;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量更新云主机>
 * Entity: BatchUpdateInstancesReturnObj
 */
public class BatchUpdateInstancesReturnObj {
    /**
     * updateInfo
     * 被更新云主机信息
     */
    private BatchUpdateInstancesUpdateInfo[] updateInfo;

    /**
     * set updateInfo
     * @param updateInfo 被更新云主机信息
     * @return this
     */
    public BatchUpdateInstancesReturnObj withUpdateInfo(BatchUpdateInstancesUpdateInfo[] updateInfo) {
        this.updateInfo = updateInfo;
        return this;
    }

    public BatchUpdateInstancesUpdateInfo[] getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(BatchUpdateInstancesUpdateInfo[] updateInfo) {
        this.updateInfo = updateInfo;
    }
}
