package cn.ctyun.ctapi.ctecs.ecsmetadatacreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机元数据创建>
 * Entity: EcsMetadataCreateReturnObj
 */
public class EcsMetadataCreateReturnObj {
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
     * set ID
     * @param ID 云主机ID
     * @return this
     */
    public EcsMetadataCreateReturnObj withID(String ID) {
        this.ID = ID;
        return this;
    }

    /**
     * set metadata
     * @param metadata 元数据信息
     * @return this
     */
    public EcsMetadataCreateReturnObj withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
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
