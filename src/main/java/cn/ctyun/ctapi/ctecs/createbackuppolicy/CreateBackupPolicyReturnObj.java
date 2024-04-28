package cn.ctyun.ctapi.ctecs.createbackuppolicy;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建云主机备份策略>
 * Entity: CreateBackupPolicyReturnObj
 */
public class CreateBackupPolicyReturnObj {
    /**
     * status
     * 备份策略状态
     */
    private Integer status;
    /**
     * policyName
     * 备份策略名称
     */
    private String policyName;
    /**
     * retentionType
     * 备份保留类型
     */
    private String retentionType;
    /**
     * retentionDay
     * 保留时间，当retentionType为date时返回
     */
    private Integer retentionDay;
    /**
     * retentionNum
     * 保留数量，当retentionType为num时返回
     */
    private Integer retentionNum;
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * cycleType
     * 备份周期类型
     */
    private String cycleType;
    /**
     * cycleDay
     * cycleType为day时返回备份周期值
     */
    private Integer cycleDay;
    /**
     * cycleWeek
     * cycleType为week时返回备份周期值
     */
    private String cycleWeek;
    /**
     * policyID
     * 备份策略ID
     */
    private String policyID;
    /**
     * time
     * 备份整点时间
     */
    private String time;
    /**
     * projectID
     * 企业项目ID
     */
    private String projectID;

    /**
     * set status
     * @param status 备份策略状态
     * @return this
     */
    public CreateBackupPolicyReturnObj withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set policyName
     * @param policyName 备份策略名称
     * @return this
     */
    public CreateBackupPolicyReturnObj withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * set retentionType
     * @param retentionType 备份保留类型
     * @return this
     */
    public CreateBackupPolicyReturnObj withRetentionType(String retentionType) {
        this.retentionType = retentionType;
        return this;
    }

    /**
     * set retentionDay
     * @param retentionDay 保留时间，当retentionType为date时返回
     * @return this
     */
    public CreateBackupPolicyReturnObj withRetentionDay(Integer retentionDay) {
        this.retentionDay = retentionDay;
        return this;
    }

    /**
     * set retentionNum
     * @param retentionNum 保留数量，当retentionType为num时返回
     * @return this
     */
    public CreateBackupPolicyReturnObj withRetentionNum(Integer retentionNum) {
        this.retentionNum = retentionNum;
        return this;
    }

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public CreateBackupPolicyReturnObj withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType 备份周期类型
     * @return this
     */
    public CreateBackupPolicyReturnObj withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set cycleDay
     * @param cycleDay cycleType为day时返回备份周期值
     * @return this
     */
    public CreateBackupPolicyReturnObj withCycleDay(Integer cycleDay) {
        this.cycleDay = cycleDay;
        return this;
    }

    /**
     * set cycleWeek
     * @param cycleWeek cycleType为week时返回备份周期值
     * @return this
     */
    public CreateBackupPolicyReturnObj withCycleWeek(String cycleWeek) {
        this.cycleWeek = cycleWeek;
        return this;
    }

    /**
     * set policyID
     * @param policyID 备份策略ID
     * @return this
     */
    public CreateBackupPolicyReturnObj withPolicyID(String policyID) {
        this.policyID = policyID;
        return this;
    }

    /**
     * set time
     * @param time 备份整点时间
     * @return this
     */
    public CreateBackupPolicyReturnObj withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID
     * @return this
     */
    public CreateBackupPolicyReturnObj withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getRetentionType() {
        return retentionType;
    }

    public void setRetentionType(String retentionType) {
        this.retentionType = retentionType;
    }

    public Integer getRetentionDay() {
        return retentionDay;
    }

    public void setRetentionDay(Integer retentionDay) {
        this.retentionDay = retentionDay;
    }

    public Integer getRetentionNum() {
        return retentionNum;
    }

    public void setRetentionNum(Integer retentionNum) {
        this.retentionNum = retentionNum;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
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

    public String getPolicyID() {
        return policyID;
    }

    public void setPolicyID(String policyID) {
        this.policyID = policyID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }
}
