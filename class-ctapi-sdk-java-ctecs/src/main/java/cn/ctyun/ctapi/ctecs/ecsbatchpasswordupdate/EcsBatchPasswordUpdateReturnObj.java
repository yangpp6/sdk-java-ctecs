package cn.ctyun.ctapi.ctecs.ecsbatchpasswordupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-更新多台云主机的密码>
 * Entity: EcsBatchPasswordUpdateReturnObj
 */
public class EcsBatchPasswordUpdateReturnObj {
    /**
     * instanceIDList
     * 被更新密码的云主机ID列表，使用英文逗号分割
     */
    private String instanceIDList;

    /**
     * set instanceIDList
     * @param instanceIDList 被更新密码的云主机ID列表，使用英文逗号分割
     * @return this
     */
    public EcsBatchPasswordUpdateReturnObj withInstanceIDList(String instanceIDList) {
        this.instanceIDList = instanceIDList;
        return this;
    }

    public String getInstanceIDList() {
        return instanceIDList;
    }

    public void setInstanceIDList(String instanceIDList) {
        this.instanceIDList = instanceIDList;
    }
}
