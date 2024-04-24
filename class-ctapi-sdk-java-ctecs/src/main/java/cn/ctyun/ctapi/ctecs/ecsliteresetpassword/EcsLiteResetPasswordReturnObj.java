package cn.ctyun.ctapi.ctecs.ecsliteresetpassword;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <轻量型云主机修改密码>
 * Entity: EcsLiteResetPasswordReturnObj
 */
public class EcsLiteResetPasswordReturnObj {
    /**
     * instanceID
     * 被更新密码的云主机ID
     */
    private String instanceID;

    /**
     * set instanceID
     * @param instanceID 被更新密码的云主机ID
     * @return this
     */
    public EcsLiteResetPasswordReturnObj withInstanceID(String instanceID) {
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
