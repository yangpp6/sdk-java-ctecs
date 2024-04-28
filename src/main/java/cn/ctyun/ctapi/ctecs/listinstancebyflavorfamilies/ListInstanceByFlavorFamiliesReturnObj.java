package cn.ctyun.ctapi.ctecs.listinstancebyflavorfamilies;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询指定规格族下的云主机信息>
 * Entity: ListInstanceByFlavorFamiliesReturnObj
 */
public class ListInstanceByFlavorFamiliesReturnObj {
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
     * 云主机列表
     */
    private ListInstanceByFlavorFamiliesResults[] results;

    /**
     * set currentCount
     * @param currentCount 当前页记录数目
     * @return this
     */
    public ListInstanceByFlavorFamiliesReturnObj withCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * set totalCount
     * @param totalCount 总记录数
     * @return this
     */
    public ListInstanceByFlavorFamiliesReturnObj withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set totalPage
     * @param totalPage 总页数
     * @return this
     */
    public ListInstanceByFlavorFamiliesReturnObj withTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * set results
     * @param results 云主机列表
     * @return this
     */
    public ListInstanceByFlavorFamiliesReturnObj withResults(ListInstanceByFlavorFamiliesResults[] results) {
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

    public ListInstanceByFlavorFamiliesResults[] getResults() {
        return results;
    }

    public void setResults(ListInstanceByFlavorFamiliesResults[] results) {
        this.results = results;
    }
}
