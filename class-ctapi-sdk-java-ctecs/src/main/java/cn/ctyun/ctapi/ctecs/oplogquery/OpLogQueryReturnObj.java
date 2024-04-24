package cn.ctyun.ctapi.ctecs.oplogquery;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询用户资源操作日志>
 * Entity: OpLogQueryReturnObj
 */
public class OpLogQueryReturnObj {
    /**
     * pageNo
     * 当前页码
     */
    private Integer pageNo;
    /**
     * pageSize
     * 每页数量
     */
    private Integer pageSize;
    /**
     * currentCount
     * 当前数量
     */
    private Integer currentCount;
    /**
     * totalPage
     * 总页数
     */
    private Integer totalPage;
    /**
     * totalCount
     * 总数量
     */
    private Integer totalCount;

    /**
     * set pageNo
     * @param pageNo 当前页码
     * @return this
     */
    public OpLogQueryReturnObj withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * set pageSize
     * @param pageSize 每页数量
     * @return this
     */
    public OpLogQueryReturnObj withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set currentCount
     * @param currentCount 当前数量
     * @return this
     */
    public OpLogQueryReturnObj withCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * set totalPage
     * @param totalPage 总页数
     * @return this
     */
    public OpLogQueryReturnObj withTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * set totalCount
     * @param totalCount 总数量
     * @return this
     */
    public OpLogQueryReturnObj withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
