package cn.ctyun.ctapi.ctecs.ecsupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-更新云主机的部分信息>
 * Entity: EcsUpdateReturnObj
 */
public class EcsUpdateReturnObj {
    /**
     * ID
     * 被更新名称的云主机ID
     */
    private String ID;
    /**
     * displayName
     * 更新后的云主机名称
     */
    private String displayName;

    /**
     * set ID
     * @param ID 被更新名称的云主机ID
     * @return this
     */
    public EcsUpdateReturnObj withID(String ID) {
        this.ID = ID;
        return this;
    }

    /**
     * set displayName
     * @param displayName 更新后的云主机名称
     * @return this
     */
    public EcsUpdateReturnObj withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
