package cn.ctyun.ctapi.ctecs.ecsbatchreboot;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-重启多台云主机>
 * Entity: EcsBatchRebootReturnObj
 */
public class EcsBatchRebootReturnObj {
    /**
     * jobIDList
     * 重启任务ID列表
     */
    private String[] jobIDList;

    /**
     * set jobIDList
     * @param jobIDList 重启任务ID列表
     * @return this
     */
    public EcsBatchRebootReturnObj withJobIDList(String[] jobIDList) {
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
