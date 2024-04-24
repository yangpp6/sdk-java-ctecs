package cn.ctyun.ctapi.ctecs.ecsbatchnew;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量创建按量付费或者包年包月云主机>
 * Entity: EcsBatchNewDisks
 */
public class EcsBatchNewDisks {
    /**
     * diskMode
     * 云硬盘属性，取值范围: [FCSAN、ISCSI、VBD]，默认值为VBD
     */
    private String diskMode;
    /**
     * title
     * 磁盘名称 ，长度2~63,不支持中文
     */
    private String title;
    /**
     * type
     * 云硬盘类型，取值范围：<br />SATA：普通IO，<br />SAS：高IO，<br />SSD：超高IO，<br />SSD-genric：通用型SSD，<br />FAST-SSD：极速型SSD
     */
    private String type;
    /**
     * size
     * 磁盘容量大小单位为GiB，取值范围[10-32768]
     */
    private Integer size;

    /**
     * set diskMode
     * @param diskMode 云硬盘属性，取值范围: [FCSAN、ISCSI、VBD]，默认值为VBD
     * @return this
     */
    public EcsBatchNewDisks withDiskMode(String diskMode) {
        this.diskMode = diskMode;
        return this;
    }

    /**
     * set title
     * @param title 磁盘名称 ，长度2~63,不支持中文
     * @return this
     */
    public EcsBatchNewDisks withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * set type
     * @param type 云硬盘类型，取值范围：<br />SATA：普通IO，<br />SAS：高IO，<br />SSD：超高IO，<br />SSD-genric：通用型SSD，<br />FAST-SSD：极速型SSD
     * @return this
     */
    public EcsBatchNewDisks withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * set size
     * @param size 磁盘容量大小单位为GiB，取值范围[10-32768]
     * @return this
     */
    public EcsBatchNewDisks withSize(Integer size) {
        this.size = size;
        return this;
    }

    public String getDiskMode() {
        return diskMode;
    }

    public void setDiskMode(String diskMode) {
        this.diskMode = diskMode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
