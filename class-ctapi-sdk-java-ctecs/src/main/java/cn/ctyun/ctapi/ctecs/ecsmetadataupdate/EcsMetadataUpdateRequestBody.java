package cn.ctyun.ctapi.ctecs.ecsmetadataupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机元数据更新>
 * Entity: EcsMetadataUpdateRequestBody
 */
public class EcsMetadataUpdateRequestBody {
    /**
     * regionID
     * 资源池ID，您可以调用[regionID](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87)查看最新的天翼云资源池列表。
     */
    private String regionID;
    /**
     * ID
     * 云主机ID
     */
    private String ID;
    /**
     * metadata
     * 元数据信息
     */
    private Map<String, String> metadata;
    /**
     * isForce
     * 是否覆盖原有的元数据信息，缺省为不覆盖
     */
    private Boolean isForce;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以调用[regionID](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87)查看最新的天翼云资源池列表。
     * @return this
     */
    public EcsMetadataUpdateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set ID
     * @param ID 云主机ID
     * @return this
     */
    public EcsMetadataUpdateRequestBody withID(String ID) {
        this.ID = ID;
        return this;
    }

    /**
     * set metadata
     * @param metadata 元数据信息
     * @return this
     */
    public EcsMetadataUpdateRequestBody withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * set isForce
     * @param isForce 是否覆盖原有的元数据信息，缺省为不覆盖
     * @return this
     */
    public EcsMetadataUpdateRequestBody withIsForce(Boolean isForce) {
        this.isForce = isForce;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public Boolean getIsForce() {
        return isForce;
    }

    public void setIsForce(Boolean isForce) {
        this.isForce = isForce;
    }
}
