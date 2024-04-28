package cn.ctyun.ctapi.ctecs.ecslitedetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询轻量型云主机详情>
 * Entity: EcsLiteDetailsAddressList
 */
public class EcsLiteDetailsAddressList {
    /**
     * addr
     * 地址
     */
    private String addr;
    /**
     * version
     * IP版本
     */
    private Integer version;
    /**
     * type
     * 网络类型
     */
    private String type;

    /**
     * set addr
     * @param addr 地址
     * @return this
     */
    public EcsLiteDetailsAddressList withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * set version
     * @param version IP版本
     * @return this
     */
    public EcsLiteDetailsAddressList withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * set type
     * @param type 网络类型
     * @return this
     */
    public EcsLiteDetailsAddressList withType(String type) {
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
