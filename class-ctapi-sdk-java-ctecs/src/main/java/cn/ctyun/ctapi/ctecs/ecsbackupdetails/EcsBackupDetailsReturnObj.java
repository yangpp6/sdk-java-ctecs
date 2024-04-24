package cn.ctyun.ctapi.ctecs.ecsbackupdetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份详情>
 * Entity: EcsBackupDetailsReturnObj
 */
public class EcsBackupDetailsReturnObj {
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
    private EcsBackupDetailsResults[] results;

    /**
     * set currentCount
     * @param currentCount 当前页记录数目
     * @return this
     */
    public EcsBackupDetailsReturnObj withCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * set totalCount
     * @param totalCount 总记录数
     * @return this
     */
    public EcsBackupDetailsReturnObj withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set totalPage
     * @param totalPage 总页数
     * @return this
     */
    public EcsBackupDetailsReturnObj withTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * set results
     * @param results 分页明细
     * @return this
     */
    public EcsBackupDetailsReturnObj withResults(EcsBackupDetailsResults[] results) {
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

    public EcsBackupDetailsResults[] getResults() {
        return results;
    }

    public void setResults(EcsBackupDetailsResults[] results) {
        this.results = results;
    }
}
