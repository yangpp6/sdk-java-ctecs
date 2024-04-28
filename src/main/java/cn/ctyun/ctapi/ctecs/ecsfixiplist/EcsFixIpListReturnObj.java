package cn.ctyun.ctapi.ctecs.ecsfixiplist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机的固定IP列表>
 * Entity: EcsFixIpListReturnObj
 */
public class EcsFixIpListReturnObj {
    /**
     * fixedIPList
     * 内网IP列表，以逗号分割。
     */
    private String fixedIPList;

    /**
     * set fixedIPList
     * @param fixedIPList 内网IP列表，以逗号分割。
     * @return this
     */
    public EcsFixIpListReturnObj withFixedIPList(String fixedIPList) {
        this.fixedIPList = fixedIPList;
        return this;
    }

    public String getFixedIPList() {
        return fixedIPList;
    }

    public void setFixedIPList(String fixedIPList) {
        this.fixedIPList = fixedIPList;
    }
}
