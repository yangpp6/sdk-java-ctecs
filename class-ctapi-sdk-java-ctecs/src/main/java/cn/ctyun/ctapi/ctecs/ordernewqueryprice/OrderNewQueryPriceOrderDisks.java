package cn.ctyun.ctapi.ctecs.ordernewqueryprice;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-新订单询价>
 * Entity: OrderNewQueryPriceOrderDisks
 */
public class OrderNewQueryPriceOrderDisks {
    /**
     * diskType
     * 磁盘类型(SAS:高IO,SATA:普通IO,SSD:超高IO,SSD-genric:通用型SSD,FAST-SSD:极速型SSD)
     */
    private String diskType;
    /**
     * diskSize
     * 磁盘大小
     */
    private Integer diskSize;

    /**
     * set diskType
     * @param diskType 磁盘类型(SAS:高IO,SATA:普通IO,SSD:超高IO,SSD-genric:通用型SSD,FAST-SSD:极速型SSD)
     * @return this
     */
    public OrderNewQueryPriceOrderDisks withDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * set diskSize
     * @param diskSize 磁盘大小
     * @return this
     */
    public OrderNewQueryPriceOrderDisks withDiskSize(Integer diskSize) {
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
