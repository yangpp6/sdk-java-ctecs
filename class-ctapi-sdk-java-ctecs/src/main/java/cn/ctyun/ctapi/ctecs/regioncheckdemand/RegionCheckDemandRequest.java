package cn.ctyun.ctapi.ctecs.regioncheckdemand;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.ctyun.ctapi.CTRequest;
import cn.ctyun.ctapi.CTFile;

/**
 * <一类节点-*-云主机ctecs-查询资源池产品可售信息>
 * Request: RegionCheckDemandRequest
 */
public class RegionCheckDemandRequest extends CTRequest {
    public RegionCheckDemandRequest() {
        super("GET", "application/json", "/v4/region/check-demand");
    }

    /**
     * <Query param> set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public RegionCheckDemandRequest withRegionID(String regionID) {
        queryParam.put("regionID", regionID);
        return this;
    }

    /**
     * <Query param> set azName
     * @param azName 可用区名称(云主机规格资源池4.0区分az)
     * @return this
     */
    public RegionCheckDemandRequest withAzName(String azName) {
        queryParam.put("azName", azName);
        return this;
    }

    /**
     * <Query param> set productType
     * @param productType 产品类型 可选值：ecs:云主机,eip:IP,ebs:磁盘
     * @return this
     */
    public RegionCheckDemandRequest withProductType(String productType) {
        queryParam.put("productType", productType);
        return this;
    }

    /**
     * <Query param> set flavorID
     * @param flavorID productType为ecs时传，云主机规格ID（获取规格列表/v4/common/get-ecs-flavors，取flavorID或specName）
     * @return this
     */
    public RegionCheckDemandRequest withFlavorID(String flavorID) {
        queryParam.put("flavorID", flavorID);
        return this;
    }

    /**
     * <Query param> set specName
     * @param specName productType为ecs时传，主机规格名称（specName和flavorID可二选一，都传以flavorID为准，获取规格列表/v4/common/get-ecs-flavors，取specName）
     * @return this
     */
    public RegionCheckDemandRequest withSpecName(String specName) {
        queryParam.put("specName", specName);
        return this;
    }

    /**
     * <Query param> set ecsAmount
     * @param ecsAmount productType为ecs时传，云主机需求量（可选，不传默认为1）
     * @return this
     */
    public RegionCheckDemandRequest withEcsAmount(Integer ecsAmount) {
        queryParam.put("ecsAmount", ecsAmount);
        return this;
    }

    /**
     * <Query param> set ebsType
     * @param ebsType productType为ebs时传，磁盘类型： SATA/SAS/SSD/SATA-KUNPENG/SATA-HAIGUANG/SAS-KUNPENG/SAS-HAIGUANG/SSD-genric
     * @return this
     */
    public RegionCheckDemandRequest withEbsType(String ebsType) {
        queryParam.put("ebsType", ebsType);
        return this;
    }

    /**
     * <Query param> set ebsSize
     * @param ebsSize productType为ebs时传，磁盘大小
     * @return this
     */
    public RegionCheckDemandRequest withEbsSize(Integer ebsSize) {
        queryParam.put("ebsSize", ebsSize);
        return this;
    }

    /**
     * <Query param> set eipAmount
     * @param eipAmount productType为eip时传，IP需求量（可选，不传默认为1）
     * @return this
     */
    public RegionCheckDemandRequest withEipAmount(Integer eipAmount) {
        queryParam.put("eipAmount", eipAmount);
        return this;
    }
}
