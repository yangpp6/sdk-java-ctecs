package cn.ctyun.ctapi.ctecs.ecspasswordupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-更新云主机密码>
 * Entity: EcsPasswordUpdateReturnObj
 */
public class EcsPasswordUpdateReturnObj {
    /**
     * ID
     * 被更新密码的云主机ID
     */
    private String ID;

    /**
     * set ID
     * @param ID 被更新密码的云主机ID
     * @return this
     */
    public EcsPasswordUpdateReturnObj withID(String ID) {
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
