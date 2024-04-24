package cn.ctyun.ctapi.ctecs.listinstances;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机列表>
 * Entity: ListInstancesAddresses
 */
public class ListInstancesAddresses {
    /**
     * vpcName
     * vpc名称
     */
    private String vpcName;
    /**
     * addressList
     * 网络地址列表
     */
    private ListInstancesAddressList[] addressList;

    /**
     * set vpcName
     * @param vpcName vpc名称
     * @return this
     */
    public ListInstancesAddresses withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * set addressList
     * @param addressList 网络地址列表
     * @return this
     */
    public ListInstancesAddresses withAddressList(ListInstancesAddressList[] addressList) {
        this.addressList = addressList;
        return this;
    }

    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public ListInstancesAddressList[] getAddressList() {
        return addressList;
    }

    public void setAddressList(ListInstancesAddressList[] addressList) {
        this.addressList = addressList;
    }
}
