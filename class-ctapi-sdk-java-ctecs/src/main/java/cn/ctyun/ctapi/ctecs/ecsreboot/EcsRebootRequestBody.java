package cn.ctyun.ctapi.ctecs.ecsreboot;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-重启一台云主机>
 * Entity: EcsRebootRequestBody
 */
public class EcsRebootRequestBody {
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * azName
     * 可用区名称。您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8314&data=87">资源池可用区查询</a>，查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空(即为单可用区，本字段填写default)。
     */
    private String azName;
    /**
     * ID
     * 云主机ID
     */
    private String ID;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsRebootRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称。您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8314&data=87">资源池可用区查询</a>，查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空(即为单可用区，本字段填写default)。
     * @return this
     */
    public EcsRebootRequestBody withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set ID
     * @param ID 云主机ID
     * @return this
     */
    public EcsRebootRequestBody withID(String ID) {
        this.ID = ID;
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
}
