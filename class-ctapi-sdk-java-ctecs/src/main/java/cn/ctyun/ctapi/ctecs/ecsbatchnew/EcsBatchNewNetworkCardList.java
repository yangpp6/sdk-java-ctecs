package cn.ctyun.ctapi.ctecs.ecsbatchnew;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量创建按量付费或者包年包月云主机>
 * Entity: EcsBatchNewNetworkCardList
 */
public class EcsBatchNewNetworkCardList {
    /**
     * title
     * 长度2~32，支持拉丁字母、中文、数字、下划线、连字符，中文或英文字母开头，不能以http:或https:开头
     */
    private String title;
    /**
     * fixedIP
     * 内网IPv4地址
     */
    private String fixedIP;
    /**
     * master
     * 是否主网卡，取值范围：<br />true：主网卡，<br />false：扩展网卡
     */
    private Boolean master;
    /**
     * subnetID
     * 子网ID
     */
    private String subnetID;

    /**
     * set title
     * @param title 长度2~32，支持拉丁字母、中文、数字、下划线、连字符，中文或英文字母开头，不能以http:或https:开头
     * @return this
     */
    public EcsBatchNewNetworkCardList withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * set fixedIP
     * @param fixedIP 内网IPv4地址
     * @return this
     */
    public EcsBatchNewNetworkCardList withFixedIP(String fixedIP) {
        this.fixedIP = fixedIP;
        return this;
    }

    /**
     * set master
     * @param master 是否主网卡，取值范围：<br />true：主网卡，<br />false：扩展网卡
     * @return this
     */
    public EcsBatchNewNetworkCardList withMaster(Boolean master) {
        this.master = master;
        return this;
    }

    /**
     * set subnetID
     * @param subnetID 子网ID
     * @return this
     */
    public EcsBatchNewNetworkCardList withSubnetID(String subnetID) {
        this.subnetID = subnetID;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFixedIP() {
        return fixedIP;
    }

    public void setFixedIP(String fixedIP) {
        this.fixedIP = fixedIP;
    }

    public Boolean getMaster() {
        return master;
    }

    public void setMaster(Boolean master) {
        this.master = master;
    }

    public String getSubnetID() {
        return subnetID;
    }

    public void setSubnetID(String subnetID) {
        this.subnetID = subnetID;
    }
}
