package cn.ctyun.ctapi.ctecs.ecsagentbatchresults;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询云主机监控插件操作结果>
 * Entity: EcsAgentBatchResultsRequestBody
 */
public class EcsAgentBatchResultsRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * pidInfo
     * 云主机执行命令的进程信息
     */
    private EcsAgentBatchResultsPidInfo[] pidInfo;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public EcsAgentBatchResultsRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set pidInfo
     * @param pidInfo 云主机执行命令的进程信息
     * @return this
     */
    public EcsAgentBatchResultsRequestBody withPidInfo(EcsAgentBatchResultsPidInfo[] pidInfo) {
        this.pidInfo = pidInfo;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public EcsAgentBatchResultsPidInfo[] getPidInfo() {
        return pidInfo;
    }

    public void setPidInfo(EcsAgentBatchResultsPidInfo[] pidInfo) {
        this.pidInfo = pidInfo;
    }
}
