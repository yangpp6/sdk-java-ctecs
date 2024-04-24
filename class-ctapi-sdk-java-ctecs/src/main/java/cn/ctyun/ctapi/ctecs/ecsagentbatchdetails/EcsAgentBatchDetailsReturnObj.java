package cn.ctyun.ctapi.ctecs.ecsagentbatchdetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询云主机监控插件信息>
 * Entity: EcsAgentBatchDetailsReturnObj
 */
public class EcsAgentBatchDetailsReturnObj {
    /**
     * results
     * 返回参数，参考表results
     */
    private EcsAgentBatchDetailsResults[] results;

    /**
     * set results
     * @param results 返回参数，参考表results
     * @return this
     */
    public EcsAgentBatchDetailsReturnObj withResults(EcsAgentBatchDetailsResults[] results) {
        this.results = results;
        return this;
    }

    public EcsAgentBatchDetailsResults[] getResults() {
        return results;
    }

    public void setResults(EcsAgentBatchDetailsResults[] results) {
        this.results = results;
    }
}
