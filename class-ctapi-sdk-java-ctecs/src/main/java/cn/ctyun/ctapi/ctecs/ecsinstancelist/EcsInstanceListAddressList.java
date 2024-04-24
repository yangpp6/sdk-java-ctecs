package cn.ctyun.ctapi.ctecs.ecsinstancelist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机列表>
 * Entity: EcsInstanceListAddressList
 */
public class EcsInstanceListAddressList {
    /**
     * addr
     * IP地址
     */
    private String addr;
    /**
     * version
     * IP版本
     */
    private Integer version;
    /**
     * type
     * 网络类型，取值范围：<br />fixed：内网，<br />floating：公网
     */
    private String type;

    /**
     * set addr
     * @param addr IP地址
     * @return this
     */
    public EcsInstanceListAddressList withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * set version
     * @param version IP版本
     * @return this
     */
    public EcsInstanceListAddressList withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * set type
     * @param type 网络类型，取值范围：<br />fixed：内网，<br />floating：公网
     * @return this
     */
    public EcsInstanceListAddressList withType(String type) {
        this.type = type;
        return this;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
