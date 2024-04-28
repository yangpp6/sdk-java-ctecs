package cn.ctyun.ctapi.ctecs.volumeshow;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <云硬盘信息查询>
 * Entity: VolumeShowAttachments
 */
public class VolumeShowAttachments {
    /**
     * instanceID
     * 绑定云主机实例UUID
     */
    private String instanceID;
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
     * set instanceID
     * @param instanceID 绑定云主机实例UUID
     * @return this
     */
    public VolumeShowAttachments withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set attachmentID
     * @param attachmentID 挂载ID
     * @return this
     */
    public VolumeShowAttachments withAttachmentID(String attachmentID) {
        this.attachmentID = attachmentID;
        return this;
    }

    /**
     * set device
     * @param device 挂载设备名，比如/dev/sda
     * @return this
     */
    public VolumeShowAttachments withDevice(String device) {
        this.device = device;
        return this;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
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
