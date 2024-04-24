package cn.ctyun.ctapi.ctecs.createmetadata;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建云主机元数据>
 * Entity: CreateMetadataReturnObj
 */
public class CreateMetadataReturnObj {
    /**
     * instanceID
     * 云主机ID
     */
    private String instanceID;
    /**
     * metadata
     * 元数据信息
     */
    private Map<String, String> metadata;

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public CreateMetadataReturnObj withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set metadata
     * @param metadata 元数据信息
     * @return this
     */
    public CreateMetadataReturnObj withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }
}
