package cn.ctyun.ctapi.ctecs.snapshotpolicyunbindinstances;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-快照策略解绑云主机>
 * Entity: SnapshotPolicyUnbindInstancesReturnObj
 */
public class SnapshotPolicyUnbindInstancesReturnObj {
    /**
     * instanceIDList
     * 本次策略绑定云主机ID列表
     */
    private String[] instanceIDList;

    /**
     * set instanceIDList
     * @param instanceIDList 本次策略绑定云主机ID列表
     * @return this
     */
    public SnapshotPolicyUnbindInstancesReturnObj withInstanceIDList(String[] instanceIDList) {
        this.instanceIDList = instanceIDList;
        return this;
    }

    public String[] getInstanceIDList() {
        return instanceIDList;
    }

    public void setInstanceIDList(String[] instanceIDList) {
        this.instanceIDList = instanceIDList;
    }
}
