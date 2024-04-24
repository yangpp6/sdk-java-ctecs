package cn.ctyun.ctapi.ctecs.backupvmdetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机备份查询虚机>
 * Entity: BackupVmDetailsVolumes
 */
public class BackupVmDetailsVolumes {
    /**
     * isBootable
     * 是否启动盘
     */
    private Boolean isBootable;
    /**
     * diskSize
     * 云硬盘大小，单位为GB
     */
    private Integer diskSize;
    /**
     * diskType
     * 云硬盘类型，取值范围：<br />SATA：普通IO，<br />SAS：高IO，<br />SSD：超高IO，<br />SSD-genric：通用型SSD，<br />FAST-SSD：极速型SSD
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
     * set isBootable
     * @param isBootable 是否启动盘
     * @return this
     */
    public BackupVmDetailsVolumes withIsBootable(Boolean isBootable) {
        this.isBootable = isBootable;
        return this;
    }

    /**
     * set diskSize
     * @param diskSize 云硬盘大小，单位为GB
     * @return this
     */
    public BackupVmDetailsVolumes withDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    /**
     * set diskType
     * @param diskType 云硬盘类型，取值范围：<br />SATA：普通IO，<br />SAS：高IO，<br />SSD：超高IO，<br />SSD-genric：通用型SSD，<br />FAST-SSD：极速型SSD
     * @return this
     */
    public BackupVmDetailsVolumes withDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * set diskID
     * @param diskID 云硬盘ID
     * @return this
     */
    public BackupVmDetailsVolumes withDiskID(String diskID) {
        this.diskID = diskID;
        return this;
    }

    /**
     * set diskName
     * @param diskName 云硬盘名称
     * @return this
     */
    public BackupVmDetailsVolumes withDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }

    public Boolean getIsBootable() {
        return isBootable;
    }

    public void setIsBootable(Boolean isBootable) {
        this.isBootable = isBootable;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
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
}
