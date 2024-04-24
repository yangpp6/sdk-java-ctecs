package cn.ctyun.ctapi.ctecs.keypairattachinstance;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-密钥对绑定云主机>
 * Entity: KeypairAttachInstanceReturnObj
 */
public class KeypairAttachInstanceReturnObj {
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
    public KeypairAttachInstanceReturnObj withInstanceID(String instanceID) {
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
