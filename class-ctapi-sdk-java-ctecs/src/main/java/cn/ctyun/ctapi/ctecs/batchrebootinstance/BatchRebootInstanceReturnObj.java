package cn.ctyun.ctapi.ctecs.batchrebootinstance;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-重启多台云主机>
 * Entity: BatchRebootInstanceReturnObj
 */
public class BatchRebootInstanceReturnObj {
    /**
     * jobIDList
     * 重启任务列表
     */
    private BatchRebootInstanceJobIDList[] jobIDList;

    /**
     * set jobIDList
     * @param jobIDList 重启任务列表
     * @return this
     */
    public BatchRebootInstanceReturnObj withJobIDList(BatchRebootInstanceJobIDList[] jobIDList) {
        this.jobIDList = jobIDList;
        return this;
    }

    public BatchRebootInstanceJobIDList[] getJobIDList() {
        return jobIDList;
    }

    public void setJobIDList(BatchRebootInstanceJobIDList[] jobIDList) {
        this.jobIDList = jobIDList;
    }
}
