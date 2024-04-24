package cn.ctyun.ctapi.ctecs.ecsmetadatadelete;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机元数据删除>
 * Entity: EcsMetadataDeleteReturnObj
 */
public class EcsMetadataDeleteReturnObj {
    /**
     * ID
     * 云主机ID
     */
    private String ID;

    /**
     * set ID
     * @param ID 云主机ID
     * @return this
     */
    public EcsMetadataDeleteReturnObj withID(String ID) {
        this.ID = ID;
        return this;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
