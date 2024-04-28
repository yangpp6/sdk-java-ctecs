package cn.ctyun.ctapi.ctecs.snapshotpolicyenable;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-启用云主机快照策略>
 * Entity: SnapshotPolicyEnableReturnObj
 */
public class SnapshotPolicyEnableReturnObj {
    /**
     * snapshotPolicyStatus
     * 快照策略状态，是否启用，取值范围：0（不启用），<br />1（启用）<br />）
     */
    private Integer snapshotPolicyStatus;
    /**
     * snapshotPolicyName
     * 云主机快照策略名称，满足以下规则：长度为2~63字符，由数字、字母、-组成，只能以字母开头，以数字和字母结尾
     */
    private String snapshotPolicyName;
    /**
     * retentionType
     * 云主机快照保留类型，取值范围：<br />date（按时间保存），<br />num（按数量保存）
     */
    private String retentionType;
    /**
     * retentionDay
     * 保留天数，当retentionType为date时返回，否则为空字符串
     */
    private String retentionDay;
    /**
     * retentionNum
     * 保留数量，当retentionType为num时返回，否则为空字符串
     */
    private String retentionNum;
    /**
     * cycleType
     * 备份周期类型，day-按天备份，week-按星期备份
     */
    private String cycleType;
    /**
     * cycleDay
     * 快照周期值，cycleType为day时返回
     */
    private String cycleDay;
    /**
     * cycleWeek
     * 快照周期值，cycleType为week时返回，则取值范围0-6代表星期日-星期六，如果一周有多天备份，以逗号隔开
     */
    private String cycleWeek;
    /**
     * snapshotPolicyID
     * 云主机快照策略ID，32字节<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9600&data=87">查询云主机快照策略列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9588&data=87">创建云主机快照策略</a>
     */
    private String snapshotPolicyID;
    /**
     * snapshotTime
     * 快照整点时间，时间取值范围：0~23<br />注：如果一天内多个时间节点备份，以逗号隔开（如11点15点进行快照，则填写"11,15"），默认值0
     */
    private String snapshotTime;

    /**
     * set snapshotPolicyStatus
     * @param snapshotPolicyStatus 快照策略状态，是否启用，取值范围：0（不启用），<br />1（启用）<br />）
     * @return this
     */
    public SnapshotPolicyEnableReturnObj withSnapshotPolicyStatus(Integer snapshotPolicyStatus) {
        this.snapshotPolicyStatus = snapshotPolicyStatus;
        return this;
    }

    /**
     * set snapshotPolicyName
     * @param snapshotPolicyName 云主机快照策略名称，满足以下规则：长度为2~63字符，由数字、字母、-组成，只能以字母开头，以数字和字母结尾
     * @return this
     */
    public SnapshotPolicyEnableReturnObj withSnapshotPolicyName(String snapshotPolicyName) {
        this.snapshotPolicyName = snapshotPolicyName;
        return this;
    }

    /**
     * set retentionType
     * @param retentionType 云主机快照保留类型，取值范围：<br />date（按时间保存），<br />num（按数量保存）
     * @return this
     */
    public SnapshotPolicyEnableReturnObj withRetentionType(String retentionType) {
        this.retentionType = retentionType;
        return this;
    }

    /**
     * set retentionDay
     * @param retentionDay 保留天数，当retentionType为date时返回，否则为空字符串
     * @return this
     */
    public SnapshotPolicyEnableReturnObj withRetentionDay(String retentionDay) {
        this.retentionDay = retentionDay;
        return this;
    }

    /**
     * set retentionNum
     * @param retentionNum 保留数量，当retentionType为num时返回，否则为空字符串
     * @return this
     */
    public SnapshotPolicyEnableReturnObj withRetentionNum(String retentionNum) {
        this.retentionNum = retentionNum;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType 备份周期类型，day-按天备份，week-按星期备份
     * @return this
     */
    public SnapshotPolicyEnableReturnObj withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set cycleDay
     * @param cycleDay 快照周期值，cycleType为day时返回
     * @return this
     */
    public SnapshotPolicyEnableReturnObj withCycleDay(String cycleDay) {
        this.cycleDay = cycleDay;
        return this;
    }

    /**
     * set cycleWeek
     * @param cycleWeek 快照周期值，cycleType为week时返回，则取值范围0-6代表星期日-星期六，如果一周有多天备份，以逗号隔开
     * @return this
     */
    public SnapshotPolicyEnableReturnObj withCycleWeek(String cycleWeek) {
        this.cycleWeek = cycleWeek;
        return this;
    }

    /**
     * set snapshotPolicyID
     * @param snapshotPolicyID 云主机快照策略ID，32字节<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9600&data=87">查询云主机快照策略列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9588&data=87">创建云主机快照策略</a>
     * @return this
     */
    public SnapshotPolicyEnableReturnObj withSnapshotPolicyID(String snapshotPolicyID) {
        this.snapshotPolicyID = snapshotPolicyID;
        return this;
    }

    /**
     * set snapshotTime
     * @param snapshotTime 快照整点时间，时间取值范围：0~23<br />注：如果一天内多个时间节点备份，以逗号隔开（如11点15点进行快照，则填写"11,15"），默认值0
     * @return this
     */
    public SnapshotPolicyEnableReturnObj withSnapshotTime(String snapshotTime) {
        this.snapshotTime = snapshotTime;
        return this;
    }

    public Integer getSnapshotPolicyStatus() {
        return snapshotPolicyStatus;
    }

    public void setSnapshotPolicyStatus(Integer snapshotPolicyStatus) {
        this.snapshotPolicyStatus = snapshotPolicyStatus;
    }

    public String getSnapshotPolicyName() {
        return snapshotPolicyName;
    }

    public void setSnapshotPolicyName(String snapshotPolicyName) {
        this.snapshotPolicyName = snapshotPolicyName;
    }

    public String getRetentionType() {
        return retentionType;
    }

    public void setRetentionType(String retentionType) {
        this.retentionType = retentionType;
    }

    public String getRetentionDay() {
        return retentionDay;
    }

    public void setRetentionDay(String retentionDay) {
        this.retentionDay = retentionDay;
    }

    public String getRetentionNum() {
        return retentionNum;
    }

    public void setRetentionNum(String retentionNum) {
        this.retentionNum = retentionNum;
    }

    public String getCycleType() {
        return cycleType;
    }

    public void setCycleType(String cycleType) {
        this.cycleType = cycleType;
    }

    public String getCycleDay() {
        return cycleDay;
    }

    public void setCycleDay(String cycleDay) {
        this.cycleDay = cycleDay;
    }

    public String getCycleWeek() {
        return cycleWeek;
    }

    public void setCycleWeek(String cycleWeek) {
        this.cycleWeek = cycleWeek;
    }

    public String getSnapshotPolicyID() {
        return snapshotPolicyID;
    }

    public void setSnapshotPolicyID(String snapshotPolicyID) {
        this.snapshotPolicyID = snapshotPolicyID;
    }

    public String getSnapshotTime() {
        return snapshotTime;
    }

    public void setSnapshotTime(String snapshotTime) {
        this.snapshotTime = snapshotTime;
    }
}
