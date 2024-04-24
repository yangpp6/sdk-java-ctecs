package cn.ctyun.ctapi.ctecs.fixediplist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机的固定IP>
 * Entity: FixedIpListReturnObj
 */
public class FixedIpListReturnObj {
    /**
     * fixedIPList
     * 固定IP列表
     */
    private String[] fixedIPList;

    /**
     * set fixedIPList
     * @param fixedIPList 固定IP列表
     * @return this
     */
    public FixedIpListReturnObj withFixedIPList(String[] fixedIPList) {
        this.fixedIPList = fixedIPList;
        return this;
    }

    public String[] getFixedIPList() {
        return fixedIPList;
    }

    public void setFixedIPList(String[] fixedIPList) {
        this.fixedIPList = fixedIPList;
    }
}
