package cn.ctyun.ctapi.ctecs.descibeinstances;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询一台或多台云主机详细信息>
 * Entity: DescibeInstancesNetworkInfo
 */
public class DescibeInstancesNetworkInfo {
    /**
     * subnetID
     * 子网ID
     */
    private String subnetID;
    /**
     * ipAddress
     * IP地址
     */
    private String ipAddress;
    /**
     * boundType
     * 绑定类型
     */
    private Map<String, String> boundType;

    /**
     * set subnetID
     * @param subnetID 子网ID
     * @return this
     */
    public DescibeInstancesNetworkInfo withSubnetID(String subnetID) {
        this.subnetID = subnetID;
        return this;
    }

    /**
     * set ipAddress
     * @param ipAddress IP地址
     * @return this
     */
    public DescibeInstancesNetworkInfo withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * set boundType
     * @param boundType 绑定类型
     * @return this
     */
    public DescibeInstancesNetworkInfo withBoundType(Map<String, String> boundType) {
        this.boundType = boundType;
        return this;
    }

    public String getSubnetID() {
        return subnetID;
    }

    public void setSubnetID(String subnetID) {
        this.subnetID = subnetID;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Map<String, String> getBoundType() {
        return boundType;
    }

    public void setBoundType(Map<String, String> boundType) {
        this.boundType = boundType;
    }
}
