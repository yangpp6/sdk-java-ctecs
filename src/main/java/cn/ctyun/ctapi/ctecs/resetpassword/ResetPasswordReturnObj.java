package cn.ctyun.ctapi.ctecs.resetpassword;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-重置云主机密码>
 * Entity: ResetPasswordReturnObj
 */
public class ResetPasswordReturnObj {
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
    public ResetPasswordReturnObj withInstanceID(String instanceID) {
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
