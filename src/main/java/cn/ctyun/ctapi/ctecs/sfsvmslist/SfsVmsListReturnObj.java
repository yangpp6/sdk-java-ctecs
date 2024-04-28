package cn.ctyun.ctapi.ctecs.sfsvmslist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询文件系统关联虚机列表>
 * Entity: SfsVmsListReturnObj
 */
public class SfsVmsListReturnObj {
    /**
     * currentCount
     * 当前页码
     */
    private Integer currentCount;
    /**
     * totalCount
     * 总记录数
     */
    private Integer totalCount;
    /**
     * results
     * 分页明细
     */
    private SfsVmsListResults[] results;

    /**
     * set currentCount
     * @param currentCount 当前页码
     * @return this
     */
    public SfsVmsListReturnObj withCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * set totalCount
     * @param totalCount 总记录数
     * @return this
     */
    public SfsVmsListReturnObj withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set results
     * @param results 分页明细
     * @return this
     */
    public SfsVmsListReturnObj withResults(SfsVmsListResults[] results) {
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

    public SfsVmsListResults[] getResults() {
        return results;
    }

    public void setResults(SfsVmsListResults[] results) {
        this.results = results;
    }
}
