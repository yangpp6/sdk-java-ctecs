package cn.ctyun.ctapi.ctecs.ecslitecreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <创建轻量型云主机>
 * Entity: EcsLiteCreateDisks
 */
public class EcsLiteCreateDisks {
    /**
     * diskName
     * 磁盘名称 ，长度2~63,不支持中文
     */
    private String diskName;
    /**
     * diskSize
     * 磁盘容量大小单位为GiB，取值范围：[10-32768]
     */
    private Integer diskSize;

    /**
     * set diskName
     * @param diskName 磁盘名称 ，长度2~63,不支持中文
     * @return this
     */
    public EcsLiteCreateDisks withDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }

    /**
     * set diskSize
     * @param diskSize 磁盘容量大小单位为GiB，取值范围：[10-32768]
     * @return this
     */
    public EcsLiteCreateDisks withDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }
}
