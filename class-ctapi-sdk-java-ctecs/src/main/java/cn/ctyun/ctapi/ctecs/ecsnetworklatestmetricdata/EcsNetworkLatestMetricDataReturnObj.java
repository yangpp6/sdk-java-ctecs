package cn.ctyun.ctapi.ctecs.ecsnetworklatestmetricdata;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机的网卡实时监控数据>
 * Entity: EcsNetworkLatestMetricDataReturnObj
 */
public class EcsNetworkLatestMetricDataReturnObj {
    /**
     * result
     * result对象
     */
    private EcsNetworkLatestMetricDataResult[] result;
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
     * pageSize
     * 每页记录数目，取值范围：[1, 50]，注：默认值为10
     */
    private Integer pageSize;
    /**
     * page
     * 页码，取值范围：正整数（≥1），注：默认值为1，后续该字段可能废弃
     */
    private Integer page;

    /**
     * set result
     * @param result result对象
     * @return this
     */
    public EcsNetworkLatestMetricDataReturnObj withResult(EcsNetworkLatestMetricDataResult[] result) {
        this.result = result;
        return this;
    }

    /**
     * set currentCount
     * @param currentCount 当前页记录数目
     * @return this
     */
    public EcsNetworkLatestMetricDataReturnObj withCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * set totalCount
     * @param totalCount 总记录数
     * @return this
     */
    public EcsNetworkLatestMetricDataReturnObj withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set totalPage
     * @param totalPage 总页数
     * @return this
     */
    public EcsNetworkLatestMetricDataReturnObj withTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * set pageSize
     * @param pageSize 每页记录数目，取值范围：[1, 50]，注：默认值为10
     * @return this
     */
    public EcsNetworkLatestMetricDataReturnObj withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set page
     * @param page 页码，取值范围：正整数（≥1），注：默认值为1，后续该字段可能废弃
     * @return this
     */
    public EcsNetworkLatestMetricDataReturnObj withPage(Integer page) {
        this.page = page;
        return this;
    }

    public EcsNetworkLatestMetricDataResult[] getResult() {
        return result;
    }

    public void setResult(EcsNetworkLatestMetricDataResult[] result) {
        this.result = result;
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

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}
