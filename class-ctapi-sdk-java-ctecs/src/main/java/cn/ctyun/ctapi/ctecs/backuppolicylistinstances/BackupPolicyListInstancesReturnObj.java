package cn.ctyun.ctapi.ctecs.backuppolicylistinstances;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份策略绑定云主机信息>
 * Entity: BackupPolicyListInstancesReturnObj
 */
public class BackupPolicyListInstancesReturnObj {
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
     * instancePolicies
     * 分页明细
     */
    private BackupPolicyListInstancesInstancePolicies[] instancePolicies;

    /**
     * set currentCount
     * @param currentCount 当前页记录数目
     * @return this
     */
    public BackupPolicyListInstancesReturnObj withCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * set currentPage
     * @param currentPage 当前页码
     * @return this
     */
    public BackupPolicyListInstancesReturnObj withCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    /**
     * set totalCount
     * @param totalCount 总记录数
     * @return this
     */
    public BackupPolicyListInstancesReturnObj withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set totalPage
     * @param totalPage 总页数
     * @return this
     */
    public BackupPolicyListInstancesReturnObj withTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * set instancePolicies
     * @param instancePolicies 分页明细
     * @return this
     */
    public BackupPolicyListInstancesReturnObj withInstancePolicies(BackupPolicyListInstancesInstancePolicies[] instancePolicies) {
        this.instancePolicies = instancePolicies;
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

    public BackupPolicyListInstancesInstancePolicies[] getInstancePolicies() {
        return instancePolicies;
    }

    public void setInstancePolicies(BackupPolicyListInstancesInstancePolicies[] instancePolicies) {
        this.instancePolicies = instancePolicies;
    }
}
