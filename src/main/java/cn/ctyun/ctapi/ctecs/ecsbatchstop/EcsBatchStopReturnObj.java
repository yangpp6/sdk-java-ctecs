package cn.ctyun.ctapi.ctecs.ecsbatchstop;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-关闭多台云主机>
 * Entity: EcsBatchStopReturnObj
 */
public class EcsBatchStopReturnObj {
    /**
     * jobIDList
     * 关机任务ID列表
     */
    private String[] jobIDList;

    /**
     * set jobIDList
     * @param jobIDList 关机任务ID列表
     * @return this
     */
    public EcsBatchStopReturnObj withJobIDList(String[] jobIDList) {
        this.jobIDList = jobIDList;
        return this;
    }

    public String[] getJobIDList() {
        return jobIDList;
    }

    public void setJobIDList(String[] jobIDList) {
        this.jobIDList = jobIDList;
    }
}
