package cn.ctyun.ctapi.ctecs.ecsbatchrebuild;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-重装多台云主机>
 * Entity: EcsBatchRebuildRequestBody
 */
public class EcsBatchRebuildRequestBody {
    /**
     * regionID
     * 资源池ID，您可以调用[regionID](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87)查看最新的天翼云资源池列表
     */
    private String regionID;
    /**
     * azName
     * 可用区名称，您可以调用获取[资源池信息](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87)，查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空(即为单可用区，本字段填写default)。
     */
    private String azName;
    /**
     * rebuildInfo
     * 重装信息
     */
    private EcsBatchRebuildRebuildInfo[] rebuildInfo;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以调用[regionID](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87)查看最新的天翼云资源池列表
     * @return this
     */
    public EcsBatchRebuildRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称，您可以调用获取[资源池信息](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87)，查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空(即为单可用区，本字段填写default)。
     * @return this
     */
    public EcsBatchRebuildRequestBody withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set rebuildInfo
     * @param rebuildInfo 重装信息
     * @return this
     */
    public EcsBatchRebuildRequestBody withRebuildInfo(EcsBatchRebuildRebuildInfo[] rebuildInfo) {
        this.rebuildInfo = rebuildInfo;
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

    public EcsBatchRebuildRebuildInfo[] getRebuildInfo() {
        return rebuildInfo;
    }

    public void setRebuildInfo(EcsBatchRebuildRebuildInfo[] rebuildInfo) {
        this.rebuildInfo = rebuildInfo;
    }
}
