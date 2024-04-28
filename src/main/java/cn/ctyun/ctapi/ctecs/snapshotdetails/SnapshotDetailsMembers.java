package cn.ctyun.ctapi.ctecs.snapshotdetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-获取云主机快照详情>
 * Entity: SnapshotDetailsMembers
 */
public class SnapshotDetailsMembers {
    /**
     * diskType
     * 云硬盘类型 SATA/SAS/SSD-genric/SSD/FAST-SSD
     */
    private String diskType;
    /**
     * diskID
     * 云硬盘ID
     */
    private String diskID;
    /**
     * diskName
     * 云硬盘名称
     */
    private String diskName;
    /**
     * isBootable
     * 是否是可启动磁盘,取值范围：<br /> false：非启动盘<br /> true：可启动盘<br />
     */
    private Boolean isBootable;
    /**
     * isEncrypt
     * 是否加密盘，取值范围：<br /> false：不加密，<br />true：加密，<br /> 默认值为false
     */
    private Boolean isEncrypt;
    /**
     * diskSize
     * 云硬盘大小
     */
    private Integer diskSize;
    /**
     * diskSnapshotID
     * 云硬盘快照ID
     */
    private String diskSnapshotID;
    /**
     * diskSnapshotStatus
     * 云硬盘快照状态
     */
    private String diskSnapshotStatus;

    /**
     * set diskType
     * @param diskType 云硬盘类型 SATA/SAS/SSD-genric/SSD/FAST-SSD
     * @return this
     */
    public SnapshotDetailsMembers withDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * set diskID
     * @param diskID 云硬盘ID
     * @return this
     */
    public SnapshotDetailsMembers withDiskID(String diskID) {
        this.diskID = diskID;
        return this;
    }

    /**
     * set diskName
     * @param diskName 云硬盘名称
     * @return this
     */
    public SnapshotDetailsMembers withDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }

    /**
     * set isBootable
     * @param isBootable 是否是可启动磁盘,取值范围：<br /> false：非启动盘<br /> true：可启动盘<br />
     * @return this
     */
    public SnapshotDetailsMembers withIsBootable(Boolean isBootable) {
        this.isBootable = isBootable;
        return this;
    }

    /**
     * set isEncrypt
     * @param isEncrypt 是否加密盘，取值范围：<br /> false：不加密，<br />true：加密，<br /> 默认值为false
     * @return this
     */
    public SnapshotDetailsMembers withIsEncrypt(Boolean isEncrypt) {
        this.isEncrypt = isEncrypt;
        return this;
    }

    /**
     * set diskSize
     * @param diskSize 云硬盘大小
     * @return this
     */
    public SnapshotDetailsMembers withDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    /**
     * set diskSnapshotID
     * @param diskSnapshotID 云硬盘快照ID
     * @return this
     */
    public SnapshotDetailsMembers withDiskSnapshotID(String diskSnapshotID) {
        this.diskSnapshotID = diskSnapshotID;
        return this;
    }

    /**
     * set diskSnapshotStatus
     * @param diskSnapshotStatus 云硬盘快照状态
     * @return this
     */
    public SnapshotDetailsMembers withDiskSnapshotStatus(String diskSnapshotStatus) {
        this.diskSnapshotStatus = diskSnapshotStatus;
        return this;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public String getDiskID() {
        return diskID;
    }

    public void setDiskID(String diskID) {
        this.diskID = diskID;
    }

    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public Boolean getIsBootable() {
        return isBootable;
    }

    public void setIsBootable(Boolean isBootable) {
        this.isBootable = isBootable;
    }

    public Boolean getIsEncrypt() {
        return isEncrypt;
    }

    public void setIsEncrypt(Boolean isEncrypt) {
        this.isEncrypt = isEncrypt;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    public String getDiskSnapshotID() {
        return diskSnapshotID;
    }

    public void setDiskSnapshotID(String diskSnapshotID) {
        this.diskSnapshotID = diskSnapshotID;
    }

    public String getDiskSnapshotStatus() {
        return diskSnapshotStatus;
    }

    public void setDiskSnapshotStatus(String diskSnapshotStatus) {
        this.diskSnapshotStatus = diskSnapshotStatus;
    }
}
