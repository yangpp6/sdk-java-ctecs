package cn.ctyun.ctapi.ctecs.ecsmetadatacreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机元数据创建>
 * Entity: EcsMetadataCreateRequestBody
 */
public class EcsMetadataCreateRequestBody {
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
     * set regionID
     * @param regionID 资源池ID，您可以调用[regionID](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87)查看最新的天翼云资源池列表。
     * @return this
     */
    public EcsMetadataCreateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set ID
     * @param ID 云主机ID
     * @return this
     */
    public EcsMetadataCreateRequestBody withID(String ID) {
        this.ID = ID;
        return this;
    }

    /**
     * set metadata
     * @param metadata 元数据信息
     * @return this
     */
    public EcsMetadataCreateRequestBody withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
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
}
