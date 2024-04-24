package cn.ctyun.ctapi.ctecs.ecslitedetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询轻量型云主机详情>
 * Entity: EcsLiteDetailsNetworkCard
 */
public class EcsLiteDetailsNetworkCard {
    /**
     * IPv4Address
     * IPv4地址
     */
    private String IPv4Address;
    /**
     * subnetID
     * 所处的子网ID
     */
    private String subnetID;

    /**
     * set IPv4Address
     * @param IPv4Address IPv4地址
     * @return this
     */
    public EcsLiteDetailsNetworkCard withIPv4Address(String IPv4Address) {
        this.IPv4Address = IPv4Address;
        return this;
    }

    /**
     * set subnetID
     * @param subnetID 所处的子网ID
     * @return this
     */
    public EcsLiteDetailsNetworkCard withSubnetID(String subnetID) {
        this.subnetID = subnetID;
        return this;
    }

    public String getIPv4Address() {
        return IPv4Address;
    }

    public void setIPv4Address(String IPv4Address) {
        this.IPv4Address = IPv4Address;
    }

    public String getSubnetID() {
        return subnetID;
    }

    public void setSubnetID(String subnetID) {
        this.subnetID = subnetID;
    }
}
