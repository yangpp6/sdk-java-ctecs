package cn.ctyun.ctapi.ctecs.ecsquerysnapshot;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机快照个数统计>
 * Entity: EcsQuerySnapshotResults
 */
public class EcsQuerySnapshotResults {
    /**
     * instanceID_Num
     * [云主机id: 云主机快照个数]
     */
    private Map<String, String> instanceID_Num;

    /**
     * set instanceID_Num
     * @param instanceID_Num [云主机id: 云主机快照个数]
     * @return this
     */
    public EcsQuerySnapshotResults withInstanceID_Num(Map<String, String> instanceID_Num) {
        this.instanceID_Num = instanceID_Num;
        return this;
    }

    public Map<String, String> getInstanceID_Num() {
        return instanceID_Num;
    }

    public void setInstanceID_Num(Map<String, String> instanceID_Num) {
        this.instanceID_Num = instanceID_Num;
    }
}
