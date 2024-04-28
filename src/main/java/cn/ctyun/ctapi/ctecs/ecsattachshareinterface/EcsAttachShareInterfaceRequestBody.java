package cn.ctyun.ctapi.ctecs.ecsattachshareinterface;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机添加共享网卡>
 * Entity: EcsAttachShareInterfaceRequestBody
 */
public class EcsAttachShareInterfaceRequestBody {
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * azName
     * 可用区名称。您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8314&data=87">资源池可用区查询</a>，若查询结果中zoneList为空(即为单可用区，本字段填写default)。
     */
    private String azName;
    /**
     * ID
     * 云主机实例ID
     */
    private String ID;
    /**
     * subnetID
     * vpc子网ID
     */
    private String subnetID;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsAttachShareInterfaceRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称。您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8314&data=87">资源池可用区查询</a>，若查询结果中zoneList为空(即为单可用区，本字段填写default)。
     * @return this
     */
    public EcsAttachShareInterfaceRequestBody withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set ID
     * @param ID 云主机实例ID
     * @return this
     */
    public EcsAttachShareInterfaceRequestBody withID(String ID) {
        this.ID = ID;
        return this;
    }

    /**
     * set subnetID
     * @param subnetID vpc子网ID
     * @return this
     */
    public EcsAttachShareInterfaceRequestBody withSubnetID(String subnetID) {
        this.subnetID = subnetID;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSubnetID() {
        return subnetID;
    }

    public void setSubnetID(String subnetID) {
        this.subnetID = subnetID;
    }
}
