package cn.ctyun.ctapi.ctecs.snapshotcount;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-获取云主机快照数量>
 * Entity: SnapshotCountReturnObj
 */
public class SnapshotCountReturnObj {
    /**
     * instanceIDNum
     * [云主机id : 云主机快照个数]
     */
    private String instanceIDNum;

    /**
     * set instanceIDNum
     * @param instanceIDNum [云主机id : 云主机快照个数]
     * @return this
     */
    public SnapshotCountReturnObj withInstanceIDNum(String instanceIDNum) {
        this.instanceIDNum = instanceIDNum;
        return this;
    }

    public String getInstanceIDNum() {
        return instanceIDNum;
    }

    public void setInstanceIDNum(String instanceIDNum) {
        this.instanceIDNum = instanceIDNum;
    }
}
