package cn.ctyun.ctapi.ctecs.snapshotpolicytasklist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机快照任务列表>
 * Entity: SnapshotPolicyTaskListReturnObj
 */
public class SnapshotPolicyTaskListReturnObj {
    /**
     * taskID
     * 任务ID
     */
    private String taskID;
    /**
     * taskStatus
     * 任务状态，范围：<br />createSucceeded（创建成功），<br />createFailed（创建失败），<br />deleteSucceeded（删除成功），<br />deleteFailed（删除失败）。
     */
    private String taskStatus;
    /**
     * snapshotStatus
     * 快照状态，范围：<br />pending（创建中），<br />available（可用），<br />unavailable（不可用），<br />error（错误），<br />deleted（已删除）。
     */
    private String snapshotStatus;
    /**
     * instanceID
     * 云主机ID，您可以查看<a href="https://www.ctyun.cn/products/ecs">弹性云主机</a>了解云主机的相关信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8309&data=87">查询云主机列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8281&data=87">创建一台按量付费或包年包月的云主机</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8282&data=87">批量创建按量付费或包年包月云主机</a>
     */
    private String instanceID;
    /**
     * snapshotName
     * 云主机快照名称。满足以下规则：不能使用中文，且长度为2-63字符
     */
    private String snapshotName;
    /**
     * createTime
     * 任务创建时间
     */
    private String createTime;
    /**
     * completeTime
     * 任务完成时间
     */
    private String completeTime;

    /**
     * set taskID
     * @param taskID 任务ID
     * @return this
     */
    public SnapshotPolicyTaskListReturnObj withTaskID(String taskID) {
        this.taskID = taskID;
        return this;
    }

    /**
     * set taskStatus
     * @param taskStatus 任务状态，范围：<br />createSucceeded（创建成功），<br />createFailed（创建失败），<br />deleteSucceeded（删除成功），<br />deleteFailed（删除失败）。
     * @return this
     */
    public SnapshotPolicyTaskListReturnObj withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * set snapshotStatus
     * @param snapshotStatus 快照状态，范围：<br />pending（创建中），<br />available（可用），<br />unavailable（不可用），<br />error（错误），<br />deleted（已删除）。
     * @return this
     */
    public SnapshotPolicyTaskListReturnObj withSnapshotStatus(String snapshotStatus) {
        this.snapshotStatus = snapshotStatus;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 云主机ID，您可以查看<a href="https://www.ctyun.cn/products/ecs">弹性云主机</a>了解云主机的相关信息<br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8309&data=87">查询云主机列表</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8281&data=87">创建一台按量付费或包年包月的云主机</a><br /><span style="background-color: rgb(97, 175, 254);color: rgb(255,255,255);padding: 2px; margin:2px">创</span> <a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8282&data=87">批量创建按量付费或包年包月云主机</a>
     * @return this
     */
    public SnapshotPolicyTaskListReturnObj withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set snapshotName
     * @param snapshotName 云主机快照名称。满足以下规则：不能使用中文，且长度为2-63字符
     * @return this
     */
    public SnapshotPolicyTaskListReturnObj withSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }

    /**
     * set createTime
     * @param createTime 任务创建时间
     * @return this
     */
    public SnapshotPolicyTaskListReturnObj withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set completeTime
     * @param completeTime 任务完成时间
     * @return this
     */
    public SnapshotPolicyTaskListReturnObj withCompleteTime(String completeTime) {
        this.completeTime = completeTime;
        return this;
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getSnapshotStatus() {
        return snapshotStatus;
    }

    public void setSnapshotStatus(String snapshotStatus) {
        this.snapshotStatus = snapshotStatus;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public String getSnapshotName() {
        return snapshotName;
    }

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }
}
