package cn.ctyun.ctapi.ctecs.ecsinstancelist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机列表>
 * Entity: EcsInstanceListVipInfoList
 */
public class EcsInstanceListVipInfoList {
    /**
     * vipID
     * 虚拟IP的ID
     */
    private String vipID;
    /**
     * vipAddress
     * 虚拟IP地址
     */
    private String vipAddress;
    /**
     * vipBindNicIP
     * 虚拟IP绑定的网卡对应IPv4
     */
    private String vipBindNicIP;
    /**
     * vipBindNicIPv6
     * 虚拟IP绑定的网卡对应IPv6
     */
    private String vipBindNicIPv6;
    /**
     * nicID
     * 网卡ID
     */
    private String nicID;

    /**
     * set vipID
     * @param vipID 虚拟IP的ID
     * @return this
     */
    public EcsInstanceListVipInfoList withVipID(String vipID) {
        this.vipID = vipID;
        return this;
    }

    /**
     * set vipAddress
     * @param vipAddress 虚拟IP地址
     * @return this
     */
    public EcsInstanceListVipInfoList withVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
        return this;
    }

    /**
     * set vipBindNicIP
     * @param vipBindNicIP 虚拟IP绑定的网卡对应IPv4
     * @return this
     */
    public EcsInstanceListVipInfoList withVipBindNicIP(String vipBindNicIP) {
        this.vipBindNicIP = vipBindNicIP;
        return this;
    }

    /**
     * set vipBindNicIPv6
     * @param vipBindNicIPv6 虚拟IP绑定的网卡对应IPv6
     * @return this
     */
    public EcsInstanceListVipInfoList withVipBindNicIPv6(String vipBindNicIPv6) {
        this.vipBindNicIPv6 = vipBindNicIPv6;
        return this;
    }

    /**
     * set nicID
     * @param nicID 网卡ID
     * @return this
     */
    public EcsInstanceListVipInfoList withNicID(String nicID) {
        this.nicID = nicID;
        return this;
    }

    public String getVipID() {
        return vipID;
    }

    public void setVipID(String vipID) {
        this.vipID = vipID;
    }

    public String getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
    }

    public String getVipBindNicIP() {
        return vipBindNicIP;
    }

    public void setVipBindNicIP(String vipBindNicIP) {
        this.vipBindNicIP = vipBindNicIP;
    }

    public String getVipBindNicIPv6() {
        return vipBindNicIPv6;
    }

    public void setVipBindNicIPv6(String vipBindNicIPv6) {
        this.vipBindNicIPv6 = vipBindNicIPv6;
    }

    public String getNicID() {
        return nicID;
    }

    public void setNicID(String nicID) {
        this.nicID = nicID;
    }
}