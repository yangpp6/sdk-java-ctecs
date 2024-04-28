package cn.ctyun.ctapi.ctecs.ecsmetadataget;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机元数据查询>
 * Entity: EcsMetadataGetReturnObj
 */
public class EcsMetadataGetReturnObj {
    /**
     * spec_metadata
     * 云主机元数据
     */
    private Map<String, String> spec_metadata;

    /**
     * set spec_metadata
     * @param spec_metadata 云主机元数据
     * @return this
     */
    public EcsMetadataGetReturnObj withSpec_metadata(Map<String, String> spec_metadata) {
        this.spec_metadata = spec_metadata;
        return this;
    }

    public Map<String, String> getSpec_metadata() {
        return spec_metadata;
    }

    public void setSpec_metadata(Map<String, String> spec_metadata) {
        this.spec_metadata = spec_metadata;
    }
}
