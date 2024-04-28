package cn.ctyun.ctapi.ctecs.listbackuppolicy;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份策略列表>
 * Entity: ListBackupPolicyReturnObj
 */
public class ListBackupPolicyReturnObj {
    /**
     * currentCount
     * 当前页记录数目
     */
    private Integer currentCount;
    /**
     * currentPage
     * 当前页码
     */
    private Integer currentPage;
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
     * policyList
     * 策略列表
     */
    private ListBackupPolicyPolicyList[] policyList;

    /**
     * set currentCount
     * @param currentCount 当前页记录数目
     * @return this
     */
    public ListBackupPolicyReturnObj withCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * set currentPage
     * @param currentPage 当前页码
     * @return this
     */
    public ListBackupPolicyReturnObj withCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    /**
     * set totalCount
     * @param totalCount 总记录数
     * @return this
     */
    public ListBackupPolicyReturnObj withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set totalPage
     * @param totalPage 总页数
     * @return this
     */
    public ListBackupPolicyReturnObj withTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * set policyList
     * @param policyList 策略列表
     * @return this
     */
    public ListBackupPolicyReturnObj withPolicyList(ListBackupPolicyPolicyList[] policyList) {
        this.policyList = policyList;
        return this;
    }

    public Integer getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
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

    public ListBackupPolicyPolicyList[] getPolicyList() {
        return policyList;
    }

    public void setPolicyList(ListBackupPolicyPolicyList[] policyList) {
        this.policyList = policyList;
    }
}
