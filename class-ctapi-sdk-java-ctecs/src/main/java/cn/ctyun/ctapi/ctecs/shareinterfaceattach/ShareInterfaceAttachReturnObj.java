package cn.ctyun.ctapi.ctecs.shareinterfaceattach;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-挂载共享网卡>
 * Entity: ShareInterfaceAttachReturnObj
 */
public class ShareInterfaceAttachReturnObj {
    /**
     * nicID
     * 网卡ID
     */
    private String nicID;

    /**
     * set nicID
     * @param nicID 网卡ID
     * @return this
     */
    public ShareInterfaceAttachReturnObj withNicID(String nicID) {
        this.nicID = nicID;
        return this;
    }

    public String getNicID() {
        return nicID;
    }

    public void setNicID(String nicID) {
        this.nicID = nicID;
    }
}
