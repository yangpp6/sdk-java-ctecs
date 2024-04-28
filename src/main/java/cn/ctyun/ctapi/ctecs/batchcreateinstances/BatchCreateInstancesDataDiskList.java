package cn.ctyun.ctapi.ctecs.batchcreateinstances;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量创建云主机>
 * Entity: BatchCreateInstancesDataDiskList
 */
public class BatchCreateInstancesDataDiskList {
    /**
     * diskMode
     * 云硬盘属性，取值范围：<br />FCSAN（光纤通道协议的SAN网络），<br />ISCSI（小型计算机系统接口），<br />VBD（虚拟块存储设备）<br />您可以查看<a href="https://www.ctyun.cn/document/10027696/10162960">磁盘模式及使用方法</a><br />注：默认为VBD
     */
    private String diskMode;
    /**
     * diskName
     * 云硬盘名称，长度限制2~63字符，不支持中文
     */
    private String diskName;
    /**
     * diskType
     * 云硬盘类型，取值范围：<br />SATA（普通IO），<br />SAS（高IO），<br />SSD（超高IO），<br />SSD-genric（通用型SSD），<br />FAST-SSD（极速型SSD）<br />您可以查看<a href="https://www.ctyun.cn/document/10027696/10162918">磁盘类型及性能介绍</a>磁盘类型相关信息
     */
    private String diskType;
    /**
     * diskSize
     * 磁盘容量，单位为GB，取值范围：[10, 32768]
     */
    private Integer diskSize;

    /**
     * set diskMode
     * @param diskMode 云硬盘属性，取值范围：<br />FCSAN（光纤通道协议的SAN网络），<br />ISCSI（小型计算机系统接口），<br />VBD（虚拟块存储设备）<br />您可以查看<a href="https://www.ctyun.cn/document/10027696/10162960">磁盘模式及使用方法</a><br />注：默认为VBD
     * @return this
     */
    public BatchCreateInstancesDataDiskList withDiskMode(String diskMode) {
        this.diskMode = diskMode;
        return this;
    }

    /**
     * set diskName
     * @param diskName 云硬盘名称，长度限制2~63字符，不支持中文
     * @return this
     */
    public BatchCreateInstancesDataDiskList withDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }

    /**
     * set diskType
     * @param diskType 云硬盘类型，取值范围：<br />SATA（普通IO），<br />SAS（高IO），<br />SSD（超高IO），<br />SSD-genric（通用型SSD），<br />FAST-SSD（极速型SSD）<br />您可以查看<a href="https://www.ctyun.cn/document/10027696/10162918">磁盘类型及性能介绍</a>磁盘类型相关信息
     * @return this
     */
    public BatchCreateInstancesDataDiskList withDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * set diskSize
     * @param diskSize 磁盘容量，单位为GB，取值范围：[10, 32768]
     * @return this
     */
    public BatchCreateInstancesDataDiskList withDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    public String getDiskMode() {
        return diskMode;
    }

    public void setDiskMode(String diskMode) {
        this.diskMode = diskMode;
    }

    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }
}
