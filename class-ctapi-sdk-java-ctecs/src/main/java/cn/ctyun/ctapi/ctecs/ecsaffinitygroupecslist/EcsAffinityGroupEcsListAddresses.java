package cn.ctyun.ctapi.ctecs.ecsaffinitygroupecslist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机组内的云主机>
 * Entity: EcsAffinityGroupEcsListAddresses
 */
public class EcsAffinityGroupEcsListAddresses {
    /**
     * vpcName
     * vpc名称
     */
    private String vpcName;
    /**
     * addressList
     * 网络地址列表
     */
    private EcsAffinityGroupEcsListAddressList[] addressList;

    /**
     * set vpcName
     * @param vpcName vpc名称
     * @return this
     */
    public EcsAffinityGroupEcsListAddresses withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * set addressList
     * @param addressList 网络地址列表
     * @return this
     */
    public EcsAffinityGroupEcsListAddresses withAddressList(EcsAffinityGroupEcsListAddressList[] addressList) {
        this.addressList = addressList;
        return this;
    }

    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public EcsAffinityGroupEcsListAddressList[] getAddressList() {
        return addressList;
    }

    public void setAddressList(EcsAffinityGroupEcsListAddressList[] addressList) {
        this.addressList = addressList;
    }
}
