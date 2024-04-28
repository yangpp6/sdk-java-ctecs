package cn.ctyun.ctapi.ctecs.snapshotcreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建云主机快照>
 * Entity: SnapshotCreateReturnObj
 */
public class SnapshotCreateReturnObj {
    /**
     * jobID
     * 任务ID
     */
    private String jobID;
    /**
     * snapshotStatus
     * 云主机快照状态，<br />pending: 创建中, <br />available: 可用， <br />restoring: 恢复中，<br />error：错误
     */
    private String snapshotStatus;
    /**
     * instanceID
     * 云主机ID
     */
    private String instanceID;
    /**
     * instanceName
     * 云主机名称
     */
    private String instanceName;
    /**
     * snapshotID
     * 云主机快照ID
     */
    private String snapshotID;
    /**
     * projectID
     * 企业项目ID
     */
    private String projectID;
    /**
     * snapshotName
     * 云主机快照名称
     */
    private String snapshotName;

    /**
     * set jobID
     * @param jobID 任务ID
     * @return this
     */
    public SnapshotCreateReturnObj withJobID(String jobID) {
        this.jobID = jobID;
        return this;
    }

    /**
     * set snapshotStatus
     * @param snapshotStatus 云主机快照状态，<br />pending: 创建中, <br />available: 可用， <br />restoring: 恢复中，<br />error：错误
     * @return this
     */
    public SnapshotCreateReturnObj withSnapshotStatus(String snapshotStatus) {
        this.snapshotStatus = snapshotStatus;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public SnapshotCreateReturnObj withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set instanceName
     * @param instanceName 云主机名称
     * @return this
     */
    public SnapshotCreateReturnObj withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set snapshotID
     * @param snapshotID 云主机快照ID
     * @return this
     */
    public SnapshotCreateReturnObj withSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
        return this;
    }

    /**
     * set projectID
     * @param projectID 企业项目ID
     * @return this
     */
    public SnapshotCreateReturnObj withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * set snapshotName
     * @param snapshotName 云主机快照名称
     * @return this
     */
    public SnapshotCreateReturnObj withSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
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

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getSnapshotID() {
        return snapshotID;
    }

    public void setSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getSnapshotName() {
        return snapshotName;
    }

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }
}
