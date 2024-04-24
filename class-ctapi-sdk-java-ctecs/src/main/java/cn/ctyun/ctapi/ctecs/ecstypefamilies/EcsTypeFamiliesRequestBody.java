package cn.ctyun.ctapi.ctecs.ecstypefamilies;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机规格族列表>
 * Entity: EcsTypeFamiliesRequestBody
 */
public class EcsTypeFamiliesRequestBody {
    /**
     * regionID
     * 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     */
    private String regionID;
    /**
     * azName
     * 可用区名称。您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87">资源池可用区查询</a>获取可用区信息，查询结果中zoneList内返回存在可用区名称（即多a可用区，本字段填写实际可用区名称），若查询结果中zoneList为空（即为单可用区，本字段填写default）。
     */
    private String azName;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">查询账户启用的资源池信息</a>查看最新的天翼云资源池列表
     * @return this
     */
    public EcsTypeFamiliesRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称。您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87">资源池可用区查询</a>获取可用区信息，查询结果中zoneList内返回存在可用区名称（即多a可用区，本字段填写实际可用区名称），若查询结果中zoneList为空（即为单可用区，本字段填写default）。
     * @return this
     */
    public EcsTypeFamiliesRequestBody withAzName(String azName) {
        this.azName = azName;
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
}
