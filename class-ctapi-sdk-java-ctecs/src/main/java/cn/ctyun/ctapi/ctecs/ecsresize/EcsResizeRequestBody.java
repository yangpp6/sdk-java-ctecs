package cn.ctyun.ctapi.ctecs.ecsresize;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机修改规格>
 * Entity: EcsResizeRequestBody
 */
public class EcsResizeRequestBody {
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * azName
     * 可用区名称。您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8314&data=87">资源池可用区查询</a>，若查询结果中zoneList为空(即为单可用区，本字段填写default)。多可用区必填
     */
    private String azName;
    /**
     * ID
     * 云主机ID
     */
    private String ID;
    /**
     * flavorID
     * 目标规格ID或名称
     */
    private String flavorID;
    /**
     * clientToken
     * 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     */
    private String clientToken;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsResizeRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称。您可以调用<a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8314&data=87">资源池可用区查询</a>，若查询结果中zoneList为空(即为单可用区，本字段填写default)。多可用区必填
     * @return this
     */
    public EcsResizeRequestBody withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set ID
     * @param ID 云主机ID
     * @return this
     */
    public EcsResizeRequestBody withID(String ID) {
        this.ID = ID;
        return this;
    }

    /**
     * set flavorID
     * @param flavorID 目标规格ID或名称
     * @return this
     */
    public EcsResizeRequestBody withFlavorID(String flavorID) {
        this.flavorID = flavorID;
        return this;
    }

    /**
     * set clientToken
     * @param clientToken 客户端存根，用于保证订单幂等性。要求单个云平台账户内唯一，使用同一个ClientToken值，其他请求参数相同时，则代表为同一个请求。保留时间为24小时
     * @return this
     */
    public EcsResizeRequestBody withClientToken(String clientToken) {
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

    public String getFlavorID() {
        return flavorID;
    }

    public void setFlavorID(String flavorID) {
        this.flavorID = flavorID;
    }

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
}
