package cn.ctyun.ctapi.ctecs.ecsbatchshelveinstances;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-节省关机多台云主机>
 * Entity: EcsBatchShelveInstancesReturnObj
 */
public class EcsBatchShelveInstancesReturnObj {
    /**
     * jobIDList
     * 关机任务列表
     */
    private EcsBatchShelveInstancesJobIDList[] jobIDList;

    /**
     * set jobIDList
     * @param jobIDList 关机任务列表
     * @return this
     */
    public EcsBatchShelveInstancesReturnObj withJobIDList(EcsBatchShelveInstancesJobIDList[] jobIDList) {
        this.jobIDList = jobIDList;
        return this;
    }

    public EcsBatchShelveInstancesJobIDList[] getJobIDList() {
        return jobIDList;
    }

    public void setJobIDList(EcsBatchShelveInstancesJobIDList[] jobIDList) {
        this.jobIDList = jobIDList;
    }
}
