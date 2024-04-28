package cn.ctyun.ctapi.ctecs.ecslitelist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询轻量型云主机列表>
 * Entity: EcsLiteListAddresses
 */
public class EcsLiteListAddresses {
    /**
     * addressList
     * 网络地址列表
     */
    private EcsLiteListAddressList[] addressList;

    /**
     * set addressList
     * @param addressList 网络地址列表
     * @return this
     */
    public EcsLiteListAddresses withAddressList(EcsLiteListAddressList[] addressList) {
        this.addressList = addressList;
        return this;
    }

    public EcsLiteListAddressList[] getAddressList() {
        return addressList;
    }

    public void setAddressList(EcsLiteListAddressList[] addressList) {
        this.addressList = addressList;
    }
}
