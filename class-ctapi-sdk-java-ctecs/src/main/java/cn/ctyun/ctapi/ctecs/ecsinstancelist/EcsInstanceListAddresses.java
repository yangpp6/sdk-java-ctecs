package cn.ctyun.ctapi.ctecs.ecsinstancelist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机列表>
 * Entity: EcsInstanceListAddresses
 */
public class EcsInstanceListAddresses {
    /**
     * vpcName
     * vpc名称
     */
    private String vpcName;
    /**
     * addressList
     * 网络地址列表
     */
    private EcsInstanceListAddressList[] addressList;

    /**
     * set vpcName
     * @param vpcName vpc名称
     * @return this
     */
    public EcsInstanceListAddresses withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * set addressList
     * @param addressList 网络地址列表
     * @return this
     */
    public EcsInstanceListAddresses withAddressList(EcsInstanceListAddressList[] addressList) {
        this.addressList = addressList;
        return this;
    }

    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public EcsInstanceListAddressList[] getAddressList() {
        return addressList;
    }

    public void setAddressList(EcsInstanceListAddressList[] addressList) {
        this.addressList = addressList;
    }
}
