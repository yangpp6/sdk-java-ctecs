package cn.ctyun.ctapi.ctecs.updatebackuppolicy;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-修改启用停用云主机备份策略>
 * Entity: UpdateBackupPolicyRequestBody
 */
public class UpdateBackupPolicyRequestBody {
    /**
     * regionID
     * 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>查看最新的天翼云资源池列表
     */
    private String regionID;
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
     * 备份周期，只有cycleType为day时需设置,取值范围：1-30，默认值为1
     */
    private Integer cycleDay;
    /**
     * cycleWeek
     * 备份周期，只有cycleType为week时需设置，取值范围: 0-6表示星期日-星期六，如果一周有多天备份，以逗号隔开
     */
    private String cycleWeek;
    /**
     * time
     * 备份整点时间，取值范围：<br />0-23，如果一天内多个时间节点备份，以逗号隔开
     */
    private String time;
    /**
     * status
     * 是否启用策略，取值范围：<br />0：停用，<br />1：启用，<br />默认值为0
     */
    private Integer status;
    /**
     * retentionType
     * 云主机备份保留类型，取值范围：<br />date：按时间保留，<br />num：按数量保留，<br />all：永久保留
     */
    private String retentionType;
    /**
     * retentionDay
     * 保留天数，只有retentionType为date时需设置，取值范围：1-99999
     */
    private Integer retentionDay;
    /**
     * retentionNum
     * 保留数量，只有retentionType为num时需设置,取值范围：1-99999
     */
    private Integer retentionNum;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>查看最新的天翼云资源池列表
     * @return this
     */
    public UpdateBackupPolicyRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set policyID
     * @param policyID 云主机备份策略ID
     * @return this
     */
    public UpdateBackupPolicyRequestBody withPolicyID(String policyID) {
        this.policyID = policyID;
        return this;
    }

    /**
     * set policyName
     * @param policyName 云主机备份策略名称
     * @return this
     */
    public UpdateBackupPolicyRequestBody withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType 云主机备份周期类型，取值范围： <br />day：按天备份<br />week：按星期备份
     * @return this
     */
    public UpdateBackupPolicyRequestBody withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set cycleDay
     * @param cycleDay 备份周期，只有cycleType为day时需设置,取值范围：1-30，默认值为1
     * @return this
     */
    public UpdateBackupPolicyRequestBody withCycleDay(Integer cycleDay) {
        this.cycleDay = cycleDay;
        return this;
    }

    /**
     * set cycleWeek
     * @param cycleWeek 备份周期，只有cycleType为week时需设置，取值范围: 0-6表示星期日-星期六，如果一周有多天备份，以逗号隔开
     * @return this
     */
    public UpdateBackupPolicyRequestBody withCycleWeek(String cycleWeek) {
        this.cycleWeek = cycleWeek;
        return this;
    }

    /**
     * set time
     * @param time 备份整点时间，取值范围：<br />0-23，如果一天内多个时间节点备份，以逗号隔开
     * @return this
     */
    public UpdateBackupPolicyRequestBody withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * set status
     * @param status 是否启用策略，取值范围：<br />0：停用，<br />1：启用，<br />默认值为0
     * @return this
     */
    public UpdateBackupPolicyRequestBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set retentionType
     * @param retentionType 云主机备份保留类型，取值范围：<br />date：按时间保留，<br />num：按数量保留，<br />all：永久保留
     * @return this
     */
    public UpdateBackupPolicyRequestBody withRetentionType(String retentionType) {
        this.retentionType = retentionType;
        return this;
    }

    /**
     * set retentionDay
     * @param retentionDay 保留天数，只有retentionType为date时需设置，取值范围：1-99999
     * @return this
     */
    public UpdateBackupPolicyRequestBody withRetentionDay(Integer retentionDay) {
        this.retentionDay = retentionDay;
        return this;
    }

    /**
     * set retentionNum
     * @param retentionNum 保留数量，只有retentionType为num时需设置,取值范围：1-99999
     * @return this
     */
    public UpdateBackupPolicyRequestBody withRetentionNum(Integer retentionNum) {
        this.retentionNum = retentionNum;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
}
