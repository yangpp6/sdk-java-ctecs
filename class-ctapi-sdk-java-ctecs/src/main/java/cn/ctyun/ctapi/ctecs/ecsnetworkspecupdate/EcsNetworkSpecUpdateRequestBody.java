package cn.ctyun.ctapi.ctecs.ecsnetworkspecupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机修改带宽>
 * Entity: EcsNetworkSpecUpdateRequestBody
 */
public class EcsNetworkSpecUpdateRequestBody {
    /**
     * regionID
     * 资源池ID。
     */
    private String regionID;
    /**
     * azName
     * 可用区名称。您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8314&data=87">资源池可用区查询</a>，查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空(即为单可用区，本字段填写default)。
     */
    private String azName;
    /**
     * ID
     * 云主机ID。
     */
    private String ID;
    /**
     * bandWidth
     * 带宽大小单位为Mbit/s，取值范围:[1~2000]，默认值为100。
     */
    private Integer bandWidth;
    /**
     * clientToken
     * 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     */
    private String clientToken;

    /**
     * set regionID
     * @param regionID 资源池ID。
     * @return this
     */
    public EcsNetworkSpecUpdateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称。您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8314&data=87">资源池可用区查询</a>，查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空(即为单可用区，本字段填写default)。
     * @return this
     */
    public EcsNetworkSpecUpdateRequestBody withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set ID
     * @param ID 云主机ID。
     * @return this
     */
    public EcsNetworkSpecUpdateRequestBody withID(String ID) {
        this.ID = ID;
        return this;
    }

    /**
     * set bandWidth
     * @param bandWidth 带宽大小单位为Mbit/s，取值范围:[1~2000]，默认值为100。
     * @return this
     */
    public EcsNetworkSpecUpdateRequestBody withBandWidth(Integer bandWidth) {
        this.bandWidth = bandWidth;
        return this;
    }

    /**
     * set clientToken
     * @param clientToken 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     * @return this
     */
    public EcsNetworkSpecUpdateRequestBody withClientToken(String clientToken) {
        this.clientToken = clientToken;
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

    public Integer getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(Integer bandWidth) {
        this.bandWidth = bandWidth;
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
}
