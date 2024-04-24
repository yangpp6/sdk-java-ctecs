package cn.ctyun.ctapi.ctecs.snapshotpolicylist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机快照策略列表>
 * Entity: SnapshotPolicyListReturnObj
 */
public class SnapshotPolicyListReturnObj {
    /**
     * snapshotPolicyID
     * 云主机快照策略ID
     */
    private String snapshotPolicyID;
    /**
     * snapshotPolicyStatus
     * 快照策略状态，是否启用，取值范围：0（不启用），<br />1（启用）<br />注：默认值1（启用）
     */
    private Integer snapshotPolicyStatus;
    /**
     * snapshotPolicyName
     * 云主机快照策略名称，满足以下规则：长度为2~63字符，由数字、字母、-组成，只能以字母开头，以数字和字母结尾
     */
    private String snapshotPolicyName;
    /**
     * snapshotTime
     * 快照整点时间，时间取值范围：0~23<br />注：如果一天内多个时间节点备份，以逗号隔开（如11点15点进行快照，则填写"11,15"），默认值0
     */
    private String snapshotTime;
    /**
     * retentionType
     * 云主机快照保留类型，取值范围：<br />date（按时间保存），<br />num（按数量保存）
     */
    private String retentionType;
    /**
     * retentionDay
     * 云主机快照保留天数，快照保留类型为date时返回，否则为空字符串
     */
    private String retentionDay;
    /**
     * retentionNum
     * 云主机快照保留数量，快照保留类型为num时返回，否则为空字符串
     */
    private String retentionNum;
    /**
     * cycleType
     * 云主机快照周期类型，可选：day（天）、week（周）
     */
    private String cycleType;
    /**
     * cycleDay
     * 周期天数，周期类型为day时返回，表示多少天进行快照
     */
    private Integer cycleDay;
    /**
     * cycleWeek
     * 周期星期，周期类型为week时返回，表示周几进行快照，由逗号拼接，由0~6组成，0表示周日
     */
    private String cycleWeek;
    /**
     * resourceCount
     * 绑定云主机数量
     */
    private Integer resourceCount;

    /**
     * set snapshotPolicyID
     * @param snapshotPolicyID 云主机快照策略ID
     * @return this
     */
    public SnapshotPolicyListReturnObj withSnapshotPolicyID(String snapshotPolicyID) {
        this.snapshotPolicyID = snapshotPolicyID;
        return this;
    }

    /**
     * set snapshotPolicyStatus
     * @param snapshotPolicyStatus 快照策略状态，是否启用，取值范围：0（不启用），<br />1（启用）<br />注：默认值1（启用）
     * @return this
     */
    public SnapshotPolicyListReturnObj withSnapshotPolicyStatus(Integer snapshotPolicyStatus) {
        this.snapshotPolicyStatus = snapshotPolicyStatus;
        return this;
    }

    /**
     * set snapshotPolicyName
     * @param snapshotPolicyName 云主机快照策略名称，满足以下规则：长度为2~63字符，由数字、字母、-组成，只能以字母开头，以数字和字母结尾
     * @return this
     */
    public SnapshotPolicyListReturnObj withSnapshotPolicyName(String snapshotPolicyName) {
        this.snapshotPolicyName = snapshotPolicyName;
        return this;
    }

    /**
     * set snapshotTime
     * @param snapshotTime 快照整点时间，时间取值范围：0~23<br />注：如果一天内多个时间节点备份，以逗号隔开（如11点15点进行快照，则填写"11,15"），默认值0
     * @return this
     */
    public SnapshotPolicyListReturnObj withSnapshotTime(String snapshotTime) {
        this.snapshotTime = snapshotTime;
        return this;
    }

    /**
     * set retentionType
     * @param retentionType 云主机快照保留类型，取值范围：<br />date（按时间保存），<br />num（按数量保存）
     * @return this
     */
    public SnapshotPolicyListReturnObj withRetentionType(String retentionType) {
        this.retentionType = retentionType;
        return this;
    }

    /**
     * set retentionDay
     * @param retentionDay 云主机快照保留天数，快照保留类型为date时返回，否则为空字符串
     * @return this
     */
    public SnapshotPolicyListReturnObj withRetentionDay(String retentionDay) {
        this.retentionDay = retentionDay;
        return this;
    }

    /**
     * set retentionNum
     * @param retentionNum 云主机快照保留数量，快照保留类型为num时返回，否则为空字符串
     * @return this
     */
    public SnapshotPolicyListReturnObj withRetentionNum(String retentionNum) {
        this.retentionNum = retentionNum;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType 云主机快照周期类型，可选：day（天）、week（周）
     * @return this
     */
    public SnapshotPolicyListReturnObj withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set cycleDay
     * @param cycleDay 周期天数，周期类型为day时返回，表示多少天进行快照
     * @return this
     */
    public SnapshotPolicyListReturnObj withCycleDay(Integer cycleDay) {
        this.cycleDay = cycleDay;
        return this;
    }

    /**
     * set cycleWeek
     * @param cycleWeek 周期星期，周期类型为week时返回，表示周几进行快照，由逗号拼接，由0~6组成，0表示周日
     * @return this
     */
    public SnapshotPolicyListReturnObj withCycleWeek(String cycleWeek) {
        this.cycleWeek = cycleWeek;
        return this;
    }

    /**
     * set resourceCount
     * @param resourceCount 绑定云主机数量
     * @return this
     */
    public SnapshotPolicyListReturnObj withResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
        return this;
    }

    public String getSnapshotPolicyID() {
        return snapshotPolicyID;
    }

    public void setSnapshotPolicyID(String snapshotPolicyID) {
        this.snapshotPolicyID = snapshotPolicyID;
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

    public String getSnapshotTime() {
        return snapshotTime;
    }

    public void setSnapshotTime(String snapshotTime) {
        this.snapshotTime = snapshotTime;
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

    public Integer getResourceCount() {
        return resourceCount;
    }

    public void setResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
    }
}
