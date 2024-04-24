package cn.ctyun.ctapi.ctecs.ecskeypairattach;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-绑定SSH密钥对到云主机>
 * Entity: EcsKeypairAttachReturnObj
 */
public class EcsKeypairAttachReturnObj {
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
    public EcsKeypairAttachReturnObj withID(String ID) {
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
