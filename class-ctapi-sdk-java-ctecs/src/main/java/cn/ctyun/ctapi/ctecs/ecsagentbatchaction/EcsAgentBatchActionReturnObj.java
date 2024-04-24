package cn.ctyun.ctapi.ctecs.ecsagentbatchaction;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <操作云主机监控插件>
 * Entity: EcsAgentBatchActionReturnObj
 */
public class EcsAgentBatchActionReturnObj {
    /**
     * results
     * 分页明细
     */
    private EcsAgentBatchActionResults[] results;

    /**
     * set results
     * @param results 分页明细
     * @return this
     */
    public EcsAgentBatchActionReturnObj withResults(EcsAgentBatchActionResults[] results) {
        this.results = results;
        return this;
    }

    public EcsAgentBatchActionResults[] getResults() {
        return results;
    }

    public void setResults(EcsAgentBatchActionResults[] results) {
        this.results = results;
    }
}
