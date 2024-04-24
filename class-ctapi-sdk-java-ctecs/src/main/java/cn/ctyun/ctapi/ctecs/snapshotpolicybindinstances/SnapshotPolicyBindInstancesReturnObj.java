package cn.ctyun.ctapi.ctecs.snapshotpolicybindinstances;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-快照策略绑定云主机>
 * Entity: SnapshotPolicyBindInstancesReturnObj
 */
public class SnapshotPolicyBindInstancesReturnObj {
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
    public SnapshotPolicyBindInstancesReturnObj withInstanceIDList(String[] instanceIDList) {
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
