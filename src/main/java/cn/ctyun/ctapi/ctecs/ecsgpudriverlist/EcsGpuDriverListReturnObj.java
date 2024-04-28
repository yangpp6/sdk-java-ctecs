package cn.ctyun.ctapi.ctecs.ecsgpudriverlist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询GPU云主机驱动版本>
 * Entity: EcsGpuDriverListReturnObj
 */
public class EcsGpuDriverListReturnObj {
    /**
     * gpuDriverList
     * 驱动列表
     */
    private String[] gpuDriverList;

    /**
     * set gpuDriverList
     * @param gpuDriverList 驱动列表
     * @return this
     */
    public EcsGpuDriverListReturnObj withGpuDriverList(String[] gpuDriverList) {
        this.gpuDriverList = gpuDriverList;
        return this;
    }

    public String[] getGpuDriverList() {
        return gpuDriverList;
    }

    public void setGpuDriverList(String[] gpuDriverList) {
        this.gpuDriverList = gpuDriverList;
    }
}
