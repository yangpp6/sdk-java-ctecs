package cn.ctyun.ctapi.ctecs.createbackuppolicy;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建云主机备份策略>
 * Entity: CreateBackupPolicyRequestBody
 */
public class CreateBackupPolicyRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * policyName
     * 云主机备份策略名称。满足以下规则：只能由数字、英文字母、中划线-、下划线_、点.组成，长度为2-64字符<br />注：在所有资源池不可重复
     */
    private String policyName;
    /**
     * cycleType
     * 云主机备份周期类型，取值范围：day（按天备份）week（按星期备份）
     */
    private String cycleType;
    /**
     * cycleDay
     * 备份周期（天），取值范围：[1, 30]，默认值为1  <br />注：cycleType为day时需设置
     */
    private Integer cycleDay;
    /**
     * cycleWeek
     * 备份周期（星期），星期取值范围：0~6（代表周几，其中0为周日），默认值是0<br />注：只有cycleType为week时需设置；<br />如果一周有多天备份，以逗号隔开（如周日周三进行快照，则填写"0,3"）
     */
    private String cycleWeek;
    /**
     * time
     * 备份整点时间，时间取值范围：0~23<br />注：如果一天内多个时间节点备份，以逗号隔开（如11点15点进行快照，则填写"11,15"），默认值12
     */
    private String time;
    /**
     * status
     * 备份策略状态，是否启用，取值范围：<br />0（不启用），<br />1（启用）<br />注：默认值0（不启用）
     */
    private Integer status;
    /**
     * retentionType
     * 云主机备份保留类型，取值范围：<br />date（按时间保存），<br />num（按数量保存），<br />all（永久保存）
     */
    private String retentionType;
    /**
     * retentionDay
     * 云主机备份保留天数，单位为天，取值范围：[1, 99999] ，默认值1<br />注：retentionType为date时必填
     */
    private Integer retentionDay;
    /**
     * retentionNum
     * 云主机备份保留数量，取值范围：[1, 99999]，默认值1<br />注：retentionType为num时必填
     */
    private Integer retentionNum;
    /**
     * projectID
     * 企业项目ID，企业项目管理服务提供统一的云资源按企业项目管理，以及企业项目内的资源管理，成员管理。您可以通过查看<a href="https://www.ctyun.cn/document/10026730/10238876">创建企业项目</a>了解如何创建企业项目<br />注：默认值为"0"
     */
    private String projectID;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public CreateBackupPolicyRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set policyName
     * @param policyName 云主机备份策略名称。满足以下规则：只能由数字、英文字母、中划线-、下划线_、点.组成，长度为2-64字符<br />注：在所有资源池不可重复
     * @return this
     */
    public CreateBackupPolicyRequestBody withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType 云主机备份周期类型，取值范围：day（按天备份）week（按星期备份）
     * @return this
     */
    public CreateBackupPolicyRequestBody withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set cycleDay
     * @param cycleDay 备份周期（天），取值范围：[1, 30]，默认值为1  <br />注：cycleType为day时需设置
     * @return this
     */
    public CreateBackupPolicyRequestBody withCycleDay(Integer cycleDay) {
        this.cycleDay = cycleDay;
        return this;
    }

    /**
     * set cycleWeek
     * @param cycleWeek 备份周期（星期），星期取值范围：0~6（代表周几，其中0为周日），默认值是0<br />注：只有cycleType为week时需设置；<br />如果一周有多天备份，以逗号隔开（如周日周三进行快照，则填写"0,3"）
     * @return this
     */
    public CreateBackupPolicyRequestBody withCycleWeek(String cycleWeek) {
        this.cycleWeek = cycleWeek;
        return this;
    }

    /**
     * set time
     * @param time 备份整点时间，时间取值范围：0~23<br />注：如果一天内多个时间节点备份，以逗号隔开（如11点15点进行快照，则填写"11,15"），默认值12
     * @return this
     */
    public CreateBackupPolicyRequestBody withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * set status
     * @param status 备份策略状态，是否启用，取值范围：<br />0（不启用），<br />1（启用）<br />注：默认值0（不启用）
     * @return this
     */
    public CreateBackupPolicyRequestBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set retentionType
     * @param retentionType 云主机备份保留类型，取值范围：<br />date（按时间保存），<br />num（按数量保存），<br />all（永久保存）
     * @return this
     */
    public CreateBackupPolicyRequestBody withRetentionType(String retentionType) {
        this.retentionType = retentionType;
        return this;
    }

    /**
     * set retentionDay
     * @param retentionDay 云主机备份保留天数，单位为天，取值范围：[1, 99999] ，默认值1<br />注：retentionType为date时必填
     * @return this
     */
    public CreateBackupPolicyRequestBody withRetentionDay(Integer retentionDay) {
        this.retentionDay = retentionDay;
        return this;
    }

    /**
     * set retentionNum
     * @param retentionNum 云主机备份保留数量，取值范围：[1, 99999]，默认值1<br />注：retentionType为num时必填
     * @return this
     */
    public CreateBackupPolicyRequestBody withRetentionNum(Integer retentionNum) {
        this.retentionNum = retentionNum;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID，企业项目管理服务提供统一的云资源按企业项目管理，以及企业项目内的资源管理，成员管理。您可以通过查看<a href="https://www.ctyun.cn/document/10026730/10238876">创建企业项目</a>了解如何创建企业项目<br />注：默认值为"0"
     * @return this
     */
    public CreateBackupPolicyRequestBody withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
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

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }
}
