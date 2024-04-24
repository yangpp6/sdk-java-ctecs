package cn.ctyun.ctapi.ctecs.ecslitedetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询轻量型云主机详情>
 * Entity: EcsLiteDetailsAddresses
 */
public class EcsLiteDetailsAddresses {
    /**
     * addressList
     * 网络地址列表
     */
    private EcsLiteDetailsAddressList[] addressList;

    /**
     * set addressList
     * @param addressList 网络地址列表
     * @return this
     */
    public EcsLiteDetailsAddresses withAddressList(EcsLiteDetailsAddressList[] addressList) {
        this.addressList = addressList;
        return this;
    }

    public EcsLiteDetailsAddressList[] getAddressList() {
        return addressList;
    }

    public void setAddressList(EcsLiteDetailsAddressList[] addressList) {
        this.addressList = addressList;
    }
}
