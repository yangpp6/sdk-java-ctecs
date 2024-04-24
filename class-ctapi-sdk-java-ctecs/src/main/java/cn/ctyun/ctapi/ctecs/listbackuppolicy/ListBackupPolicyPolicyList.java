package cn.ctyun.ctapi.ctecs.listbackuppolicy;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份策略列表>
 * Entity: ListBackupPolicyPolicyList
 */
public class ListBackupPolicyPolicyList {
    /**
     * regionID
     * 资源池ID，您可以调用[regionID](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87)查看最新的天翼云资源池列表
     */
    private String regionID;
    /**
     * status
     * 是否启用策略，取值范围：<br />0：停用，<br />1：启用
     */
    private Integer status;
    /**
     * policyID
     * 云主机备份策略ID
     */
    private String policyID;
    /**
     * policyName
     * 云主机备份策略名称
     */
    private String policyName;
    /**
     * cycleType
     * 云主机备份周期类型，取值范围： <br />day：按天备份<br />week：按星期备份
     */
    private String cycleType;
    /**
     * cycleDay
     * 只有cycleType为day时返回备份周期值
     */
    private Integer cycleDay;
    /**
     * cycleWeek
     * 只有cycleType为week时返回备份周期，取值范围：0-6代表星期日-星期六，如果一周有多天备份，以逗号隔开
     */
    private String cycleWeek;
    /**
     * time
     * 备份整点时间，取值范围：0-23，如果一天内多个时间节点备份，以逗号隔开
     */
    private String time;
    /**
     * retentionType
     * 云主机备份保留类型，取值范围：<br />date：按时间保留，<br />num：按数量保留，<br />all：永久保留
     */
    private String retentionType;
    /**
     * retentionNum
     * 只有retentionType为num时返回保留数量值
     */
    private Integer retentionNum;
    /**
     * retentionDay
     * 只有retentionType为date时返回保留天数值
     */
    private Integer retentionDay;
    /**
     * resourceCount
     * 策略已绑定的云主机数量
     */
    private Integer resourceCount;
    /**
     * resourceIDs
     * 策略已绑定的云主机ID，以逗号分隔
     */
    private String resourceIDs;
    /**
     * repositoryList
     * 策略已绑定的云主机备份库列表
     */
    private ListBackupPolicyRepositoryList[] repositoryList;
    /**
     * projectID
     * 企业项目ID
     */
    private String projectID;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以调用[regionID](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87)查看最新的天翼云资源池列表
     * @return this
     */
    public ListBackupPolicyPolicyList withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set status
     * @param status 是否启用策略，取值范围：<br />0：停用，<br />1：启用
     * @return this
     */
    public ListBackupPolicyPolicyList withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set policyID
     * @param policyID 云主机备份策略ID
     * @return this
     */
    public ListBackupPolicyPolicyList withPolicyID(String policyID) {
        this.policyID = policyID;
        return this;
    }

    /**
     * set policyName
     * @param policyName 云主机备份策略名称
     * @return this
     */
    public ListBackupPolicyPolicyList withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType 云主机备份周期类型，取值范围： <br />day：按天备份<br />week：按星期备份
     * @return this
     */
    public ListBackupPolicyPolicyList withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set cycleDay
     * @param cycleDay 只有cycleType为day时返回备份周期值
     * @return this
     */
    public ListBackupPolicyPolicyList withCycleDay(Integer cycleDay) {
        this.cycleDay = cycleDay;
        return this;
    }

    /**
     * set cycleWeek
     * @param cycleWeek 只有cycleType为week时返回备份周期，取值范围：0-6代表星期日-星期六，如果一周有多天备份，以逗号隔开
     * @return this
     */
    public ListBackupPolicyPolicyList withCycleWeek(String cycleWeek) {
        this.cycleWeek = cycleWeek;
        return this;
    }

    /**
     * set time
     * @param time 备份整点时间，取值范围：0-23，如果一天内多个时间节点备份，以逗号隔开
     * @return this
     */
    public ListBackupPolicyPolicyList withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * set retentionType
     * @param retentionType 云主机备份保留类型，取值范围：<br />date：按时间保留，<br />num：按数量保留，<br />all：永久保留
     * @return this
     */
    public ListBackupPolicyPolicyList withRetentionType(String retentionType) {
        this.retentionType = retentionType;
        return this;
    }

    /**
     * set retentionNum
     * @param retentionNum 只有retentionType为num时返回保留数量值
     * @return this
     */
    public ListBackupPolicyPolicyList withRetentionNum(Integer retentionNum) {
        this.retentionNum = retentionNum;
        return this;
    }

    /**
     * set retentionDay
     * @param retentionDay 只有retentionType为date时返回保留天数值
     * @return this
     */
    public ListBackupPolicyPolicyList withRetentionDay(Integer retentionDay) {
        this.retentionDay = retentionDay;
        return this;
    }

    /**
     * set resourceCount
     * @param resourceCount 策略已绑定的云主机数量
     * @return this
     */
    public ListBackupPolicyPolicyList withResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
        return this;
    }

    /**
     * set resourceIDs
     * @param resourceIDs 策略已绑定的云主机ID，以逗号分隔
     * @return this
     */
    public ListBackupPolicyPolicyList withResourceIDs(String resourceIDs) {
        this.resourceIDs = resourceIDs;
        return this;
    }

    /**
     * set repositoryList
     * @param repositoryList 策略已绑定的云主机备份库列表
     * @return this
     */
    public ListBackupPolicyPolicyList withRepositoryList(ListBackupPolicyRepositoryList[] repositoryList) {
        this.repositoryList = repositoryList;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID
     * @return this
     */
    public ListBackupPolicyPolicyList withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPolicyID() {
        return policyID;
    }

    public void setPolicyID(String policyID) {
        this.policyID = policyID;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getCycleType() {
        return cycleType;
    }

    public void setCycleType(String cycleType) {
        this.cycleType = cycleType;
    }

    public Integer getCycleDay() {
        return cycleDay;
    }

    public void setCycleDay(Integer cycleDay) {
        this.cycleDay = cycleDay;
    }

    public String getCycleWeek() {
        return cycleWeek;
    }

    public void setCycleWeek(String cycleWeek) {
        this.cycleWeek = cycleWeek;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRetentionType() {
        return retentionType;
    }

    public void setRetentionType(String retentionType) {
        this.retentionType = retentionType;
    }

    public Integer getRetentionNum() {
        return retentionNum;
    }

    public void setRetentionNum(Integer retentionNum) {
        this.retentionNum = retentionNum;
    }

    public Integer getRetentionDay() {
        return retentionDay;
    }

    public void setRetentionDay(Integer retentionDay) {
        this.retentionDay = retentionDay;
    }

    public Integer getResourceCount() {
        return resourceCount;
    }

    public void setResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
    }

    public String getResourceIDs() {
        return resourceIDs;
    }

    public void setResourceIDs(String resourceIDs) {
        this.resourceIDs = resourceIDs;
    }

    public ListBackupPolicyRepositoryList[] getRepositoryList() {
        return repositoryList;
    }

    public void setRepositoryList(ListBackupPolicyRepositoryList[] repositoryList) {
        this.repositoryList = repositoryList;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }
}
