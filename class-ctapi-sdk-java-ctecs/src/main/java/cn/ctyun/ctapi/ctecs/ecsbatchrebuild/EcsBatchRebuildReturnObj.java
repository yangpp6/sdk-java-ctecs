package cn.ctyun.ctapi.ctecs.ecsbatchrebuild;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-重装多台云主机>
 * Entity: EcsBatchRebuildReturnObj
 */
public class EcsBatchRebuildReturnObj {
    /**
     * jobIDList
     * 重装任务ID列表
     */
    private String[] jobIDList;

    /**
     * set jobIDList
     * @param jobIDList 重装任务ID列表
     * @return this
     */
    public EcsBatchRebuildReturnObj withJobIDList(String[] jobIDList) {
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
