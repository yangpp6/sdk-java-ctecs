package cn.ctyun.ctapi.ctecs.ecssnapshotlist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机快照列表>
 * Entity: EcsSnapshotListReturnObj
 */
public class EcsSnapshotListReturnObj {
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
     * results
     * 分页明细
     */
    private EcsSnapshotListResults[] results;

    /**
     * set currentCount
     * @param currentCount 当前页记录数目
     * @return this
     */
    public EcsSnapshotListReturnObj withCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * set totalCount
     * @param totalCount 总记录数
     * @return this
     */
    public EcsSnapshotListReturnObj withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set totalPage
     * @param totalPage 总页数
     * @return this
     */
    public EcsSnapshotListReturnObj withTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * set results
     * @param results 分页明细
     * @return this
     */
    public EcsSnapshotListReturnObj withResults(EcsSnapshotListResults[] results) {
        this.results = results;
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

    public EcsSnapshotListResults[] getResults() {
        return results;
    }

    public void setResults(EcsSnapshotListResults[] results) {
        this.results = results;
    }
}
