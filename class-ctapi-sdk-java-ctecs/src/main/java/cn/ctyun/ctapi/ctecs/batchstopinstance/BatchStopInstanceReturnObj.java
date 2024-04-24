package cn.ctyun.ctapi.ctecs.batchstopinstance;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-关闭多台云主机>
 * Entity: BatchStopInstanceReturnObj
 */
public class BatchStopInstanceReturnObj {
    /**
     * jobIDList
     * 关机任务列表
     */
    private BatchStopInstanceJobIDList[] jobIDList;

    /**
     * set jobIDList
     * @param jobIDList 关机任务列表
     * @return this
     */
    public BatchStopInstanceReturnObj withJobIDList(BatchStopInstanceJobIDList[] jobIDList) {
        this.jobIDList = jobIDList;
        return this;
    }

    public BatchStopInstanceJobIDList[] getJobIDList() {
        return jobIDList;
    }

    public void setJobIDList(BatchStopInstanceJobIDList[] jobIDList) {
        this.jobIDList = jobIDList;
    }
}
