package cn.ctyun.ctapi.ctecs.ecsqueryasyncresults;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量查询异步任务的结果>
 * Entity: EcsQueryAsyncResultsRequestBody
 */
public class EcsQueryAsyncResultsRequestBody {
    /**
     * regionID
     * 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     */
    private String regionID;
    /**
     * jobIDList
     * 异步任务ID列表，以英文逗号分隔每个ID
     */
    private String jobIDList;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     * @return this
     */
    public EcsQueryAsyncResultsRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set jobIDList
     * @param jobIDList 异步任务ID列表，以英文逗号分隔每个ID
     * @return this
     */
    public EcsQueryAsyncResultsRequestBody withJobIDList(String jobIDList) {
        this.jobIDList = jobIDList;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getJobIDList() {
        return jobIDList;
    }

    public void setJobIDList(String jobIDList) {
        this.jobIDList = jobIDList;
    }
}
