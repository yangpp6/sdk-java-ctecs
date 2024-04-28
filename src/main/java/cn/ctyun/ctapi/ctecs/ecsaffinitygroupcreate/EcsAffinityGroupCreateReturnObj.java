package cn.ctyun.ctapi.ctecs.ecsaffinitygroupcreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建云主机组>
 * Entity: EcsAffinityGroupCreateReturnObj
 */
public class EcsAffinityGroupCreateReturnObj {
    /**
     * results
     * 云主机组列表
     */
    private EcsAffinityGroupCreateResults[] results;

    /**
     * set results
     * @param results 云主机组列表
     * @return this
     */
    public EcsAffinityGroupCreateReturnObj withResults(EcsAffinityGroupCreateResults[] results) {
        this.results = results;
        return this;
    }

    public EcsAffinityGroupCreateResults[] getResults() {
        return results;
    }

    public void setResults(EcsAffinityGroupCreateResults[] results) {
        this.results = results;
    }
}
