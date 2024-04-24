package cn.ctyun.ctapi.ctecs.batchstartinstance;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-开启多台云主机>
 * Entity: BatchStartInstanceReturnObj
 */
public class BatchStartInstanceReturnObj {
    /**
     * jobIDList
     * 开机任务列表
     */
    private BatchStartInstanceJobIDList[] jobIDList;

    /**
     * set jobIDList
     * @param jobIDList 开机任务列表
     * @return this
     */
    public BatchStartInstanceReturnObj withJobIDList(BatchStartInstanceJobIDList[] jobIDList) {
        this.jobIDList = jobIDList;
        return this;
    }

    public BatchStartInstanceJobIDList[] getJobIDList() {
        return jobIDList;
    }

    public void setJobIDList(BatchStartInstanceJobIDList[] jobIDList) {
        this.jobIDList = jobIDList;
    }
}
