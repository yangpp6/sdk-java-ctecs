package cn.ctyun.ctapi.ctecs.batchrebuildinstance;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-重装多台云主机>
 * Entity: BatchRebuildInstanceReturnObj
 */
public class BatchRebuildInstanceReturnObj {
    /**
     * jobIDList
     * 重装任务列表
     */
    private BatchRebuildInstanceJobIDList[] jobIDList;

    /**
     * set jobIDList
     * @param jobIDList 重装任务列表
     * @return this
     */
    public BatchRebuildInstanceReturnObj withJobIDList(BatchRebuildInstanceJobIDList[] jobIDList) {
        this.jobIDList = jobIDList;
        return this;
    }

    public BatchRebuildInstanceJobIDList[] getJobIDList() {
        return jobIDList;
    }

    public void setJobIDList(BatchRebuildInstanceJobIDList[] jobIDList) {
        this.jobIDList = jobIDList;
    }
}
