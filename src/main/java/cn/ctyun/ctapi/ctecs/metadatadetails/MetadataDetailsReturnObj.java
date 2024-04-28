package cn.ctyun.ctapi.ctecs.metadatadetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机元数据查询>
 * Entity: MetadataDetailsReturnObj
 */
public class MetadataDetailsReturnObj {
    /**
     * metadata
     * 云主机元数据，未设置情况下元数据则返回{}
     */
    private Map<String, String> metadata;

    /**
     * set metadata
     * @param metadata 云主机元数据，未设置情况下元数据则返回{}
     * @return this
     */
    public MetadataDetailsReturnObj withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }
}
