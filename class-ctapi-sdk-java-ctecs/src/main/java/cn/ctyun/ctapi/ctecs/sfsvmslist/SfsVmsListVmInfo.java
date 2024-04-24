package cn.ctyun.ctapi.ctecs.sfsvmslist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询文件系统关联虚机列表>
 * Entity: SfsVmsListVmInfo
 */
public class SfsVmsListVmInfo {
    /**
     * instanceStatus
     * 虚机状态
     */
    private String instanceStatus;
    /**
     * displayName
     * 虚机展示名称
     */
    private String displayName;
    /**
     * instanceName
     * 名称
     */
    private String instanceName;
    /**
     * imageName
     * 镜像名称
     */
    private String imageName;
    /**
     * instanceID
     * 虚机ID
     */
    private String instanceID;
    /**
     * projectID
     * 项目ID
     */
    private String projectID;

    /**
     * set instanceStatus
     * @param instanceStatus 虚机状态
     * @return this
     */
    public SfsVmsListVmInfo withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * set displayName
     * @param displayName 虚机展示名称
     * @return this
     */
    public SfsVmsListVmInfo withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * set instanceName
     * @param instanceName 名称
     * @return this
     */
    public SfsVmsListVmInfo withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set imageName
     * @param imageName 镜像名称
     * @return this
     */
    public SfsVmsListVmInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * set instanceID
     * @param instanceID 虚机ID
     * @return this
     */
    public SfsVmsListVmInfo withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set projectID
     * @param projectID 项目ID
     * @return this
     */
    public SfsVmsListVmInfo withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }
}
