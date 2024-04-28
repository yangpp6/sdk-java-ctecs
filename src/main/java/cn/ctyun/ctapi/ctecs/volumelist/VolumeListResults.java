package cn.ctyun.ctapi.ctecs.volumelist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机的云硬盘列表>
 * Entity: VolumeListResults
 */
public class VolumeListResults {
    /**
     * diskMode
     * 云硬盘属性，取值范围：<br />FCSAN（光纤通道协议的SAN网络），<br />ISCSI（小型计算机系统接口），<br />VBD（虚拟块存储设备）
     */
    private String diskMode;
    /**
     * diskID
     * 云硬盘ID
     */
    private String diskID;
    /**
     * diskType
     * 云硬盘类型，取值范围：<br />数据盘，<br />系统盘
     */
    private String diskType;
    /**
     * isEncrypt
     * 云硬盘加密标志，取值范围：<br />true（加密），<br />false（未加密）
     */
    private Boolean isEncrypt;
    /**
     * diskDataType
     * 云硬盘类型，取值范围：<br />SATA（普通IO），<br />SAS（高IO），<br />SSD（超高IO），<br />SSD-genric（通用型SSD），<br />FAST-SSD（极速型SSD）
     */
    private String diskDataType;
    /**
     * diskSize
     * 云硬盘容量大小，单位GB
     */
    private Integer diskSize;

    /**
     * set diskMode
     * @param diskMode 云硬盘属性，取值范围：<br />FCSAN（光纤通道协议的SAN网络），<br />ISCSI（小型计算机系统接口），<br />VBD（虚拟块存储设备）
     * @return this
     */
    public VolumeListResults withDiskMode(String diskMode) {
        this.diskMode = diskMode;
        return this;
    }

    /**
     * set diskID
     * @param diskID 云硬盘ID
     * @return this
     */
    public VolumeListResults withDiskID(String diskID) {
        this.diskID = diskID;
        return this;
    }

    /**
     * set diskType
     * @param diskType 云硬盘类型，取值范围：<br />数据盘，<br />系统盘
     * @return this
     */
    public VolumeListResults withDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * set isEncrypt
     * @param isEncrypt 云硬盘加密标志，取值范围：<br />true（加密），<br />false（未加密）
     * @return this
     */
    public VolumeListResults withIsEncrypt(Boolean isEncrypt) {
        this.isEncrypt = isEncrypt;
        return this;
    }

    /**
     * set diskDataType
     * @param diskDataType 云硬盘类型，取值范围：<br />SATA（普通IO），<br />SAS（高IO），<br />SSD（超高IO），<br />SSD-genric（通用型SSD），<br />FAST-SSD（极速型SSD）
     * @return this
     */
    public VolumeListResults withDiskDataType(String diskDataType) {
        this.diskDataType = diskDataType;
        return this;
    }

    /**
     * set diskSize
     * @param diskSize 云硬盘容量大小，单位GB
     * @return this
     */
    public VolumeListResults withDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    public String getDiskMode() {
        return diskMode;
    }

    public void setDiskMode(String diskMode) {
        this.diskMode = diskMode;
    }

    public String getDiskID() {
        return diskID;
    }

    public void setDiskID(String diskID) {
        this.diskID = diskID;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public Boolean getIsEncrypt() {
        return isEncrypt;
    }

    public void setIsEncrypt(Boolean isEncrypt) {
        this.isEncrypt = isEncrypt;
    }

    public String getDiskDataType() {
        return diskDataType;
    }

    public void setDiskDataType(String diskDataType) {
        this.diskDataType = diskDataType;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }
}
