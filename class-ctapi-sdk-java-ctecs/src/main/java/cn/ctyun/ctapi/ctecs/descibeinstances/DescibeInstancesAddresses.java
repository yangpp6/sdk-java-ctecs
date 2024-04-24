package cn.ctyun.ctapi.ctecs.descibeinstances;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询一台或多台云主机详细信息>
 * Entity: DescibeInstancesAddresses
 */
public class DescibeInstancesAddresses {
    /**
     * vpcName
     * vpc名称
     */
    private String vpcName;
    /**
     * addressList
     * 网络地址列表
     */
    private DescibeInstancesAddressList[] addressList;

    /**
     * set vpcName
     * @param vpcName vpc名称
     * @return this
     */
    public DescibeInstancesAddresses withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * set addressList
     * @param addressList 网络地址列表
     * @return this
     */
    public DescibeInstancesAddresses withAddressList(DescibeInstancesAddressList[] addressList) {
        this.addressList = addressList;
        return this;
    }

    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public DescibeInstancesAddressList[] getAddressList() {
        return addressList;
    }

    public void setAddressList(DescibeInstancesAddressList[] addressList) {
        this.addressList = addressList;
    }
}
