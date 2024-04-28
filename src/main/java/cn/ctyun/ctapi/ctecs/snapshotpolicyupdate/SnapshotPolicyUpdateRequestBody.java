package cn.ctyun.ctapi.ctecs.snapshotpolicyupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-修改云主机快照策略>
 * Entity: SnapshotPolicyUpdateRequestBody
 */
public class SnapshotPolicyUpdateRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * snapshotPolicyID
     * 云主机快照策略ID，32字节<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9600&data=87">查询云主机快照策略列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9588&data=87">创建云主机快照策略</a>
     */
    private String snapshotPolicyID;
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
     * cycleType
     * 云主机快照周期类型，取值范围：<br />day（天），<br />week（周）
     */
    private String cycleType;
    /**
     * cycleDay
     * 快照周期（天），取值范围：[1, 10] <br />注：cycleType为day时需设置
     */
    private Integer cycleDay;
    /**
     * cycleWeek
     * 快照周期（星期），星期取值范围：0~6（代表周几，其中0为周日）<br />注：只有cycleType为week时需设置；<br />如果一周有多天备份，以逗号隔开（如周日周三进行快照，则填写"0,3"）
     */
    private String cycleWeek;
    /**
     * retentionType
     * 云主机快照保留类型，取值范围：<br />date（按时间保存），<br />num（按数量保存）
     */
    private String retentionType;
    /**
     * retentionDay
     * 云主机快照保留天数，单位为天，取值范围：[1, 365] <br />注：retentionType为date时必填
     */
    private Integer retentionDay;
    /**
     * retentionNum
     * 云主机快照保留数量，取值范围：[1, 30]<br />注：retentionType为num时必填
     */
    private Integer retentionNum;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public SnapshotPolicyUpdateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set snapshotPolicyID
     * @param snapshotPolicyID 云主机快照策略ID，32字节<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9600&data=87">查询云主机快照策略列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9588&data=87">创建云主机快照策略</a>
     * @return this
     */
    public SnapshotPolicyUpdateRequestBody withSnapshotPolicyID(String snapshotPolicyID) {
        this.snapshotPolicyID = snapshotPolicyID;
        return this;
    }

    /**
     * set snapshotPolicyName
     * @param snapshotPolicyName 云主机快照策略名称，满足以下规则：长度为2~63字符，由数字、字母、-组成，只能以字母开头，以数字和字母结尾
     * @return this
     */
    public SnapshotPolicyUpdateRequestBody withSnapshotPolicyName(String snapshotPolicyName) {
        this.snapshotPolicyName = snapshotPolicyName;
        return this;
    }

    /**
     * set snapshotTime
     * @param snapshotTime 快照整点时间，时间取值范围：0~23<br />注：如果一天内多个时间节点备份，以逗号隔开（如11点15点进行快照，则填写"11,15"），默认值0
     * @return this
     */
    public SnapshotPolicyUpdateRequestBody withSnapshotTime(String snapshotTime) {
        this.snapshotTime = snapshotTime;
        return this;
    }

    /**
     * set cycleType
     * @param cycleType 云主机快照周期类型，取值范围：<br />day（天），<br />week（周）
     * @return this
     */
    public SnapshotPolicyUpdateRequestBody withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * set cycleDay
     * @param cycleDay 快照周期（天），取值范围：[1, 10] <br />注：cycleType为day时需设置
     * @return this
     */
    public SnapshotPolicyUpdateRequestBody withCycleDay(Integer cycleDay) {
        this.cycleDay = cycleDay;
        return this;
    }

    /**
     * set cycleWeek
     * @param cycleWeek 快照周期（星期），星期取值范围：0~6（代表周几，其中0为周日）<br />注：只有cycleType为week时需设置；<br />如果一周有多天备份，以逗号隔开（如周日周三进行快照，则填写"0,3"）
     * @return this
     */
    public SnapshotPolicyUpdateRequestBody withCycleWeek(String cycleWeek) {
        this.cycleWeek = cycleWeek;
        return this;
    }

    /**
     * set retentionType
     * @param retentionType 云主机快照保留类型，取值范围：<br />date（按时间保存），<br />num（按数量保存）
     * @return this
     */
    public SnapshotPolicyUpdateRequestBody withRetentionType(String retentionType) {
        this.retentionType = retentionType;
        return this;
    }

    /**
     * set retentionDay
     * @param retentionDay 云主机快照保留天数，单位为天，取值范围：[1, 365] <br />注：retentionType为date时必填
     * @return this
     */
    public SnapshotPolicyUpdateRequestBody withRetentionDay(Integer retentionDay) {
        this.retentionDay = retentionDay;
        return this;
    }

    /**
     * set retentionNum
     * @param retentionNum 云主机快照保留数量，取值范围：[1, 30]<br />注：retentionType为num时必填
     * @return this
     */
    public SnapshotPolicyUpdateRequestBody withRetentionNum(Integer retentionNum) {
        this.retentionNum = retentionNum;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getSnapshotPolicyID() {
        return snapshotPolicyID;
    }

    public void setSnapshotPolicyID(String snapshotPolicyID) {
        this.snapshotPolicyID = snapshotPolicyID;
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
