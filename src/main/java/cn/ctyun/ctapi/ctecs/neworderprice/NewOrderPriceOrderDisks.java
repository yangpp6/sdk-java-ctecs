package cn.ctyun.ctapi.ctecs.neworderprice;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-下单询价>
 * Entity: NewOrderPriceOrderDisks
 */
public class NewOrderPriceOrderDisks {
    /**
     * diskType
     * 磁盘类型
     */
    private String diskType;
    /**
     * diskSize
     * 磁盘大小
     */
    private Integer diskSize;

    /**
     * set diskType
     * @param diskType 磁盘类型
     * @return this
     */
    public NewOrderPriceOrderDisks withDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * set diskSize
     * @param diskSize 磁盘大小
     * @return this
     */
    public NewOrderPriceOrderDisks withDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
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
