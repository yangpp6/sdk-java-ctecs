package cn.ctyun.ctapi.ctecs.ecsattachshareinterface;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机添加共享网卡>
 * Entity: EcsAttachShareInterfaceReturnObj
 */
public class EcsAttachShareInterfaceReturnObj {
    /**
     * portID
     * 创建的网卡ID
     */
    private String portID;

    /**
     * set portID
     * @param portID 创建的网卡ID
     * @return this
     */
    public EcsAttachShareInterfaceReturnObj withPortID(String portID) {
        this.portID = portID;
        return this;
    }

    public String getPortID() {
        return portID;
    }

    public void setPortID(String portID) {
        this.portID = portID;
    }
}
