package cn.ctyun.ctapi.ctecs.updateinstance;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-更新云主机>
 * Entity: UpdateInstanceReturnObj
 */
public class UpdateInstanceReturnObj {
    /**
     * instanceID
     * 被更新名称的云主机ID
     */
    private String instanceID;
    /**
     * displayName
     * 更新后的云主机名称
     */
    private String displayName;

    /**
     * set instanceID
     * @param instanceID 被更新名称的云主机ID
     * @return this
     */
    public UpdateInstanceReturnObj withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set displayName
     * @param displayName 更新后的云主机名称
     * @return this
     */
    public UpdateInstanceReturnObj withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
