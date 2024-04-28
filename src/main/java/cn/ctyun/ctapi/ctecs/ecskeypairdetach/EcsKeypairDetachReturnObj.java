package cn.ctyun.ctapi.ctecs.ecskeypairdetach;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-为Linux云主机解绑SSH密钥对>
 * Entity: EcsKeypairDetachReturnObj
 */
public class EcsKeypairDetachReturnObj {
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
    public EcsKeypairDetachReturnObj withID(String ID) {
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
