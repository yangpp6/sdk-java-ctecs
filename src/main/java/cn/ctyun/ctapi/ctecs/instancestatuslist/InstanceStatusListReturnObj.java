package cn.ctyun.ctapi.ctecs.instancestatuslist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-获取多台云主机状态>
 * Entity: InstanceStatusListReturnObj
 */
public class InstanceStatusListReturnObj {
    /**
     * currentCount
     * 当前页记录数目
     */
    private Integer currentCount;
    /**
     * totalCount
     * 总记录数
     */
    private Integer totalCount;
    /**
     * totalPage
     * 总页数
     */
    private Integer totalPage;
    /**
     * statusList
     * 分页明细
     */
    private InstanceStatusListStatusList[] statusList;

    /**
     * set currentCount
     * @param currentCount 当前页记录数目
     * @return this
     */
    public InstanceStatusListReturnObj withCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * set totalCount
     * @param totalCount 总记录数
     * @return this
     */
    public InstanceStatusListReturnObj withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set totalPage
     * @param totalPage 总页数
     * @return this
     */
    public InstanceStatusListReturnObj withTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * set statusList
     * @param statusList 分页明细
     * @return this
     */
    public InstanceStatusListReturnObj withStatusList(InstanceStatusListStatusList[] statusList) {
        this.statusList = statusList;
        return this;
    }

    public Integer getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public InstanceStatusListStatusList[] getStatusList() {
        return statusList;
    }

    public void setStatusList(InstanceStatusListStatusList[] statusList) {
        this.statusList = statusList;
    }
}
