package cn.ctyun.ctapi.ctecs.ecsdisklist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机的云硬盘列表>
 * Entity: EcsDiskListResults
 */
public class EcsDiskListResults {
    /**
     * diskMode
     * 云硬盘属性，取值范围: [FCSAN、ISCSI、VBD]
     */
    private String diskMode;
    /**
     * dickID
     * 云硬盘ID，推荐使用diskID，该字段将在后续进行逐步下线处理
     */
    private String dickID;
    /**
     * diskID
     * 云硬盘ID
     */
    private String diskID;
    /**
     * diskType
     * 云硬盘类型，取值范围: <br />data：数据盘, 系统盘，默认值为data
     */
    private String diskType;
    /**
     * encrypted
     * 云硬盘加密标志，取值范围：<br />true：加密，<br />false：不加密
     */
    private Boolean encrypted;
    /**
     * type
     * 表示云硬盘类型，取值范围：<br />SATA：普通IO，<br />SAS：高IO，<br />SSD：超高IO，<br />SSD-genric：通用型SSD，<br />FAST-SSD：极速型SSD
     */
    private String type;
    /**
     * diskSize
     * 云硬盘容量，单位GB
     */
    private Integer diskSize;

    /**
     * set diskMode
     * @param diskMode 云硬盘属性，取值范围: [FCSAN、ISCSI、VBD]
     * @return this
     */
    public EcsDiskListResults withDiskMode(String diskMode) {
        this.diskMode = diskMode;
        return this;
    }

    /**
     * set dickID
     * @param dickID 云硬盘ID，推荐使用diskID，该字段将在后续进行逐步下线处理
     * @return this
     */
    public EcsDiskListResults withDickID(String dickID) {
        this.dickID = dickID;
        return this;
    }

    /**
     * set diskID
     * @param diskID 云硬盘ID
     * @return this
     */
    public EcsDiskListResults withDiskID(String diskID) {
        this.diskID = diskID;
        return this;
    }

    /**
     * set diskType
     * @param diskType 云硬盘类型，取值范围: <br />data：数据盘, 系统盘，默认值为data
     * @return this
     */
    public EcsDiskListResults withDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * set encrypted
     * @param encrypted 云硬盘加密标志，取值范围：<br />true：加密，<br />false：不加密
     * @return this
     */
    public EcsDiskListResults withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * set type
     * @param type 表示云硬盘类型，取值范围：<br />SATA：普通IO，<br />SAS：高IO，<br />SSD：超高IO，<br />SSD-genric：通用型SSD，<br />FAST-SSD：极速型SSD
     * @return this
     */
    public EcsDiskListResults withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * set diskSize
     * @param diskSize 云硬盘容量，单位GB
     * @return this
     */
    public EcsDiskListResults withDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    public String getDiskMode() {
        return diskMode;
    }

    public void setDiskMode(String diskMode) {
        this.diskMode = diskMode;
    }

    public String getDickID() {
        return dickID;
    }

    public void setDickID(String dickID) {
        this.dickID = dickID;
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

    public Boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }
}
