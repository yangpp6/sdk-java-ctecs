package cn.ctyun.ctapi.ctecs.deletemetadata;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机元数据删除>
 * Entity: DeleteMetadataReturnObj
 */
public class DeleteMetadataReturnObj {
    /**
     * instanceID
     * 云主机ID
     */
    private String instanceID;

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public DeleteMetadataReturnObj withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }
}
