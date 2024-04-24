package cn.ctyun.ctapi.ctecs.backupvmdetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机备份查询虚机>
 * Entity: BackupVmDetailsAddresses
 */
public class BackupVmDetailsAddresses {
    /**
     * vpcName
     * vpc名称
     */
    private String vpcName;
    /**
     * addressList
     * 网络地址列表
     */
    private BackupVmDetailsAddressList[] addressList;

    /**
     * set vpcName
     * @param vpcName vpc名称
     * @return this
     */
    public BackupVmDetailsAddresses withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * set addressList
     * @param addressList 网络地址列表
     * @return this
     */
    public BackupVmDetailsAddresses withAddressList(BackupVmDetailsAddressList[] addressList) {
        this.addressList = addressList;
        return this;
    }

    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public BackupVmDetailsAddressList[] getAddressList() {
        return addressList;
    }

    public void setAddressList(BackupVmDetailsAddressList[] addressList) {
        this.addressList = addressList;
    }
}
