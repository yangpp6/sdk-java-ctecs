package cn.ctyun.ctapi.ctecs.ecsvolumeshow;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询已将创建好的云硬盘>
 * Entity: EcsVolumeShowAttachments
 */
public class EcsVolumeShowAttachments {
    /**
     * instanceUUID
     * 绑定云主机ID
     */
    private String instanceUUID;
    /**
     * attachmentID
     * 挂载ID
     */
    private String attachmentID;
    /**
     * device
     * 挂载设备名，比如/dev/sda
     */
    private String device;

    /**
     * set instanceUUID
     * @param instanceUUID 绑定云主机ID
     * @return this
     */
    public EcsVolumeShowAttachments withInstanceUUID(String instanceUUID) {
        this.instanceUUID = instanceUUID;
        return this;
    }

    /**
     * set attachmentID
     * @param attachmentID 挂载ID
     * @return this
     */
    public EcsVolumeShowAttachments withAttachmentID(String attachmentID) {
        this.attachmentID = attachmentID;
        return this;
    }

    /**
     * set device
     * @param device 挂载设备名，比如/dev/sda
     * @return this
     */
    public EcsVolumeShowAttachments withDevice(String device) {
        this.device = device;
        return this;
    }

    public String getInstanceUUID() {
        return instanceUUID;
    }

    public void setInstanceUUID(String instanceUUID) {
        this.instanceUUID = instanceUUID;
    }

    public String getAttachmentID() {
        return attachmentID;
    }

    public void setAttachmentID(String attachmentID) {
        this.attachmentID = attachmentID;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }
}
